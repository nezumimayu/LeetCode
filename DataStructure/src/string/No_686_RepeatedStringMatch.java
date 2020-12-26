package string;

import java.util.Arrays;

public class No_686_RepeatedStringMatch {
    public static void main(String[] args) {
//        String A = "abcd";
//        String B = "cdabcdab";
        String A = "abab";
        String B = "aba";
        int result = repeatedStringMatch(A, B);
        System.out.println("result = " + result);
    }

    public static int repeatedStringMatch(String A, String B) {
        if(A.length() == 0 && B.length() == 0)
            return 1;
        int[] next = new int[B.length()];
        char[] b = B.toCharArray();
        for (int i = 1, j = 0; i < b.length; i++) {
            while(j >= 1 && b[i] != b[j])
                j = next[j - 1];
            if(b[i] == b[j])
                j++;
            next[i] = j;
        }
        System.out.println(Arrays.toString(next));
        int i = 0, j = 0;
        char[] a = A.toCharArray();
        int len = b.length - 1 + a.length;
        while(i <= len){
            char c = a[i % a.length];
            while(j >= 1 && a[i % a.length] != b[j])
                j = next[j - 1];
            if(a[i % a.length] == b[j])
                j++;
            if(j == b.length)
                return (i + 1) % a.length > 0 ? ((i + 1) / a.length + 1) : (i + 1) / a.length;
            i++;
        }
        return -1;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了97.05%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了35.13%的用户
         */


    }
}
