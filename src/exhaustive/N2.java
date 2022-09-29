package exhaustive;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class N2 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] cnt = new int[3];

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == A[i%5]) cnt[0]++;
            if(answers[i] == B[i%8]) cnt[1]++;
            if(answers[i] == C[i%10]) cnt[2]++;
        }
        System.out.println(Arrays.toString(cnt));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int c : cnt) {
            queue.add(c);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(queue.peek() == cnt[i]) list.add(i + 1);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        N2 sol = new N2();
        System.out.println(Arrays.toString(sol.solution(answers)));
    }
}