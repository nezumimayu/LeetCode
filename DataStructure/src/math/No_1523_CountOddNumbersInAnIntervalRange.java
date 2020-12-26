package math;

public class No_1523_CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low = 8, high = 10;
        int result = countOdds(low, high);
        System.out.println("result = " + result);
    }

    public static int countOdds(int low, int high) {
        return (low & 1) != 1 && ((high - low) & 1) != 1 ? (high - low) / 2 : (high - low) / 2 + 1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.5 MB, 在所有 Java 提交中击败了69.07%的用户
         */
    }
}
