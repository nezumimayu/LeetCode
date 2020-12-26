package array;

import java.util.Arrays;

public class No_643_Fastest {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
//        int[] arr = {7,4,5,8,8,3,9,8,7,6};
//        int[] arr = {5};
        int k = 4;
        double result = findMaxAverage(arr, k);
        System.out.println("result = " + result);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        //记录第一个i  和  i+k   sum+nums[i+k-1]-nums[i-1];
        int temp = sum;
        for (int i = 1; i + k - 1 < nums.length; ++i) {
            temp = temp + nums[i + k - 1] - nums[i - 1];
            if (temp > sum)
                sum = temp;
        }

        return sum * 1.0 / k;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：43.1 MB, 在所有 Java 提交中击败了95.00%的用户
         */
    }
}
