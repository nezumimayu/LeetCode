package string;

import java.util.Arrays;

public class No_28_ImplementStrStr {
    public static void main(String[] args) {
//        String haystack = "mississippi";
//        String needle = "issip";
        String haystack = "aabaaabaaac";
        String needle = "aabaaac";
        int result = strStr(haystack, needle);
        System.out.println("result = " + result);
    }

    public static int strStr(String haystack, String needle) {
//        int[] next = new int[needle.length()];
//        char[] need = needle.toCharArray();
//        for (int i = 1, j = 0; i < need.length; i++) {
//            if(j >= 1 && need[i] != need[j]){
//                j = next[j - 1];
//            }
//            if(need[i] == need[j]){
//                j++;
//            }
//            next[i] = j;
//        }
//        System.out.println(Arrays.toString(next));
//
//        char[] target = haystack.toCharArray();
//        int i = 0, j = 0;
//        while(i < target.length && j < need.length){
//            if(target[i] != need[j]){
//                i++;
//                if(j >= 1) {
//                    j = next[j - 1];
//                    i--;
//                }
//            }else{
//                i++;
//                j++;
//            }
//        }
//        return j == need.length ? i - j : -1;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了50.03%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了34.54%的用户
         */

        int[] next = new int[needle.length()];
        char[] need = needle.toCharArray();
        for (int i = 1, j = 0; i < need.length; i++) {
            while(j >= 1 && need[i] != need[j])
                j = next[j - 1];
            if(need[i] == need[j])
                j++;
            next[i] = j;
        }
        System.out.println(Arrays.toString(next));

        char[] chars = haystack.toCharArray();
        for (int i = 0, j = 0; i < chars.length; i++) {
            while(j >= 1 && chars[i] != need[j])
                j = next[j - 1];
            if(chars[i] == need[j])
                j++;
            if(j == need.length)
                return i - j + 1;
        }
        return -1;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了50.03%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了8.51%的用户
         */

    }
}
