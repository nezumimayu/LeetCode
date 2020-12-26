package array;

import java.util.Arrays;

public class No_1460_MakeTwoArraysEqualByReversingSub_arrays {
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};
        boolean result = canBeEqual(target, arr);
        System.out.println("result = " + result);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if(target[i] != arr[i])
                return false;
        }
        return true;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了77.52%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了100.00%的用户
         */
//        if(target.length == 1 && target[0] == arr[0])
//            return true;
//        int num1 = 1, num2 = 1;
//        for (int i = 0; i < target.length; i++) {
//            num1*=target[i];
//            num2*=arr[i];
//        }
//        System.out.println(num1);
//        System.out.println(num2);
//        return num1 == num2;
    }
}
