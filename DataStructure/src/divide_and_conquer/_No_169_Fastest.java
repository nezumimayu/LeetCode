package divide_and_conquer;

import java.util.Random;

public class _No_169_Fastest {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println("result = " + result);
    }

    public static int majorityElement(int[] nums) {
//        Random rand = new Random();
//
//        int majorityCount = nums.length/2;
//
//        while (true) {
//            int candidate = nums[randRange(rand, 0, nums.length)];
//            if (countOccurences(nums, candidate) > majorityCount) {
//                return candidate;
//            }
//        }
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了77.23%的用户
         * 内存消耗：42.2 MB, 在所有 Java 提交中击败了44.74%的用户
         * 特点：随机化：
         *          由于一个给定的下标对应的数字很有可能是众数，我们随机挑选一个下标，检查它是否是众数，如果是就返回，否则继续随机挑选。
         */

        return majorityElementRec(nums, 0, nums.length - 1);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了77.23%的用户
         * 内存消耗：42.3 MB, 在所有 Java 提交中击败了41.17%的用户
         * 特点：分治：
         *          将数组分成左右两部分，分别求出左半部分的众数 a1 以及右半部分的众数 a2，随后在 a1 和 a2 中选出正确的众数
         *      算法：
         *          我们使用经典的分治算法递归求解，直到所有的子问题都是长度为 1 的数组。长度为 1 的子数组中唯一的数显然是众数，直接返回即可。
         *          如果回溯后某区间的长度大于 1，我们必须将左右子区间的值合并。如果它们的众数相同，那么显然这一段区间的众数是它们相同的值。
         *          否则，我们需要比较两个众数在整个区间内出现的次数来决定该区间的众数。
         */

//        int val = 0, count = 0;
//        for(int num : nums){
//            if(count == 0){
//                val = num;
//                count++;
//            }else{
//                count += val == num ? 1 : -1;
//            }
//        }
//        return val;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了77.23%的用户
         * 内存消耗：42.2 MB, 在所有 Java 提交中击败了51.91%的用户
         * 特点：摩尔投票
         */
    }

    private static int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private static int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }


    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }
}
