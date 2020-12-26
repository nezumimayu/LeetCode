package array;

import java.util.Arrays;

public class No_414_ThirdMaximumNumber {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1};
//        int[] arr = {1, 1, 2};
//        int[] arr = {2, 2, 3, 1};
//        int[] arr = {1,-2147483648,-2147483648,4,2};
//        int[] arr = {1,2,2,5,3,5};
        int[] arr = {1,2,-2147483648};
        int result = thirdMax(arr);
        System.out.println("result = " + result);
    }

    public static int thirdMax(int[] nums) {
        if(nums.length < 3)
            return nums[0] > nums[1] ? nums[0] : nums[1];
        long max = Long.MIN_VALUE, mid = Long.MIN_VALUE, min = Long.MIN_VALUE;
        for (int num : nums) {
            if(num == max || num == mid || num == min){
            }else if(num > max){
                min = mid;
                mid = max;
                max = num;
            }else if(num > mid){
                min = mid;
                mid = num;
            }else if(num > min){
                min = num;
            }
        }
        return min == Long.MIN_VALUE ? (int)max : (int)min;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了96.13%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了55.27%的用户
         */
    }
}
