package array;

import java.util.Arrays;

public class _No_922_Fastest {
    public static void main(String[] args) {
//        int[] arr = {4,2,5,7};
        int[] arr = {2,3,1,1,4,0,0,4,3,3};
        int[] result = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            if ((A[i] & 1) != 0) {
                while ((A[j] & 1) != 0) {
                    j = j + 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了63.64%的用户
         */
//        for(int i = 0, j = 1; i < A.length && j < A.length; i += 2, j += 2) {
//            while(i < A.length && A[i] % 2 == 0) i += 2;
//            while(j < A.length && A[j] % 2 == 1) j += 2;
//            if(i < A.length && j < A.length) {
//                int temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//            }
//        }
//        return A;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了79.78%的用户
         * 内存消耗：41.1 MB, 在所有 Java 提交中击败了45.45%的用户
         */
    }
}
