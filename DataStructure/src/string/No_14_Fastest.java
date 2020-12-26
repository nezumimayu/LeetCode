package string;

public class No_14_Fastest {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"ab"};
        String result = longestCommonPrefix(strs);
        System.out.println("result = " + result);
    }

    public static String longestCommonPrefix(String[] strs) {
        String s;
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        s = help(strs[0], strs[1]);
        if (s == null)
            return "";

        for (int i = 2; i < strs.length; i++) {
            s = help(s, strs[i]);
            if (s == null)
                return "";
        }
        return s;
    }

    private static String help(String s1, String s2) {
        int l = Math.min(s1.length(), s2.length());
        for (int i = l; i > 0; i--) {
            String ss = s1.substring(0, i);
            if (ss.equals(s2.substring(0, i)))
                return ss;
        }
        return null;
    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.8 MB, 在所有 Java 提交中击败了57.79%的用户
     * 特点：
     *      横向扫描：前两个字符串找公共子串，将其结果和第三个字符串找公共子串……直到最后一个串。时间性能为O(n*m)。
     *          先找出前两个字符串的共同前缀
     *          再与后面的字符串作比较，不一致时再找出其共同前缀
     */

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.8 MB, 在所有 Java 提交中击败了53.45%的用户
     * 特点：
     *      官方题解：横向扫描
     */

}
