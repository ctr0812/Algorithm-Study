package baekjoon.DP;

import java.util.Scanner;

public class N24416 {

    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n);
        dp(n);
        System.out.println(cnt1 + " " + cnt2);

    }

    private static int recur(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else return recur(n - 1) + recur(n - 2);
    }

    private static int dp(int n) {
        int[] dp = new int[n+1];
        dp[0]= 0; dp[1] = 1; dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            cnt2 ++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
