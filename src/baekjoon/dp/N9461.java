package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9461 {

    static long[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(dp(num));
            n--;
        }

    }

    static long dp(int num) {

        // num 이 100일때 int 범위 21억 초과함
        dp = new long[num + 5];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        for (int i = 6; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }
        return dp[num];
    }
}
