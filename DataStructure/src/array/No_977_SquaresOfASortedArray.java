package array;

import java.util.Arrays;

public class No_977_SquaresOfASortedArray {
    public static void main(String[] args) {
//        int[] arr = {-4,-1,0,3,10};
//        int[] arr = {-7,-3,2,3,11};
        int[] arr = {-1, 1};
//        int[] arr = {-1,2,2};
        int[] result = sortedSquares(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] A) {
//        for (int i = 0; i < A.length; i++)
//            A[i] = A[i] * A[i];
//        Arrays.sort(A);
//        return A;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了33.32%的用户
         * 内存消耗：41.5 MB, 在所有 Java 提交中击败了10.00%的用户
         */
//        int[] temp = new int[10001];
//        for (int i : A){
//            temp[(i ^ (i >> 31)) - (i >> 31)]++;
//        }
//        for (int i = 0, j = 0; i < temp.length; i++) {
//            if(temp[i] != 0)
//                while(temp[i]-- != 0)
//                    A[j++] = i * i;
//        }
//        return A;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了15.78%的用户
         * 内存消耗：41.3 MB, 在所有 Java 提交中击败了10.00%的用户
         */
//        if(A.length == 1){
//            A[0] = A[0] * A[0];
//            return A;
//        }
//        int[] result = new int[A.length];
//        int index = 0;
//        for (int i = 0; i < A.length; i++)
//            if(A[i] < 0 && A[i + 1] >= 0)
//                index = i + 1;
//        System.out.println("index = " + index);
//
//        for (int i = 0, l = index - 1, r = index; i < A.length; i++) {
//            if(r > A.length - 1 || (l >= 0 && (A[l] ^ (A[l] >> 31)) - (A[l] >> 31) < A[r])){
//                result[i] = A[l] * A[l];
//                l--;
//            }else{
//                result[i] = A[r] * A[r];
//                r++;
//            }
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.7 MB, 在所有 Java 提交中击败了10.00%的用户
         */
        int[] B = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int index = A.length - 1;
        while (index >= 0) {
            //最左为负数，且左边绝对值大于右边时取左指针值并指针+1，否则取右指针值并指针-1
            if (A[left] < 0 && -A[left] > A[right])
                B[index--] = A[left] * A[left++];
            else
                B[index--] = A[right] * A[right--];
        }
        return B;
    }
}
