package graph;

import java.util.Arrays;
import java.util.HashSet;

public class No_997_FindTheTownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        int N = 3;
        int result = findJudge(N, trust);
        System.out.println("result = " + result);
    }

    public static int findJudge(int N, int[][] trust) {
//        if(trust.length == 0)
//            return N == 1 ? 1 : -1;
//        HashSet<Integer> set = new HashSet<>();
//        set.add(-1);
//        int[] temp = new int[N + 1];
//        int judge = -1;
//        for (int i = 0; i < trust.length; i++) {
//            set.add(trust[i][0]);
//            if(++temp[trust[i][1]] == N - 1)
//                judge = trust[i][1];
//        }
//        return !set.contains(judge) ? judge : -1;
        /**
         * 执行用时：11 ms, 在所有 Java 提交中击败了19.28%的用户
         * 内存消耗：47.4 MB, 在所有 Java 提交中击败了71.97%的用户
         */

        if(trust.length == 0)
            return N == 1 ? 1 : -1;
        int[] temp = new int[N + 1];
        for (int[] t : trust) {
            temp[t[0]] = -1;
            temp[t[1]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == N - 1)
                return i;
        }
        return -1;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：47.3 MB, 在所有 Java 提交中击败了88.87%的用户
         */
    }
}
