package string;

import java.util.Arrays;

public class _No_443_Fastest {
    public static void main(String[] args) {
//        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        char[] chars = new char[]{'a','b','c'};
//        char[] chars = new char[]{'a','a','a','b','a','a'};
//        char[] chars = new char[]{'a'};
//        char[] chars = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int result = compress(chars);
        System.out.println("result = " + result);
    }

    public static int compress(char[] chars) {
        int left = 0, size = 0;
        for (int right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[left] != chars[right]) {
                chars[size++] = chars[left];
                //查看中间有多少个重复的数字
                if (right - left > 1) {
                    for (char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了86.85%的用户
         */

    }
}
