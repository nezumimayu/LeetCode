package array;

import java.util.Arrays;

public class _No_532_Fastest {
    public static void main(String[] args) {
//        int[] arr = {-6,-4,-3,-1,0,2,3,5,6};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {1,1,1,1,1,1,2,2,2,3};
//        int[] arr = {-1,-1,-1,1,1,1,-10,-10};
//        int[] arr = {3, 1, 4, 1, 5};
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1, 3, 1, 5, 4};
        int k = 2;
        int result = findPairs(arr, k);
        System.out.println("result = " + result);
    }

    public static int findPairs(int[] nums, int k) {
        if(k < 0)
            return 0;
        Arrays.sort(nums);
        int start = 0, count = 0, prev = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[start] > k || prev == nums[start]) {
                if (++start != i)
                    i--;
            }else if (nums[i] - nums[start] == k) {
                prev = nums[start++];
                count++;
            }
        }
        return count;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了93.20%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了83.01%的用户
         * 特点：
         * 查找数组中两数之差的绝对值是k, 首先想到也最简单的就是排序之后进行计算
         * 定义一个起始指针start 随着i的增加找到差值为k的时候 start++, i++
         * 中间会遇到两种特殊情况：
         * 1. 当遇到一串相同数字的时候 那么只需要i不断前进即可
         *    当遇到差值为k的时候记录下prev = nums[start] 然后跳过所有等于prev的start
         * 2. 就是当差值大于k的时候 我们需要start进1
         *    此时需要判断增长后的start是否等于i 只有相等的情况才需要i也进1 否则需要i--
         */

    }
}
