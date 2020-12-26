package array;

import java.util.Arrays;

public class No_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int[] arr = {1,1,2};
//        int[] arr = {1};
        int result = removeDuplicates(arr);
        System.out.println("result = " + result);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
//        int len = 0, temp = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != temp){
//                nums[len++] = nums[i];
//                temp = nums[i];
//            }
//        }
//        return len;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.22%的用户
         * 内存消耗：41.6 MB, 在所有 Java 提交中击败了68.12%的用户
         */
        int len = 0, i = 0;
        while(i < nums.length){
            if(nums[len] != nums[i])
                nums[++len] = nums[i];
            i++;
        }
        return len + 1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.22%的用户
         * 内存消耗：42 MB, 在所有 Java 提交中击败了5.12%的用户
         */
    }
}
