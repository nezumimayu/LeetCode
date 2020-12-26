package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _No_1260_Fastest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
//        int[][] arr = {{1}};
        int k = 1;
        List<List<Integer>> result = shiftGrid(arr, k);
//        for (List<Integer> list : result) {
//            for (Integer num : list) {
//                System.out.print(num + "   ");
//            }
//            System.out.println();
//        }
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int nx = (i + (k + j) / n) % m;
                int ny = (j + k) % n;
                ans[nx][ny] = grid[i][j];
            }
        }
        List res = Arrays.asList(ans);
        return res;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了33.33%的用户
         */

//        int m = grid.length, n = grid[0].length, total = m *n;
//        int[][] res = new int[m][n];
//        for(int i = 0; i < m; i ++){
//            List<Integer> list = new ArrayList<>();
//            for(int j = 0; j < n; j ++){
//                int sn = ((i * n + j - k) % total + total) % total;
//                res[i][j] = grid[sn / n][sn % n];
//            }
//        }
//        List list = Arrays.asList(res);
//        return list;

//        List res = new ArrayList<>();
//        int m = grid.length;
//        if (m == 0) return res;
//        int n = grid[0].length;
//        int[][] ans = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                ans[(i + (j + k) / n) % m][(j + k) % n] = grid[i][j];
//            }
//        }
//        res = Arrays.asList(ans);
//        return res;


    }
}
