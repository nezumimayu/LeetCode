package greedy;

public class No_1518_WaterBottles {
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        int result = numWaterBottles(numBottles, numExchange);
        System.out.println("result = " + result);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
//        int result = numBottles;
//        while(numBottles >= numExchange){
//            int val = numBottles / numExchange;
//            result += val;
//            numBottles = (numBottles % numExchange) + val;
//        }
//        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.7 MB, 在所有 Java 提交中击败了30.92%的用户
         */

        return numBottles >= numExchange ? (numBottles - numExchange) / (numExchange - 1) + 1 + numBottles : numBottles;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.4 MB, 在所有 Java 提交中击败了83.38%的用户
         * 特点：数学
         */
    }
}
