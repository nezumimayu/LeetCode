package array;

import java.util.Arrays;
import java.util.HashMap;

public class _No_219_ContainsDuplicateII {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1};
//        int[] arr = {1,0,1,1};
//        int[] arr = {-1,-1};
//        int[] arr = {1,2};
        int[] arr = {4,5,3,1,2,3};
        int k = 3;
        boolean result = containsNearbyDuplicate(arr, k);
        System.out.println("result = " + result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(nums[i]) && Math.abs(i - temp.get(nums[i])) <= k){
                return true;
            }else{
                temp.put(nums[i], i);
            }
        }
        return false;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了91.56%的用户
         * 内存消耗：45.7 MB, 在所有 Java 提交中击败了18.46%的用户
         */
    }
}