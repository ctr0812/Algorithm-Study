package test.brain;


public class N1 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] newNums = new int[5];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        newNums[4] = 10;

    }
}
