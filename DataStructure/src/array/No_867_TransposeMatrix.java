package array;

public class No_867_TransposeMatrix {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] result = transpose(arr);
        for (int[] num : result) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[0].length; j++)
                result[i][j] = A[j][i];
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了20.00%的用户
         */
    }
}
