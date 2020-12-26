package divide_and_conquer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No_53_MaximumSubarray {
    public static void main(String[] args) {
//        int[] nums = {0,-3,1,1};
//        int[] nums = {-1,0,-2};
//        int[] nums = {-1,0,-2,2};
//        int[] nums = {1,2};
//        int[] nums = {-2,-1};
//        int[] nums = {-2,1};
        int[] nums = {8,-19,5,-4,20};
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("result = " + result);
    }

    public static int maxSubArray(int[] nums) {
        int prv = 0, max = nums[0], val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while(i < nums.length && (val + nums[i] > val / 2 || (i + 1 < nums.length && nums[i + 1] > 2 * nums[i]))){
                val += nums[i++];
                if(val > max)
                    max = val;
            }
            if(prv + 1 < nums.length){
                i = prv + 1;
            }
            if(i < nums.length)
                val = nums[i];
            else
                val = nums[nums.length - 1];
            max = Math.max(max, val);
            prv = i;
        }
        return Math.max(max, val);
        /**
         * 执行用时：42 ms, 在所有 Java 提交中击败了6.08%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了9.01%的用户
         */
    }
}
