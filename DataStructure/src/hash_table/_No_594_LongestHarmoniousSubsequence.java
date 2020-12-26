package hash_table;

import java.util.Arrays;
import java.util.HashMap;

public class _No_594_LongestHarmoniousSubsequence {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,7,9,11,13,15,17};
//        int[] nums = {-1,-1,0,4,4,4,4};
//        int[] nums = {-1,0,-1,0,-1,0,-1};
//        int[] nums = {1,4,1,3,1,-14,1,-13};
        int[] nums = {1,3,2,2,5,2,3,7};
        int result = findLHS(nums);
        System.out.println("result = " + result);
    }

    public static int findLHS(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        int result = 0;
//        for (Integer i : map.keySet()) {
//            if(map.containsKey(i + 1)){
//                int val = map.get(i) + map.get(i + 1);
//                if(val > result)
//                    result = val;
//            }
//        }
//        return result;
        /**
         * 执行用时：22 ms, 在所有 Java 提交中击败了60.30%的用户
         * 内存消耗：41.1 MB, 在所有 Java 提交中击败了32.18%的用户
         */

        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int lef = 0, result = 0, prv = nums[0], mid = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[mid] != nums[i] && nums[i] - prv == 1){
                mid = i;
            }else if(nums[i] - prv >= 2){
                if(nums[i - 1] - nums[lef] > 0 && (i - lef == 1 ? 0 : i - lef) > result)
                    result = i - lef;
                if(nums[i] - nums[mid] <= 1){
                    lef = mid;
                    i = mid;
                    prv = nums[mid];
                }else{
                    lef = i;
                    prv = nums[i];
                }
            }
        }
        if(prv != nums[nums.length - 1])
            result = Math.max(nums.length - lef, result);
        return result;
        /**
         * 执行用时：15 ms, 在所有 Java 提交中击败了93.13%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了61.39%的用户
         */
    }
}
