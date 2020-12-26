package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class No_46_Fastest {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        for (List<Integer> list : result) {
            for (Integer i : list)
                System.out.print(i + " -> ");
            System.out.println();
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            list.add(num);
        int len = nums.length;
        backtracking(len, 0, list, result);
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.71%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了55.44%的用户
         */
    }

    private static void backtracking(int len, int first, List<Integer> list, List<List<Integer>> result) {
        if(first == len)
            result.add(new ArrayList<>(list));
        for (int i = first; i < len; i++) {
            Collections.swap(list, first, i);
            backtracking(len, first + 1, list, result);
            Collections.swap(list, i, first);
        }
    }

}
