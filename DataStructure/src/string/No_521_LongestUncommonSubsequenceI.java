package string;

public class No_521_LongestUncommonSubsequenceI {
    public static void main(String[] args) {
//        String a = "aaa";
//        String b = "aaa";
        String a = "aefawfawfawfaw";
        String b = "aefawfeawfwafwaef";
        int result = findLUSlength(a, b);
        System.out.println("result = " + result);
    }

    public static int findLUSlength(String a, String b) {
//        StringBuilder sba = new StringBuilder(a);
//        StringBuilder sbb = new StringBuilder(b);
//        char[] chara = a.toCharArray();
//        char[] charb = b.toCharArray();
//        int maxa = -1;
//        for (int i = 0; i < chara.length; i++) {
//            for (int j = chara.length - 1; j >= i; j--) {
//                String temp = sba.substring(i, j);
//                maxa = Math.max(maxa, sbb.lastIndexOf(temp)) == -1 ? j - i + 1 : maxa;
//            }
//        }
//        int maxb = -1;
//        for (int i = 0; i < charb.length; i++) {
//            for (int j = charb.length - 1; j >= i; j--) {
//                String temp = sbb.substring(i, j);
//                maxb = Math.max(maxb, sba.lastIndexOf(temp)) == -1 ? j - i + 1 : maxb;
//            }
//        }
//        System.out.println("maxa = " + maxa);
//        System.out.println("maxb = " + maxb);
//        return Math.max(maxa, maxb);
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了6.41%的用户
         */

        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.3 MB, 在所有 Java 提交中击败了73.89%的用户
         * 特点：什么SB题目
         */

    }
}
