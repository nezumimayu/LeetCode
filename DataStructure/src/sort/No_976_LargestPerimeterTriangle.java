package sort;

import java.util.Arrays;

public class No_976_LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] A = {1,2,2,4,18,8};
//        int[] A = {3,2,3,4};
        int result = largestPerimeter(A);
        System.out.println("result = " + result);
    }

    public static int largestPerimeter(int[] A) {
//        Arrays.sort(A);
//        int[] result = new int[3];
//        int index = 0;
//        for (int i = A.length - 1; i >= 0; i--) {
//            result[index++] = A[i];
//            index = isTriangle(result, index);
//            if(index == 3)
//                return result[0] + result[1] + result[2];
//        }
//        return 0;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了90.68%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了45.57%的用户
         */

        int[] result = new int[3];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            int max = 0;
            for (int j = 0; j < A.length; j++) {
                if(A[j] > A[max])
                    max = j;
            }
            result[index++] = A[max];
            A[max] = 0;
            index = isTriangle(result, index);
            if(index == 3)
                return result[0] + result[1] + result[2];
        }
        return 0;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了97.86%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了63.93%的用户
         */
    }

    private static int isTriangle(int[] arr, int index) {
        if(index < 3)
            return index;
        if(arr[0] - arr[1] < arr[2] && arr[1] + arr[2] > arr[0])
            return 3;
        if(arr[0] - arr[1] >= arr[2]){
            arr[0] = arr[1];
            arr[1] = arr[2];
        }
        return 2;
    }
}
