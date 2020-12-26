package hash_table;

import java.util.Arrays;

public class No_242_ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println("result = " + result);
    }

    public static boolean isAnagram(String s, String t) {
//        char[] ss = s.toCharArray();
//        char[] tt = t.toCharArray();
//        Arrays.sort(ss);
//        Arrays.sort(tt);
//        return new String(ss).equals(new String(tt));
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了86.58%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了81.13%的用户
         */

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] temp = new int[26];
        for (char c : ss) {
            temp[c - 'a']++;
        }
        for (char c : tt) {
            temp[c - 'a']--;
        }
        for (int i : temp) {
            if(i != 0)
                return false;
        }
        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.87%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了95.21%的用户
         */
    }
}
