package math;

public class No_171_ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String s = "ZY";
        int result = titleToNumber(s);
        System.out.println("result = " + result);
    }

    public static int titleToNumber(String s) {
//        int result = 0;
//        char[] chars = s.toCharArray();
//        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++)
//            result += ((chars[i] - 64) * Math.pow(26, j));
//        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了38.02%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了98.66%的用户
         */

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了28.35%的用户
         * 特点：相当于 26 进制，每 26 个数则向前进一位
         */
    }
}
