package string;

public class No_14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"ab"};
        String result = longestCommonPrefix(strs);
        System.out.println("result = " + result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        int i = 0;
        while(strs[0].length() > i){
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if(i > str.length() - 1 || str.charAt(i) != c)
                    return strs[0].substring(0, i);
            }
            i++;
        }
        return strs[0].substring(0, i);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了85.62%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了49.20%的用户
         * 特点：
         *      纵向扫描：从下标0开始，判断每一个字符串的下标0，判断是否全部相同。直到遇到不全部相同的下标。时间性能为O(n*m)
         */
    }
}
