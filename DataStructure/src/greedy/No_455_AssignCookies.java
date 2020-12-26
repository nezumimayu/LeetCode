package greedy;

import java.util.Arrays;

public class No_455_AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        int result = findContentChildren(g, s);
        System.out.println("result = " + result);
    }

    public static int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
//        int indexG = 0, indexS = 0, result = 0;
//        while(indexG < g.length && indexS < s.length){
//            if(g[indexG] <= s[indexS]){
//                indexG++;
//                result++;
//            }
//            indexS++;
//        }
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了94.89%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了95.38%的用户
         */

        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0, indexS = 0;
        while(indexG < g.length && indexS < s.length){
            if(g[indexG] <= s[indexS])
                indexG++;
            indexS++;
        }
        return indexG;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了94.89%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了23.33%的用户
         */

    }
}
