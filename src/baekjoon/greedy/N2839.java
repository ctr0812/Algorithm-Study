package baekjoon.greedy;

import java.util.Scanner;

public class N2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        if (n % 5 == 0) {
            System.out.println(n/5);
        } else{
            int num = n / 5;

            while (num>= 0) {
                if ((n - num * 5) % 3 == 0) {
                    answer = num + (n - num * 5) / 3;
                    break;
                }
                num --;
            }
            if (answer == 0) System.out.println(-1);
            else System.out.println(answer);

        }

    }
}
