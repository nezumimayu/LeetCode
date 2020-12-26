package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_484_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
//        int[] arr = {1,1,2};
//        int[] arr = {1};
//        int[] arr = {2,2};
        List<Integer> result = findDisappearedNumbers(arr);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int[] temp = new int[nums.length + 1];
//        for (int num : nums) {
//            temp[num]++;
//        }
//        List<Integer> result = new ArrayList();
//        for (int i = 1; i < temp.length; i++) {
//            if(temp[i] == 0)
//                result.add(i);
//        }
//        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了99.60%的用户
         * 内存消耗：49 MB, 在所有 Java 提交中击败了43.24%的用户
         */
        int n = nums.length;
        boolean[] map = new boolean[n + 1];
        for (int x : nums) {
            map[x] = true;
        }

        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (!map[i]) {
                list.add(i);
            }
        }

        return list;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：47.8 MB, 在所有 Java 提交中击败了98.65%的用户
         */
    }
}
