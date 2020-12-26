package dynamic_programming;

public class No_746_MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int result = minCostClimbingStairs(cost);
        System.out.println("result = " + result);
    }

    public static int minCostClimbingStairs(int[] cost) {
//        int[] dp = new int[cost.length];
//        dp[0] = cost[0];
//        dp[1] = cost[1];
//        for (int i = 2; i < dp.length; i++)
//            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
//        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.97%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了64.60%的用户
         * 特点：DP
         */

        int prv = cost[0], next = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = next;
            next = cost[i] + Math.min(prv, next);
            prv = temp;
        }
        return Math.min(prv, next);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.97%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了10.11%的用户
         * 特点：DP的状态压缩
         */
    }
}
