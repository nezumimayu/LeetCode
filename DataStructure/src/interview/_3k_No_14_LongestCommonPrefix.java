package interview;

public class _3k_No_14_LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strs = {"ab", "a"};
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("result = " + result);
    }

    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0 || strs[0].length() == 0)
//            return "";
//        StringBuilder sb = new StringBuilder();
//        int index = 0;
//        while(index < strs[0].length()){
//            sb.append(strs[0].charAt(index++));
//            for (String str : strs) {
//                if(str.indexOf(sb.toString()) != 0)
//                    return sb.deleteCharAt(index - 1).toString();
//            }
//        }
//        return sb.toString();
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了16.68%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了10.44%的用户
         */

        if (strs.length == 0 || strs[0].length() == 0)
            return "";
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            result = subBetween(result, strs[i]);
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.4 MB, 在所有 Java 提交中击败了95.04%的用户
         */
    }

    private static String subBetween(String result, String str) {
        int index = 0;
        int len = Math.min(result.length(), str.length());
        for (int i = 0; i < len; i++) {
            if(result.charAt(index) == str.charAt(index))
                index++;
        }
        return result.substring(0, index);
    }
}
