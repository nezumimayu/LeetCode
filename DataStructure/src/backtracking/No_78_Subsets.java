package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_78_Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " --> ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {
//        LinkedList<Integer> list = new LinkedList<>();
//        sub(nums, 0, list);
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.40%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了51.50%的用户
         * 特点：回溯算法
         */

        List<List<Integer>> res = new LinkedList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了7.26%的用户
         * 内存消耗：38.9 MB, 在所有 Java 提交中击败了78.90%的用户
         * 特点：List<Integer> list = new ArrayList<>(res.get(j));
         *      使用新的对象接受结果
         */
    }

    public static void sub(int[] nums, int val, LinkedList<Integer> list){
        result.add(new ArrayList<>(list));
        for (int i = val; i < nums.length; i++) {
            list.add(nums[i]);
            sub(nums, i + 1, list);
            list.pollLast();
        }
    }
}
