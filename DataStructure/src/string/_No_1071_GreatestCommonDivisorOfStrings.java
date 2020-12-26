package string;

public class _No_1071_GreatestCommonDivisorOfStrings {
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
        if(str1.equals(""))
            return str2;
        if(str1.length() < str2.length()){
           String temp = str1;
           str1 = str2;
           str2 = temp;
        }
        String str = str1.replace(str2, "");
        if(str.equals(str1))
            return "";
        return gcdOfStrings(str, str2);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了97.90%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了98.88%的用户
         * 特点：辗转相除法
         */
    }
}
