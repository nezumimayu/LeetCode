package hash_table;

public class No_389_FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char result = findTheDifference(s, t);
        System.out.println("result = " + result);
    }

    public static char findTheDifference(String s, String t) {
        int[] temp = new int[26];
        for (char c : s.toCharArray()) {
            temp[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if(--temp[c - 'a'] < 0)
                return c;
        }
        return ' ';
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了37.21%的用户
         */

//        char res = 0;
//        int lens = s.length();
//        for (int i = 0; i < lens; i ++) {
//            res ^= s.charAt(i) ^ t.charAt(i);
//        }
//        res ^= t.charAt(lens);
//        return res;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了90.14%的用户
         */
    }
}
