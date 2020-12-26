package string;

import java.util.Arrays;

public class No_344_ReverseString {
    public static void main(String[] args) {
        char[] chars = new char[]{'h','e','l','l','o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    public static void reverseString(char[] s) {
        int lef = 0, rig = s.length - 1;
        while(lef < rig){
            char c = s[rig];
            s[rig--] = s[lef];
            s[lef++] = c;
        }
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.93%的用户
         * 内存消耗：46.3 MB, 在所有 Java 提交中击败了92.50%的用户
         */
    }
}
