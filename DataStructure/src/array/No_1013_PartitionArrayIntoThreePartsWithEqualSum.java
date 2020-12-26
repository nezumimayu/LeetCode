package array;

import java.util.Arrays;

public class No_1013_PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
//        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1};
//        int[] arr = {10,-10,10,-10,10,-10,10,-10};
//        int[] arr = {12,-4,16,-5,9,-3,3,8,0};
        int[] arr = {1,-1,1,-1};
//        int[] arr = {3,3,6,5,-2,2,5,1,-9,4};
        boolean result = canThreePartsEqualSum(arr);
        System.out.println("result = " + result);
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        for (int i = 1; i < A.length; i++)
            A[i] += A[i - 1];
        for (int i = 0; i < A.length - 1; i++) {
            if(3 * A[i] == A[A.length - 1]){
                for (int j = i + 1; j < A.length - 1; j++) {
                    if(A[j] == 2 * A[i])
                        return true;
                }
            }
        }
        return false;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了40.42%的用户
         * 内存消耗：47.4 MB, 在所有 Java 提交中击败了70.31%的用户
         */
//        for (int i = 1; i < A.length; i++)
//            A[i] += A[i - 1];
//        System.out.println(Arrays.toString(A));
//        int i = 0, j = A.length - 2;
//        while(i < j){
//            if(3 * A[i] != A[A.length - 1]){
//                i++;
//            }else if(2 * A[i] != A[j]){
//                j--;
//            }else{
//                return true;
//            }
//        }
//        return false;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了13.86%的用户
         * 内存消耗：49.2 MB, 在所有 Java 提交中击败了6.25%的用户
         */
//        int result = 0;
//        for (int i : A)
//            result += i;
//        for (int i = 0; i < A.length - 1; i++) {
//            if(i > 0)
//                A[i] += A[i - 1];
//            if(3 * A[i] == result){
//                for (int j = i + 1; j < A.length - 1; j++) {
//                    if(j > i + 1)
//                        A[j] += A[j - 1];
//                    if(A[j] == A[i])
//                        return true;
//                }
//            }
//        }
//        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：47.2 MB, 在所有 Java 提交中击败了92.19%的用户
         */

    }
}
