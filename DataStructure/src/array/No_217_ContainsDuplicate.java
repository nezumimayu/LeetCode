package array;

import java.util.HashMap;
import java.util.Map;

public class No_217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9};
//        int[] arr = {3,1};
//        int[] arr = {1,2,3,1};
        boolean result = containsDuplicate(arr);
        System.out.println("result = " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> temp = new HashMap();
//        for (int num : nums) {
//            if(temp.containsKey(num)){
//                return true;
//            }else{
//                temp.put(num,1);
//            }
//        }
//        return false;
        /**
         * 执行用时：12 ms, 在所有 Java 提交中击败了10.41%的用户
         * 内存消耗：45.9 MB, 在所有 Java 提交中击败了54.84%的用户
         */
        if(nums.length <= 1)
            return false;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
//        int[] temp = new int[max - min + 1];
//        for (int i = 0; i < nums.length; i++) {
//            temp[nums[i] - min]++;
//        }
//        for (int i = 0; i < temp.length; i++) {
//            if(temp[i] > 1)
//                return true;
//        }
//        return false;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了98.81%的用户
         * 内存消耗：46.8 MB, 在所有 Java 提交中击败了11.42%的用户
         */

        boolean[] temp = new boolean[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - min] = !temp[nums[i] - min];
        }
        for (int i = 0; i < nums.length; i++) {
            if(!temp[nums[i] - min])
                return true;
        }
        return false;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.33%的用户
         * 内存消耗：43.6 MB, 在所有 Java 提交中击败了91.32%的用户
         */
    }
}
