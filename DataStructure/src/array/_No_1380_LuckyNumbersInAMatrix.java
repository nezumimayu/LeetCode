package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _No_1380_LuckyNumbersInAMatrix {
    public static void main(String[] args) {
//        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] arr = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> result = luckyNumbers(arr);
        for (Integer integer : result) {
            System.out.println("integer = " + integer);
        }
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
//        List<Integer> result = new ArrayList<>();
//        int min = 0, max  = 0, index = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            min = 100010;
//            max = 0;
//            for (int j = 0; j < matrix[0].length; j++) {
//                if(matrix[i][j] < min){
//                    min = matrix[i][j];
//                    index = j;
//                }
//            }
//            for (int j = 0; j < matrix.length; j++) {
//                if(matrix[j][index] > max){
//                    max = matrix[j][index];
//                }
//            }
//            if(max == min)
//                result.add(max);
//        }
//        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了97.03%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        List<Integer> result = new ArrayList<>();
        int min = 0, max  = 0, index = 0;
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            min = 100010;
            max = 0;
            flag = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][index] > min){
                    flag = false;
                    break;
                }
            }
            if(flag)
                result.add(min);
        }
        return result;

    }

}
