package programmars.sort;


import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] nums = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
//        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>= i+1) answer++;
            else break;
        }

        return answer;
    }



    public static void main(String[] args) {
//        int[] citations = {3, 0, 6, 1, 5};
        int[] citations = {7, 8 , 9,  2, 3, 0, 6, 1, 5};
        N3 solution = new N3();
        System.out.println(solution.solution(citations));
    }
}