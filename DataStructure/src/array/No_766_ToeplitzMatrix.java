package array;

public class No_766_ToeplitzMatrix {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3,4},
//                {5,1,2,3},
//                {9,5,1,2}
//        };
//        int[][] arr = {
//                {1,2},
//                {2,2}
//        };
//        int[][] arr = {
//                {18},
//                {66}
//        };
        int[][] arr = {
                {22,33,98},
                {34,20,65}
        };
        boolean result = isToeplitzMatrix(arr);
        System.out.println("result = " + result);
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if(matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
