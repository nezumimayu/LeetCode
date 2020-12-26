package greedy;

public class No_1221_SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        int result = balancedStringSplit(s);
        System.out.println("result = " + result);
    }

    public static int balancedStringSplit(String s) {
        int result = 0, val = 0;
        for (char c : s.toCharArray()) {
            int temp = c == 'R' ? 1 : -1;
            val += temp;
            if(val == 0)
                result++;
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.6 MB, 在所有 Java 提交中击败了59.00%的用户
         */
    }
}
