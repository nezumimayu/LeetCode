package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_1_Fastest {
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
        Map<Integer, Integer> map = new HashMap<>();
        int i, j;
        for (i = 0; i < nums.length; i++) {
            j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[]{map.get(j), i};
            }
            map.put(nums[i], i);
        }
        return null;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.61%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了69.02%的用户
         */

//        Map<Integer,Integer> itemMap = new HashMap<>();
//        for(int i = 0;i < nums.length;i++){
//            if(itemMap.get(nums[i]) != null ){
//                return new int[]{itemMap.get(nums[i]), i};
//            }
//            itemMap.put(target - nums[i],i);
//        }
//        return null;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.61%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了34.91%的用户
         */
    }
}
