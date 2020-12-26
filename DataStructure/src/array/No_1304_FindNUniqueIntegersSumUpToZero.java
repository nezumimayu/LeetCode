package array;

import java.util.Arrays;

public class No_1304_FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int len = (n & 1) == 1 ? n - 1 : n;
        for (int i = 0; i < len; i++) {
            result[i] = (i + 1);
            result[++i] = -i;
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了6.67%的用户
         */
//        int[] res = new int[n];
//        for (int i = 0; i < n / 2; i++) {
//            res[i * 2] = i + 1;
//            res[i * 2 + 1] = -(i + 1);
//        }
//        return res;
    }
}
