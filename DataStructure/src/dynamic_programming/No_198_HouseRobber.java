package dynamic_programming;

public class No_198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int result = rob(nums);
        System.out.println("result = " + result);
    }

    public static int rob(int[] nums) {
//        if(nums.length < 2)
//            return nums.length == 0 ? 0 : nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = nums[1];
//        for (int i = 2; i < dp.length; i++) {
//            if(i - 3 >= 0){
//                dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
//            }else{
//                dp[i] = dp[i - 2] + nums[i];
//            }
//        }
//        return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.6 MB, 在所有 Java 提交中击败了7.69%的用户
         */

//        if(nums.length < 2)
//            return nums.length == 0 ? 0 : nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for (int i = 2; i < dp.length; i++)
//            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
//        return dp[dp.length - 1];
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.4 MB, 在所有 Java 提交中击败了21.36%的用户
         * 特点：DP
         */

        if(nums.length < 2)
            return nums.length == 0 ? 0 : nums[0];
        int prv = nums[0], next = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = next;
            next = Math.max(prv + nums[i], next);
            prv = temp;
        }
        return Math.max(prv, next);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.4 MB, 在所有 Java 提交中击败了30.60%的用户
         * 特点：DP的状态压缩
         */
    }
}

