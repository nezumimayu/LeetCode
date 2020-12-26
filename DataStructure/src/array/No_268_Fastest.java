package array;

import java.util.HashSet;
import java.util.Set;

public class No_268_Fastest {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        int[] arr = {0,1};
        int result = missingNumber(arr);
        System.out.println("result = " + result);
    }

    public static int missingNumber(int[] nums) {
//        Set<Integer> numSet = new HashSet<Integer>();
//        for (int num : nums) numSet.add(num);
//
//        int expectedNumCount = nums.length + 1;
//        for (int number = 0; number < expectedNumCount; number++) {
//            if (!numSet.contains(number)) {
//                return number;
//            }
//        }
//        return -1;
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了11.11%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了75.30%的用户
         */

        int res = nums.length;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
            res^=i;
        }
        return res;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了40.96%的用户
         */
    }
}
