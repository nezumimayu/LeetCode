package array;

import java.util.Arrays;

public class No_905_SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
//        int[] arr = {0,1};
        int[] result = sortArrayByParity(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArrayByParity(int[] A) {
        int lef = 0, rig = A.length - 1;
        int temp = 0;
        while(lef < rig){
            if((A[lef] & 1) == 1 && (A[rig] & 1) != 1){
                temp = A[lef];
                A[lef++] = A[rig];
                A[rig--] = temp;
            }
            if((A[lef] & 1) != 1)
                lef++;
            if((A[rig] & 1) == 1)
                rig--;
        }
        return A;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了57.14%的用户
         */
    }
}
