package array;

import java.util.Arrays;

public class No_283_MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,0,1,0,3,12};
//        int[] arr = {1,0,1};
//        int[] arr = {1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0, index = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            if(nums[index] != 0)
                index++;
            if(nums[i] != 0 && i > index){
                nums[index++] = nums[i];
                nums[i] = 0;
            }
        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了5.62%的用户
         */
//        if(nums.length <= 1){
//            return;
//        }
//        int index = 0;
//        for(int i = 0; i< nums.length; i++){
//            if(nums[i] != 0){
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        for(int i = index; i< nums.length; i++){
//            nums[i] = 0;
//        }
    }
}
