package array;

import java.util.Arrays;

public class No_643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
//        int[] arr = {1,12,-5,-6,50,3};
        int[] arr = {4,2,1,3,3};
//        int[] arr = {7,4,5,8,8,3,9,8,7,6};
//        int[] arr = {5};
        int k = 2;
        double result = findMaxAverage(arr, k);
        System.out.println("result = " + result);
    }

    public static double findMaxAverage(int[] nums, int k) {
//        for (int i = 1; i < nums.length; i++)
//            nums[i] += nums[i - 1];
//        System.out.println(Arrays.toString(nums));
////        double result = nums[k - 1];
//        int result = nums[k - 1];
//        for (int i = k; i < nums.length; i++) {
//            if(nums[i] - nums[i - k] > result)
//                result = nums[i] - nums[i - k];
//        }
//        return (double)result / k;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了71.04%的用户
         * 内存消耗：43.4 MB, 在所有 Java 提交中击败了67.50%的用户
         */
//        for (int i = 1; i < k; i++) {
//            nums[i] += nums[i - 1];
//        }
//        int result = nums[k - 1];
//        for (int i = k; i < nums.length; i++) {
//            nums[i] += nums[i - 1];
//            if(nums[i] - nums[i - k] > result)
//                result = nums[i] - nums[i - k];
//        }
//        return result * 1.0 / k;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了84.70%的用户
         * 内存消耗：43.3 MB, 在所有 Java 提交中击败了80.83%的用户
         * 特点：用 * 1.0 代替 (double)
         */
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        int result = temp;
        for (int i = k; i < nums.length; i++) {
            temp = nums[i] + temp - nums[i - k];
            if(temp > result)
                result = temp;
        }
        return result * 1.0 / k;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：43.7 MB, 在所有 Java 提交中击败了28.33%的用户
         * 特点：充分利用temp，temp的值随着i变化而变化
         */
    }
}
