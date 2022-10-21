package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class N11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int m = 0;
            while (m <= i) {
                answer += arr[m];
                m++;
            }
        }
            System.out.println(answer);
    }
}
