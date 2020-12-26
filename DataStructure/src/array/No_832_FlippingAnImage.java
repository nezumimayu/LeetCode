package array;

import java.util.Arrays;
import java.util.Collections;

public class No_832_FlippingAnImage {
    public static void main(String[] args) {
//        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(arr);
        for (int[] num : result) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int temp;
        for (int[] num : A) {
            int len = A.length ;
            for (int i = 0; i < len / 2; i++) {
                temp = num[i];
                num[i] = num[len - 1 - i] ^ 1;
                num[len - 1 - i] = temp ^ 1;
            }
            if(len % 2 == 1)
                num[len / 2] = num[len / 2] ^ 1;
        }
        return A;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了13.33%的用户
         */
//        for (int i = 0; i < A.length; i++) {
//            int start = 0, end = A[i].length - 1;
//            while (start < end) {
//                if (A[i][start] != A[i][end]) {
//                    start++;
//                    end--;
//                } else {
//                    A[i][start] = A[i][start] == 1 ? 0 : 1;
//                    A[i][end] = A[i][end] == 1 ? 0 : 1;
//                    start++;
//                    end--;
//                }
//            }
//            if (start == end) {
//                A[i][start] = A[i][start] == 1 ? 0 : 1;
//            }
//        }
//        return A;
    }
}
