package array;

import java.util.Arrays;

public class No_66_PlusOne {
    public static void main(String[] args) {
//        int[] arr = {4,3,2,1};
//        int[] arr = {9,9,9};
        int[] arr = {9};
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i] += 1;
                for (int j = i + 1; j < digits.length; j++)
                    digits[j] = 0;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了89.77%的用户
         */
    }
}
