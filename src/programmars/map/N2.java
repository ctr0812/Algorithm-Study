package programmars.map;

import java.util.HashMap;
import java.util.HashSet;

class N2 {

    //HashMap
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int m : nums) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        int keySize = map.keySet().size();
        for (int i = 0; i < nums.length / 2; i++) {
            if(keySize > 0){
                keySize--;
                answer++;
            }
        }
        return answer;
    }

    // HashSet
    public int solution2(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        answer =  set.size() > nums.length/2 ? nums.length/2 : set.size();

        return answer;
    }



    public static void main(String[] args) {
//        int[] nums = {3, 3, 3, 2, 2, 2};
//        int[] nums = {3, 1, 2, 3};
        int[] nums = {3, 3, 3, 2, 2, 4};
        N2 sol = new N2();
        System.out.println(sol.solution(nums));
    }
}