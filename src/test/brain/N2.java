package test.brain;

import java.util.Arrays;

public class N2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nums(123456789L)));
    }

    public static int[] nums(Long a) {
        int[] intNums = new int[10];
        String[] sArray = a.toString().split("");
        for (String s : sArray) {
            intNums[Integer.parseInt(s)]++;
        }
        return intNums;
    }
}
