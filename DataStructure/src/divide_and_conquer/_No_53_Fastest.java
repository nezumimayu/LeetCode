package divide_and_conquer;

public class _No_53_Fastest {
    public static void main(String[] args) {
//        int[] nums = {0,-3,1,1};
//        int[] nums = {-1,0,-2};
//        int[] nums = {-1,0,-2,2};
//        int[] nums = {1,2};
//        int[] nums = {-2,-1};
        int[] nums = {-2,1};
//        int[] nums = {8,-19,5,-4,20};
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("result = " + result);
    }

    public static int maxSubArray(int[] nums) {
//        return maxSumRec(nums, 0, nums.length - 1);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了95.99%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了49.98%的用户
         * 特点：分治算法
         */

        int maxSum = Integer.MIN_VALUE, thisSum = 0;
        for(int i = 0; i < nums.length; i++){
            thisSum += nums[i];
            if(thisSum > maxSum)
                maxSum = thisSum;
            if(thisSum < 0)
                thisSum = 0;
        }
        return maxSum;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了95.99%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了5.03%的用户
         * 特点：
         *      如果 nums[i] 是负的，那么它不可能代表最优序列的起点，因为任何包括 nums[i] 的作为起点的子序列的前缀可以通过用 nums[i + 1] 作为起点而得到优化。
         *      类似的，任何负的子序列不可能是最优子序列的前缀。
         */
    }

    public static int maxSumRec(int[] nums, int left, int right){
        if(left == right)
            return nums[left];

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(nums, left, center);
        int maxRightSUm = maxSumRec(nums, center + 1, right);

        int maxLeftBorderSum = Integer.MIN_VALUE, leftBorderSum = 0;
        for(int i = center; i >= left; i--){
            leftBorderSum += nums[i];
            if(leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;
        }

        int maxRightBorderSum = Integer.MIN_VALUE, rightBorderSum = 0;
        for(int i = center + 1; i <= right; i++){
            rightBorderSum += nums[i];
            if(rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }
        return Math.max(maxLeftBorderSum + maxRightBorderSum, Math.max(maxLeftSum, maxRightSUm));
    }
}
