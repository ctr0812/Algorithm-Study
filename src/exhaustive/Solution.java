package exhaustive;


import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int a = 0; int b = 0;

        for (int i = 1; i <= sum/3; i++) {
            for(int j = 1; j <= sum / i; j++){
                if(i * j == sum && 2*i + 2*j - 4 == brown) {
                    a = Math.max(i, j);
                    b = Math.min(i, j);
                    break;
                }
            }
        }
        answer[0] = a; answer[1] = b;
        return answer;
    }

    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        N4 sol = new N4();
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
    }
}