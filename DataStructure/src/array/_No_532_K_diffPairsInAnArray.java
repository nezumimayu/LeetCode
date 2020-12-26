package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class _No_532_K_diffPairsInAnArray {
    public static void main(String[] args) {
//        int[] arr = {-6,-4,-3,-1,0,2,3,5,6};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {1,1,1,1,1,1,2,2,2};
        int[] arr = {-1,-1,-1,1,1,1,-10,-10};
//        int[] arr = {3, 1, 4, 1, 5};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1, 3, 1, 5, 4};
        int k = 0;
        int result = findPairs(arr, k);
        System.out.println("result = " + result);
    }

    public static int findPairs(int[] nums, int k) {
        if(k < 0 || nums.length <= 1)
            return 0;
        int result = 0;
        if(k == 0){
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                if(map.containsKey(i)){
                    map.replace(i, map.get(i) + 1);
                }else{
                    map.put(i, 1);
                }
            }
            for (int num : nums) {
                if(map.containsKey(num) && map.get(num) >= 2){
                    result++;
                    map.remove(num);
                }
            }
        }else{
            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }
            for (Integer i : set) {
                if(set.contains(i + k)){
                    result++;
                }
            }
        }
        return result;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了76.65%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了60.14%的用户
         */

//        Arrays.sort(nums);
//        int result = 0;
//        if(k == 0){
//            int temp = 1;
//            for (int i = 1; i < nums.length; i++) {
//                if(nums[i] == nums[i - 1]){
//                    temp++;
//                }else{
//                    if(temp >= 2){
//                        result++;
//                        temp = 1;
//                    }
//                }
//            }
//            if(temp >= 2)
//                result++;
//        }else{
//            for (int i = 0; i < nums.length; i++) {
//                int j = i + 1;
//                if(j <= nums.length - 1 && nums[i] == nums[j])
//                    continue;
//                while(j <= nums.length - 1 && nums[j] - nums[i] <= k){
//                    if(nums[j] - nums[i] == k){
//                        result++;
//                        break;
//                    }
//                    j++;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了84.98%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了60.78%的用户
         */

    }
}
