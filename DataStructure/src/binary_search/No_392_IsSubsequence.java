package binary_search;

public class No_392_IsSubsequence {
    public static void main(String[] args) {
        String s = "abk";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println("result = " + result);
    }

    public static boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0, index = 0; i < chars.length; i++) {
            int site = -1;
            while(index < chart.length){
                if(chart[index++] == chars[i]){
                    site = index;
                    break;
                }
            }
            if(site == -1)
                return false;
        }
        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.9 MB, 在所有 Java 提交中击败了20.87%的用户
         */
    }
}
