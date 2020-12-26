package hash_table;

import java.util.Arrays;

public class No_645_Fastest {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
//        int dup = -1, missing = 1;
//        for (int n: nums) {
//            if (nums[Math.abs(n) - 1] < 0)
//                dup = Math.abs(n);
//            else
//                nums[Math.abs(n) - 1] *= -1;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > 0)
//                missing = i + 1;
//        }
//        return new int[]{dup, missing};
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了74.45%的用户
         * 内存消耗：41.2 MB, 在所有 Java 提交中击败了61.89%的用户
         */

        int xor = 0, xor0 = 0, xor1 = 0;
        for (int n: nums)
            xor ^= n;
        for (int i = 1; i <= nums.length; i++)
            xor ^= i;
        int rightmostbit = xor & ~(xor - 1);
        for (int n: nums) {
            if ((n & rightmostbit) != 0)
                xor1 ^= n;
            else
                xor0 ^= n;
        }
        for (int i = 1; i <= nums.length; i++) {
            if ((i & rightmostbit) != 0)
                xor1 ^= i;
            else
                xor0 ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == xor0)
                return new int[]{xor0, xor1};
        }
        return new int[]{xor1, xor0};
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了96.83%的用户
         * 内存消耗：41.4 MB, 在所有 Java 提交中击败了39.56%的用户
         * 特点：位运算
         */
    }
}
