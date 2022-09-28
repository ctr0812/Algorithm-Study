package heap;


import java.util.PriorityQueue;

class N1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : scoville) {
            queue.add(num);
        }

        while (queue.peek() < K) {
            if(queue.size() < 2) {
                answer = -1;
                break;
            }
            int n = queue.poll();
            int m = queue.poll();
            queue.add(n+ m * 2);
            answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] scoville = {1, 2, 3, 9, 10, 12};
        int[] scoville = {1,2};
        int K = 7;
        N1 solution = new N1();
        System.out.println(solution.solution(scoville,K));
    }
}