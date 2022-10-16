package test.bc;



import java.util.Arrays;

class Solution {

    public int solution(int[] gold_prices) {

        int temp = 0;
        for (int i = gold_prices.length-1; i >=0; i--) {
            for (int j = i - 1; j >=0; j--) {
                if (gold_prices[j] < gold_prices[i]) {
                    temp = Math.max(temp, gold_prices[i]-gold_prices[j]);
                }
            }
        }

        int answer = recursive(gold_prices,0);
        answer = Math.max(answer, temp);

        return answer;
    }

    public int recursive(int[] gold_prices, int answer) {

        int temp = 0;
        int sum = 0;

        if (gold_prices.length < 5) {
            for (int i = gold_prices.length - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (gold_prices[j] < gold_prices[i]) {
                        temp = Math.max(temp, gold_prices[i] - gold_prices[j]);
                    }
                }
            }
            return answer + temp;
        } else {
            for (int i = gold_prices.length / 3; i < gold_prices.length * 2 / 3; i++) {
                int left = recursive(Arrays.copyOfRange(gold_prices, 0, i), answer);
                int right = recursive(Arrays.copyOfRange(gold_prices, i + 1, gold_prices.length), answer);
                sum = Math.max(sum, left + right);
            }

            return sum;
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gp1 = {7, 2, 5, 6, 1, 4, 2, 8};
        int[] gp2 = {2, 8, 3, 7, 5, 3, 2, 8};
        System.out.println(solution.solution(gp2));
    }
}

//    int temp = 0;
//    int next = gold_prices[i];
//                System.out.println("---------------");
//                        for (int j = i + 1; j < gold_prices.length; j++) {
//        System.out.println("next " + next);
//        int max = 0;
//        if (gold_prices[j] > next) {
//        System.out.println("j 값 " + j);
//        System.out.println("gold_prices[j] " + gold_prices[j]);
//        max = Math.max(max,gold_prices[j] - next);
//        System.out.println("max " + max);
//        if (j + 2 < gold_prices.length - 1) {
//        next = gold_prices[j + 2];
//        j++;
//        }
//        }
//        temp += max;
//        System.out.println("temp" + temp);
//        }