package programmars.exhaustive;


import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class N1 {
    public int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(sizes).forEach(size-> queue1.add(size[0]));
        Arrays.stream(sizes).forEach(size-> queue2.add(size[1]));
        answer = queue1.poll() * queue2.poll();

        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        N1 sol = new N1();
        System.out.println(sol.solution(sizes));
    }
}