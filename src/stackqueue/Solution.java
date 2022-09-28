package stackqueue;



import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] day = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            if((100  - progresses[i]) % speeds[i] == 0 ){
                day[i] =  (100  - progresses[i]) / speeds[i];
            } else {
                day[i] =  (100  - progresses[i]) / speeds[i] + 1;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 0; i < day.length; i++) {
            if (i == 0) {
                list.add(day[i]);
            } else if (day[i] <= list.get(0)) {
                list.add(day[i]);
            } else {
                ans.add(list.size());
                list.clear();
                list.add(day[i]);
            }
        }
        ans.add(list.size());


        System.out.println(Arrays.toString(day));
        int[] answer = new int[ans.size()];
        for (int i = 0; i<ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }




    public static void main(String[] args) {
        int[] p = {93, 30, 55};
        int[] s = {1, 30, 5};
        N3 sol = new N3();
        System.out.println(Arrays.toString(sol.solution(p, s)));

    }
}