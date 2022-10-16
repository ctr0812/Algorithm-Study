package test.bc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class N1 {
    public int solution(int[] numbers) {

        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for (int number : numbers) {
            map.put(number,map.getOrDefault(number,0)+1);
        }
        Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = iter.next();
            if (entry.getValue() > numbers.length / 2) {
                answer = entry.getKey();
                break;
            }
        }
        if (answer == 0) return -1;

        return answer;
    }

    public static void main(String[] args) {
        N1 solution = new N1();
        int[] numbers = new int[]{6,1,6,6,7,6,6,7};
        System.out.println(solution.solution(numbers));
    }
}