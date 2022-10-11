package baekjoon.DP;

import java.util.Scanner;

public class N1904 {
    static int[] dp = new int[1000001];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(dp(n));
    }

    static int dp(int n) {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

//        dp(n)이 Integer 범위를 넘어갈 수 있어서 계산 할 때마다 % 15746을 해줘야함
//          https://sskl660.tistory.com/75
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 2] * 2 + dp[i - 3]) % 15746 ;
        }

//        for (int i = 4; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746 ;
//        }

        return dp[n];
    }

}
