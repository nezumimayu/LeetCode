package string;

import java.util.Arrays;

public class _No_443_StringCompression {
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
        char prv = chars[0];
        int len = 1, index = 0;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == prv){
                len++;
            }else{
                if(len > 1){
                    chars[index++] = prv;
                    char[] l = String.valueOf(len).toCharArray();
                    for (char c : l) {
                        chars[index++] = c;
                    }
                }else{
                    chars[index++] = prv;
                }
                prv = chars[i];
                len = 1;
            }
            System.out.println(Arrays.toString(chars));
        }
        if(len != 1){
            char[] l = String.valueOf(len).toCharArray();
            chars[index++] = prv;
            for (char c : l) {
                chars[index++] = c;
            }
        }else{
            chars[index++] = prv;
        }
        System.out.println(Arrays.toString(chars));
        return index == 0 ? 1 : index;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了64.52%的用户
         */

    }
}
