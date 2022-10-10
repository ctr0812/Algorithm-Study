package programmars.stackqueue;

import java.util.ArrayList;
import java.util.Arrays;

public class N1 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        N1 sol = new N1();
        System.out.println(Arrays.toString(sol.solution(arr)));

    }
}