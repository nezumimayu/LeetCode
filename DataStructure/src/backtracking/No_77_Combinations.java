package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_77_Combinations {
    public static void main(String[] args) {
        int n = 20, k = 8;
        List<List<Integer>> result = combine(n, k);
//        for (List<Integer> list : result) {
//            for (Integer i : list)
//                System.out.print(i + " -> ");
//            System.out.println();
//        }
        System.out.println("count = " + count);
    }

    static int count = 0;

    public static List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtracking(1, n, k, new LinkedList<>(), result);
//        return result;
        /**
         * 执行用时：22 ms, 在所有 Java 提交中击败了48.90%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了14.91%的用户
         */

        List<List<Integer>> result = new ArrayList<>();
        backtracking2(1, n, k, new LinkedList<>(), result);
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了97.43%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了89.68%的用户
         * 特点：优化：
         *          如果 n = 7, k = 4，从 55 开始搜索就已经没有意义了，这是因为：
         *          即使把 55 选上，后面的数只有 66 和 77，一共就 33 个候选数，凑不出 44 个数的组合。
         *          因此，搜索起点有上界
         */
    }

    private static void backtracking(int val, int n, int k, LinkedList<Integer> list, List<List<Integer>> result) {
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = val; i <= n; i++) {
            count++;
            list.add(i);
            backtracking(i + 1, n, k, list, result);
            list.pollLast();
        }
    }

    private static void backtracking2(int val, int n, int k, LinkedList<Integer> list, List<List<Integer>> result) {
        if(k == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = val; i <= n - k + 1; i++) {
            count++;
            list.add(i);
            backtracking2(i + 1, n, k - 1, list, result);
            list.pollLast();
        }
    }
}
