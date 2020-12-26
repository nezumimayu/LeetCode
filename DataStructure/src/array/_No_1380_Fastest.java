package array;

import java.util.ArrayList;
import java.util.List;

public class _No_1380_Fastest {
    public static void main(String[] args) {
//        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] arr = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> result = luckyNumbers(arr);
        for (Integer integer : result) {
            System.out.println("integer = " + integer);
        }
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int[] ints : matrix) {
            int val = ints[0];
            int k = 0;
            for (int j = 0; j < col; j++) {
                if (val > ints[j]) {
                    val = ints[j];
                    k = j;
                }
            }
            boolean flag = true;
            for (int[] value : matrix) {
                if (val < value[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans.add(val);
        }
        return ans;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }

}
