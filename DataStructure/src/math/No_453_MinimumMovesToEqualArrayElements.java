package math;

import java.util.*;

public class No_453_MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int result = minMoves(nums);
        System.out.println("result = " + result);
    }

    public static int minMoves(int[] nums) {
//        int min = Integer.MAX_VALUE, sum = 0;
//        for (int num : nums) {
//            if(num < min)
//                min = num;
//        }
//        for (int num : nums)
//            sum += (num - min);
//        return sum;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了83.53%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了43.33%的用户
         * 特点：n - 1 个增加相当于 1 个减少
         */

        Arrays.sort(nums);
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = (moves + nums[i]) - nums[i - 1];
            nums[i] += moves;
            moves += diff;
        }
        return moves;
        /**
         * 执行用时：14 ms, 在所有 Java 提交中击败了26.99%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了49.69%的用户
         * 特点：动态规划
         */
    }
}

