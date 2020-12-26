package string;

public class _No_383_RansomNote {
    public static void main(String[] args) {
        String str = "aa";
        String target = "aab";
        boolean result = canConstruct(str, target);
        System.out.println("result = " + result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
//        int[] temp = new int[26];
//        for (char c : magazine.toCharArray()) {
//            temp[c - 'a']++;
//        }
//        for (char c : ransomNote.toCharArray()) {
//            if(--temp[c - 'a'] < 0)
//                return false;
//        }
//        return true;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了75.94%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了38.67%的用户
         */

        if(magazine.length() < ransomNote.length())
            return false;
        int[] caps = new int[26];
        for(char c : ransomNote.toCharArray()){
            int index = magazine.indexOf(c, caps[c - 'a']);
            if(index == -1)
                return false;
            caps[c - 'a'] = index + 1;
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了51.23%的用户
         * 特点：在caps[]中保存的并非是magazine中每类字母的个数
         *      而是在对应当前字符c的magazine中每类字母应该遍历的起始位置
         */
    }
}
