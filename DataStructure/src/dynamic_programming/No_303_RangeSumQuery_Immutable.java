package dynamic_programming;

import java.util.Arrays;

public class No_303_RangeSumQuery_Immutable {
    public static void main(String[] args) {
        int[] nums = {-2,0,3,-5,2,-1};
        No_303_RangeSumQuery_Immutable result = new No_303_RangeSumQuery_Immutable(nums);
        System.out.println(result.sumRange(0, 2));
        System.out.println(result.sumRange(2, 5));
        System.out.println(result.sumRange(0, 5));
    }

    int[] arr;

    public No_303_RangeSumQuery_Immutable(int[] nums) {
        if(nums.length != 0){
            arr = new int[nums.length];
            arr[0] = nums[0];
            for (int i = 1; i < nums.length; i++)
                arr[i] = nums[i] + arr[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? arr[j] : arr[j] - arr[i - 1];
    }
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了97.19%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了70.22%的用户
     */

//    private int[] sum;
//
//    public NumArray(int[] nums) {
//        sum = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//            sum[i + 1] = sum[i] + nums[i];
//        }
//    }
//
//    public int sumRange2(int i, int j) {
//        return sum[j + 1] - sum[i];
//    }
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了97.19%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了52.31%的用户
     */
}
