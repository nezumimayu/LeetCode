package array;

import java.util.Arrays;

public class No_1089_DuplicateZeros {
    public static void main(String[] args) {
//        int[] arr = {1,0,2,3,0,4,5,0};
        int[] arr = {0,0,0,0,0,0,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int[] temp = arr.clone();
        for (int i = 0, index = 0; i < arr.length; i++, index++) {
            arr[i] = temp[index];
            if(temp[index] == 0 && i + 1 < arr.length)
                arr[++i] = 0;
        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了11.11%的用户
         */
    }
}
