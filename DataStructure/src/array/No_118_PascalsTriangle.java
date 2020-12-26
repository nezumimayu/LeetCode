package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_118_PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = generate(n);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 1; i <= numRows; i++) {
//            List<Integer> temp = new ArrayList<>();
//            for (int j = 0; j < i; j++) {
//                if(j == 0 || j == i - 1)
//                    temp.add(1);
//                else
//                    temp.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
//            }
//            result.add(temp);
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了76.94%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了9.09%的用户
         */
        List<List<Integer>> result = new ArrayList<>();
        int[][] temp = new int[numRows ][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    temp[i][j] = 1;
                else
                    temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
                list.add(temp[i][j]);
            }
            result.add(list);
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了9.09%的用户
         */
    }
}
