package array;

import java.util.Arrays;

public class _No_665_Non_decreasingArray {
    public static void main(String[] args) {
//        int[] arr = {4,2,3};
//        int[] arr = {4,5,3};
//        int[] arr = {3,6,4};
//        int[] arr = {4,2,1};
//        int[] arr = {3,4,2,3};
//        int[] arr = {2,3,2,4};
        int[] arr = {-1,4,2,3};
        boolean result = checkPossibility(arr);
        System.out.println("result = " + result);
    }

    public static boolean checkPossibility(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int front = 0, last = nums.length - 1;
        for (int i = 0; i + 1 < nums.length; i++) {
            if(nums[i] <= nums[i + 1]){
                front++;
            }else{
                if(i - 1 >= 0){
                    max = Math.max(max, nums[i - 1]);
                    break;
                }
            }
        }
        System.out.println("front = " + front);
        System.out.println("max = " + max);

        for (int i = nums.length - 1; i - 1 >= 0; i--) {
            if(nums[i - 1] <= nums[i]){
                last--;
            }else{
                if(i + 1 <= nums.length - 1){
                    min = Math.min(min, nums[i + 1]);
                }
                break;
            }
        }
        System.out.println("last = " + last);
        System.out.println("min = " + min);


        return last - front <= 1 && (nums[front] <= min || max <= nums[last]);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.91%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了79.83%的用户
         */

    }
}
