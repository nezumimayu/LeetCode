package array;

import java.util.Arrays;

public class No_747_LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 0};
//        int[] arr = {1, 2, 3, 4};
//        int[] arr = {0,0,3,2};
        int result = dominantIndex(arr);
        System.out.println("result = " + result);
    }

    public static int dominantIndex(int[] nums) {
        int max = -1, next = -1, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                next = max;
                max = nums[i];
                index = i;
            }else if(nums[i] > next){
                next = nums[i];
            }
        }
        return max >= 2 * next ? index : -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了40.63%的用户
         */
//        int[] temp = new int[101];
//        Arrays.fill(temp, -1);
//        for (int i = 0; i < nums.length; i++) {
//            temp[nums[i]] = i;
//        }
//        for (int i = temp.length - 1; i > 0; i--) {
//            if(temp[i] != -1){
//                for (int j = i - 1; j > i / 2; j--){
//                    if(temp[j] != -1){
//                        return -1;
//                    }
//                }
//                return temp[i];
//            }
//        }
//        return -1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了51.54%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了6.25%的用户
         */

    }
}
