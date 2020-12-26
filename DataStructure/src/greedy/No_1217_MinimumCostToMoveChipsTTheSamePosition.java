package greedy;

public class No_1217_MinimumCostToMoveChipsTTheSamePosition {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        int result = minCostToMoveChips(position);
        System.out.println("result = " + result);
    }

    public static int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i : position) {
            if((i & 1) == 1)
                odd++;
            else
                even++;
        }
        return odd > even ? even : odd;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.5 MB, 在所有 Java 提交中击败了23.96%的用户
         */
    }
}
