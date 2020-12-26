package math;

import java.util.Arrays;

public class No_9_PalindromeNumber {
    public static void main(String[] args) {
        int x = -4;
        boolean result = isPalindrome(x);
        System.out.println("result = " + result);
    }

    public static boolean isPalindrome(int x) {
//        if(x < 0)
//            return false;
//        char[] chars = Integer.valueOf(x).toString().toCharArray();
//        int left = 0, right = chars.length - 1;
//        while(left < right){
//            if(chars[left++] != chars[right--])
//                return false;
//        }
//        return true;
        /**
         * 执行用时：11 ms, 在所有 Java 提交中击败了44.66%的用户
         * 内存消耗：38.7 MB, 在所有 Java 提交中击败了9.39%的用户
         */

//        if(x < 0)
//            return false;
//        StringBuilder sb = new StringBuilder(Integer.valueOf(x).toString());
//        int left = 0, right = sb.length() - 1;
//        while(left < right){
//            if(sb.charAt(left++) != sb.charAt(right--))
//                return false;
//        }
//        return true;
        /**
         * 执行用时：12 ms, 在所有 Java 提交中击败了29.73%的用户
         * 内存消耗：38.7 MB, 在所有 Java 提交中击败了8.65%的用户
         */

//        String str = Integer.valueOf(x).toString();
//        StringBuilder sb = new StringBuilder(Integer.valueOf(x).toString());
//        return str.equals(sb.reverse().toString());
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了21.92%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了17.87%的用户
         */

        int temp = x, val = 0;
        while(temp > 0){
            val = val * 10 + (temp % 10);
            temp /= 10;
        }
        return val == x;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了99.21%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了80.54%的用户
         */
    }
}
