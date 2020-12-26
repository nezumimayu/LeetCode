package array;

import java.util.Arrays;

public class _No_1252_CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int n = 2, m = 2;
        int[][] arr = {{1,1}, {0,0}};
        Boolean[] nums = new Boolean[n * m];
        int result = oddCells(n, m, arr);
        System.out.println("result = " + result);
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int[] nums = new int[n * m];
        for (int i = 0; i < indices.length; i++) {
            for (int e = indices[i][0] * m; e < indices[i][0] * m + m; e++)
                nums[e]++;
            for (int f = indices[i][1]; f < n * m; f+=m)
                nums[f]++;
        }
        int result = 0;
        for (int num : nums) {
            if(num % 2 == 1)
                result++;
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了47.59%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了33.33%的用户
         */
//        int[][] nums = new int[n][m];
//        for (int i = 0; i < indices.length; i++) {
//            for (int e = 0; e < m; e++)
//                nums[indices[i][0]][e]++;
//            for (int f = 0; f < n; f++)
//                nums[f][indices[i][1]]++;
//        }
//        int result = 0;
//        for (int[] num : nums) {
//            for (int i : num) {
//                if(i % 2 == 1)
//                    result++;
//            }
//        }
//        return result;
    }
}
