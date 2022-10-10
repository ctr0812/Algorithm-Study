package programmars.stackqueue;




import java.util.*;

class N3 {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100  - progresses[i]) / speeds[i]));
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                cnt++;
                queue.poll();
            }

            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] p = {93, 30, 55};
        int[] s = {1, 30, 5};
        N3 sol = new N3();
        System.out.println(Arrays.toString(sol.solution(p, s)));

    }
}