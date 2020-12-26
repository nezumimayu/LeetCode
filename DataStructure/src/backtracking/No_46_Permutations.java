package backtracking;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_46_Permutations {
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
        per(nums, new LinkedList<>(), result);
        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了22.74%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了37.52%的用户
         */
    }

    private static void per(int[] nums, LinkedList<Integer> list, List<List<Integer>> result) {
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            per(nums, list, result);
            list.pollLast();
        }
    }

}
