package hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class No_771_JewelsAndStones {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        int result = numJewelsInStones(J, S);
        System.out.println("result = " + result);
    }

    public static int numJewelsInStones(String J, String S) {
        int[] temp = new int[123];
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        for (char c : s) {
            temp[c]++;
        }
        int result = 0;
        for (char c : j) {
            result += temp[c];
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.65%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了35.16%的用户
         */

//        char[] j = J.toCharArray();
//        HashSet<Object> set = new HashSet<>();
//        for (char c : j) {
//            set.add(c);
//        }
//        char[] s = S.toCharArray();
//        int result = 0;
//        for (char c : s) {
//            if(set.contains(c))
//                result++;
//        }
//        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了46.59%的用户
         * 内存消耗：38.6 MB, 在所有 Java 提交中击败了9.04%的用户
         */

    }
}
