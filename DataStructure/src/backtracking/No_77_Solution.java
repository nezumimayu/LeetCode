package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_77_Solution {
    public static void main(String[] args) {
        int n = 20, k = 2;
        List<List<Integer>> result = new No_77_Solution().combine(n, k);
        for (List<Integer> list : result) {
            for (Integer i : list)
                System.out.print(i + " -> ");
            System.out.println();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 初始化
        // 将 temp 中 [0, k - 1] 每个位置 i 设置为 i + 1，即 [0, k - 1] 存 [1, k]
        // 末尾加一位 n + 1 作为哨兵
        for (int i = 1; i <= k; ++i) {
            temp.add(i);
        }
        temp.add(n + 1);

        int j = 0;
        while (j < k) {
            ans.add(new ArrayList<Integer>(temp.subList(0, k)));
            j = 0;
            // 寻找第一个 temp[j] + 1 != temp[j + 1] 的位置 t
            // 我们需要把 [0, t - 1] 区间内的每个位置重置成 [1, t]
            while (j < k && temp.get(j) + 1 == temp.get(j + 1)) {
                temp.set(j, j + 1);
                ++j;
            }
            // j 是第一个 temp[j] + 1 != temp[j + 1] 的位置
            temp.set(j, temp.get(j) + 1);
        }
        return ans;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了66.17%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了40.27%的用户
         * 特点：官方题解
         *       https://leetcode-cn.com/problems/combinations/solution/zu-he-by-leetcode-solution/
         */
    }
}
