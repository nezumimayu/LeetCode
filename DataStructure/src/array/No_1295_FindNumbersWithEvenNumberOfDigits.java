package array;

import java.util.Arrays;

public class No_1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int result = findNumbers(arr);
        System.out.println("result = " + result);
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
//            if(String.valueOf(num).length() % 2 == 0)
//                result++;
            result += String.valueOf(num).length() % 2 == 0 ? 1 : 0;
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了68.84%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了5.88%的用户
         */
//        int result = 0;
//        for (int num : nums) {
//            if((num >= 10 && num <100) || (num >=1000 && num <10000) || num == 100000)
//                result++;
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.88%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了5.88%的用户
         */
    }
}
