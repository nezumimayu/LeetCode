package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _No_219_Fastest {
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
        int n = nums.length;
        if (k < 1 || n < 2)
            return false;

        int l = 0, r = 1;
        while (r < n) {
            if (l < r && nums[l] == nums[r])
                return true;
            if (r - l == k)
                l++;
            else
                r++;
        }
        while (l < n - 1)
            if (nums[l++] == nums[n - 1])
                return true;
        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.26%的用户
         * 内存消耗：42.4 MB, 在所有 Java 提交中击败了85.92%的用户
         */

//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            if(i > k)
//                set.remove(nums[i-k-1]);
//            if(!set.add(nums[i]))
//                return true;
//        }
//        return false;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了98.12%的用户
         * 内存消耗：43.7 MB, 在所有 Java 提交中击败了44.34%的用户
         * 特点：遍历的同时移去 i 和 j 的差大于 k 的数据
         */
    }
}