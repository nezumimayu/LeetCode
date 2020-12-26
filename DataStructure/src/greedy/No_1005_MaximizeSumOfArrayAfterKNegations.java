package greedy;

import java.util.Arrays;

public class No_1005_MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        int[] A = {5,6,9,-3,3};
//        int[] A = {4,2,3};
//        int[] A = {2,-3,-1,5,-4};
        int K = 2;
        int result = largestSumAfterKNegations(A, K);
        System.out.println("result = " + result);
    }

    public static int largestSumAfterKNegations(int[] A, int K) {
//        int positiveCount = 0, positiveMin = Integer.MAX_VALUE;
//        int index = 0;
//        int[] temp = new int[A.length];
//        for (int i : A) {
//            if(i >= 0){
//                positiveCount += i;
//                if(i < positiveMin)
//                    positiveMin = i;
//            }else{
//                temp[index++] = i;
//            }
//        }
//        int[] arr = new int[index];
//        System.arraycopy(temp, 0, arr, 0, index);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++, K--) {
//            if(K > 0)
//                positiveCount += -arr[i];
//            else
//                positiveCount += arr[i];
//        }
//        int min = index > 0 ? Math.min(positiveMin, -arr[index - 1]) : positiveMin;
//        return (K < 0 || (K & 1) != 1) ? positiveCount : positiveCount + (-2 * min);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了85.71%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了10.37%的用户
         */

//        Arrays.sort(A);
//        int result = 0;
//        boolean flag = true;
//        for (int i = 0; i < A.length; i++) {
//            if(A[i] < 0){
//                if(K > 0){
//                    result += -A[i];
//                    K--;
//                }else {
//                    result += A[i];
//                }
//            }else if(K > 0 && flag && A[i] >= 0){
//                int min = i - 1 < 0 ? A[i] : Math.min(-A[i - 1], A[i]);
//                if (((K & 1) == 1)) {
//                    result += (-2 * min);
//                }
//                flag = false;
//                i--;
//            }else{
//                result += A[i];
//            }
//        }
//        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了85.71%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了84.56%的用户
         */

//        Arrays.sort(A);
//        int result = 0;
//        for (int i = 0; i < A.length; i++) {
//            if(A[i] < 0){
//                if(K > 0){
//                    result += -A[i];
//                    K--;
//                }else {
//                    result += A[i];
//                }
//            }else{
//                if(K > 0){
//                    int min = i - 1 < 0 ? A[i] : Math.min(-A[i - 1], A[i]);
//                    if ((K & 1) == 1) {
//                        result += (-2 * min);
//                    }
//                    K = 0;
//                }
//                result += A[i];
//            }
//        }
//        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了85.71%的用户
         * 内存消耗：38.7 MB, 在所有 Java 提交中击败了30.42%的用户
         */

        Arrays.sort(A);
        int index = 0, result = 0;
        while(index < A.length){
            while(A[index] < 0 && K > 0){
                result += -A[index++];
                K--;
            }
            while(A[index] < 0){
                result += A[index++];
            }
            if(K > 0){
                int min = index - 1 < 0 ? A[index] : Math.min(-A[index - 1], A[index]);
                if ((K & 1) == 1) {
                    result += (-2 * min);
                }
                K = 0;
            }
            result += A[index++];
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了85.71%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了88.48%的用户
         */

//        int[] ans = new int[201];
//        int sum = 0;
//        for (int i : A)
//            ans[i + 100]++;
//        for (int i = 0; K > 0; i++) {
//            while (ans[i] == 0)
//                i++;
//            if (i < 100) {
//                ans[200 - i]++;
//                ans[i--]--;
//                K--;
//            } else {
//                if (K % 2 != 0) {
//                    ans[200 - i]++;
//                    ans[i]--;
//                }
//                break;
//            }
//        }
//        for (int i = 0; i < ans.length; i++)
//            sum += ans[i] > 0 ? (i - 100) * ans[i] : 0;
//        return sum;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了95.16%的用户
         */
    }
}
