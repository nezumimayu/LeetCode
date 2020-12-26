package array;

import java.util.Arrays;

public class _No_922_SortArrayByParityII {
    public static void main(String[] args) {
//        int[] arr = {4,2,5,7};
        int[] arr = {2,3,1,1,4,0,0,4,3,3};
        int[] result = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int even = 0, odd = 1;
        for (int num : A) {
            if((num & 1) == 1){
                result[odd] = num;
                odd+=2;
            }else{
                result[even] = num;
                even+=2;
            }
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：42.9 MB, 在所有 Java 提交中击败了9.09%的用户
         */
    }
}
