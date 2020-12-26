package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_1_TwoSum {
    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15};
        int[] arr = {3,3};
//        int[] arr = {0,4,3,0};
//        int[] arr = {-3,4,3,90};
//        int[] arr = {-1,-2,-3,-4,-5};
        int k = 6;
        int[] result = twoSum(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        int lef = 0, rig = 1;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[j] + nums[i] == target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：56 ms, 在所有 Java 提交中击败了46.86%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了6.31%的用户
         */
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            temp.put(nums[i], i);
        }
//        int[] result = new int[2];
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if(temp.containsKey(val) && temp.get(val) != i){
//                result[0] = i;
//                result[1] = temp.get(val);
                return new int[] {i, temp.get(val)};
            }
        }
        return null;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了73.86%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了69.02%的用户
         */
    }
}
