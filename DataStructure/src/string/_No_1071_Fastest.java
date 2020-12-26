package string;

public class _No_1071_Fastest {
    public static void main(String[] args) {
//        String str1 = "ABCABC";
//        String str2 = "ABC";
        String str1 = "ABABAB";
        String str2 = "ABAB";//
//        String str1 = "LEFT";
//        String str2 = "RIG";
        String result = gcdOfStrings(str1, str2);
        System.out.println("result = " + result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        while (true) {
            String max = str1.length() >= str2.length() ? str1 : str2;
            String min = max.equals(str1) ? str2 : str1;
            if (max.indexOf(min) != -1) {
                if (max.length() == min.length()) {
                    return min;
                } else {
                    str1 = min;
                    str2 = max.substring(min.length(), max.length());
                }

            } else {
                return "";
            }
        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了74.16%的用户
         * 特点：辗转相除法
         */
    }
}
