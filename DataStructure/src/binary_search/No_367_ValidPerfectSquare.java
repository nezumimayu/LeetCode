package binary_search;

import java.math.BigInteger;
import java.util.concurrent.atomic.DoubleAdder;

public class No_367_ValidPerfectSquare {
    public static void main(String[] args) {
//        int num = 808201;
        int num = 2147483647;
        boolean result = isPerfectSquare(num);
        System.out.println("result = " + result);
//        System.out.println("4 ^ 2 = " + ((2 >>> 1) << 2));
    }

    public static boolean isPerfectSquare(int num) {
//        if(num == 1)
//            return true;
//        Long left = 0l;
//        Long right = Long.valueOf(num);
//        while(left <= right){
//            Long mid = left + (right - left) / 2;
//            Long val = mid * mid;
//            if(val == num)
//                return true;
//            else if(val > num)
//                right = mid - 1;
//            else
//                left = mid + 1;
//        }
//        return false;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.4 MB, 在所有 Java 提交中击败了79.83%的用户
         */

        if (num < 2)
            return true;
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return (x * x == num);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了9.66%的用户
         * 特点：牛顿迭代法
         */
    }
}
