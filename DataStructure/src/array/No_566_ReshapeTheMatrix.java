package array;

import java.util.Arrays;

public class No_566_ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
//        int[][] arr = {{1,2,3,4}};
        int r = 1;
        int c = 4;
        int[][] result = matrixReshape(arr, r, c);
        for (int[] nums : result) {
            System.out.println(Arrays.toString(nums));
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums[0].length * nums.length != r * c)
            return nums;
        int[][] result = new int[r][c];
        int nlen = nums[0].length;
//        int index = 0;
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++, index++) {
//                result[i][j] = nums[index / len][index % len];
//            }
//        }
        for (int i = 0; i < r * c; i++)
            result[i / c][i % c] = nums[i / nlen][i % nlen];
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了25.00%的用户
         */
    }
}
