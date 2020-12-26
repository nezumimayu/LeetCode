package array;

import java.util.Arrays;

public class No_1460_Fastest {
    public static void main(String[] args) {
        int[] target = {9,6};
        int[] arr = {12,3};
        boolean result = canBeEqual(target, arr);
        System.out.println("result = " + result);
        System.out.println("(0^9^12) = " + (0^9^12));
        System.out.println("(9^12) = " + (9 ^ 12));
        System.out.println("(4^7) = " + (4 ^ 7));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] bask = new int[1001];
        for(int i=0;i<target.length;i++){
            bask[target[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(bask[arr[i]] == 0 ){
                return false;
            }else{
                bask[arr[i]]--;
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.65%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了100.00%的用户
         */
//        int[] temp = new int[1001];
//        for (int i = 0; i < target.length; i++) {
//            temp[target[i]]++;
//            temp[arr[i]]--;
//        }
//        for (int i = 1; i < 1001; i++) {
//            if(temp[i] != 0)
//                return false;
//        }
//        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了89.11%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了100.00%的用户
         */


    }
}
