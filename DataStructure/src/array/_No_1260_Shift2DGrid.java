package array;

import java.util.*;

public class _No_1260_Shift2DGrid {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
//        int[][] arr = {{1}};
        int k = 1;
        List<List<Integer>> result = shiftGrid(arr, k);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num + "   ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] temp = new int[grid.length * grid[0].length];
        k = k % (grid.length * grid[0].length);
        System.out.println("k = " + k);
        int index = k;
        for (int i = grid.length - 1; i >= 0 && k > 0; i--) {
            for (int j = grid[0].length - 1; j >= 0 && k > 0; j--, k--) {
                temp[k - 1] = grid[i][j];
            }
        }
        int len = grid.length * grid[0].length - index;
        for (int i = 0; i < grid.length && len > 0; i++) {
            for (int j = 0; j < grid[0].length && len > 0; j++, len--) {
                temp[index++] = grid[i][j];
            }
        }
        System.out.println(Arrays.toString(temp));
        List<List<Integer>> result = new ArrayList<>();

//        for (int i = 0; i < temp.length;) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j < grid[0].length; j++, i++) {
//                list.add(temp[i]);
//            }
//            result.add(list);
//        }
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了93.85%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了50.00%的用户
         */

        for (int i = 0; i < temp.length;) {
            Integer[] arr = new Integer[grid[0].length];
            for (int j = 0; j < grid[0].length; j++, i++) {
                arr[j] = temp[i];
            }
            List<Integer> list = Arrays.asList(arr);
            result.add(list);
        }
        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了97.36%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了33.33%的用户
         */

    }
}
