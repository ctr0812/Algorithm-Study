package baekjoon.bruteforce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        int answer = 0;
        for (int j = 0; j < n; j++) {
            int temp = p[j];
            for (int i = t[j]; i + t[i] <= n;) {
                temp += p[i];
                i += t[i];
                if (i >= n) break;
            }
            answer = Math.max(temp, answer);
        }
        System.out.println(answer);

    }

}
