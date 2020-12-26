package array;

import java.util.Arrays;

public class No_1464_MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        int result = maxProduct(arr);
        System.out.println("result = " + result);
    }

    public static int maxProduct(int[] nums) {
        int max = 0;
        int next = 0;
        for (int num : nums) {
            if(num >= max){
                next = max;
                max = num;
            }else if(num >= next)
                next = num;
        }
        System.out.println("max = " + max);
        System.out.println("next = " + next);
        return (max - 1) * (next - 1);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了100.00%的用户
         */

//        Arrays.sort(nums);
//        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了26.33%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
