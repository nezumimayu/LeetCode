package array;

import java.util.Arrays;

public class No_1480_RunningSumOf1dArray {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1};
        int result[] = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}