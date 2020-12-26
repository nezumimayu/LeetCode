package greedy;

public class No_122_BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
        int result = maxProfit(prices);
        System.out.println("result = " + result);
    }

    public static int maxProfit(int[] prices) {
//        int result = 0, first = -1;
//        for (int i = 0; i + 1 <= prices.length; i++) {
//            if(first != -1 && (i + 1 == prices.length || prices[i + 1] < prices[i])){
//                result += (prices[i] - first);
//                first = -1;
//            }else if(first == -1 && i + 1 < prices.length && prices[i + 1] >= prices[i]){
//                first = prices[i];
//            }
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.55%的用户
         * 内存消耗：38.9 MB, 在所有 Java 提交中击败了36.58%的用户
         */

        int res = 0;
        int len = prices.length;
        for (int i = 0; i < len - 1; i++) {
            res += Math.max(prices[i + 1] - prices[i], 0);
        }
        return res;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.55%的用户
         * 内存消耗：38.9 MB, 在所有 Java 提交中击败了30.71%的用户
         * 特点：贪心的性质，只要今天价格小于明天价格就在今天买入然后明天卖出
         */
    }
}
