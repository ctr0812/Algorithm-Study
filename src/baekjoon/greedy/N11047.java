package baekjoon.greedy;

import java.util.Scanner;

public class N11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int price = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        while (num > 0) {
            if (price / arr[num - 1] > 0) {
                answer += (price / arr[num-1]);
                price -= arr[num-1] * (price / arr[num-1]);
            }
            num--;
        }
        System.out.println(answer);
    }
}
