package dynamic_programming;

public class No_121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7,6,4,3,1};
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("result = " + result);
    }

    public static int maxProfit(int[] prices) {
//        int curr = 0, max = 0;
//        for (int i = 1; i < prices.length; i++) {
//            int val = prices[i] - prices[i - 1];
//            curr = Math.max(val, val + curr);
//            max = Math.max(curr, max);
//        }
//        return max;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了63.42%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了95.13%的用户
         */

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.98%的用户
         * 内存消耗：39 MB, 在所有 Java 提交中击败了12.28%的用户
         */
    }
}
