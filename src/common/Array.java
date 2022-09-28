package common;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5, 6};

        // 배열 오름 차순 정렬
        Arrays.sort(answer);

        // 배열 자르기 , 마지막 to 포함 X
        int[] copy = Arrays.copyOfRange(answer,1, 4);

        System.out.println(Arrays.toString(copy));
    }
}
