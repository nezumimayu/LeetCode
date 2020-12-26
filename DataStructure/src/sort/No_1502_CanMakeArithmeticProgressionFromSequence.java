package sort;

import array.No_999_AvailableCapturesForRook;

import java.util.Arrays;

public class No_1502_CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
//        int[] arr = {1,2,4};
        int[] arr = {3,5,1};
        boolean result = canMakeArithmeticProgression(arr);
        System.out.println("result = " + result);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
//        Arrays.sort(arr);
//        int len = arr[1] - arr[0];
//        for (int i = 0; i + 1 < arr.length; i++) {
//            if(arr[i + 1] - arr[i] != len)
//                return false;
//        }
//        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.27%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了70.24%的用户
         */

        for (int i = arr.length / 2 - 1; i >= 0; i--){
            adjustHeap(arr, i, arr.length);
        }
        int temp = 0, prv = arr[0];
        temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = temp;
        adjustHeap(arr, 0, arr.length - 1);
        int len = prv - arr[0];
        for (int i = arr.length - 2; i > 0; i--) {
            if(prv - arr[0] != len)
                return false;
            prv = arr[0];
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, i);
        }
        return prv - arr[0] == len;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.27%的用户
         * 内存消耗：38.4 MB, 在所有 Java 提交中击败了49.83%的用户
         */
    }

    private static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1){
            if(k + 1 < length && arr[k] < arr[k + 1])
                k++;
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }
}
