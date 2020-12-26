package array;

import java.util.*;

public class No_989_AddToArray_FormOfInteger {
    public static void main(String[] args) {
//        int[] arr = {1,2,0,0};
//        int[] arr = {0};
//        int[] arr = {6};
//        int[] arr = {2,1,5};
        int[] arr = {6,0,9,5};
//        int[] arr = {9,9};
        int k = 318;
        List<Integer> result = addToArrayForm(arr, k);
        for (Integer num : result) {
            System.out.print(num + " -> ");
        }
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
//        int[] Val = new int[String.valueOf(K).length()];
//        for (int i = Val.length - 1; i >= 0; i--, K /= 10) {
//            Val[i] = K % 10;
//        }
//        List<Integer> result = new ArrayList<>();
//        int temp = 0;
//        for (int i = A.length - 1, j = Val.length - 1, value = 0; i >= 0 || j >= 0; i--, j--){
//            if(i >= 0 && j >= 0){
//                value = A[i] + Val[j] + temp;
//                result.add(0, value % 10);
//            }else if(i >= 0){
//                value = A[i] + temp;
//                result.add(0, value % 10);
//            }else if(j >= 0){
//                value = Val[j] + temp;
//                result.add(0, value % 10);
//            }
//            if(value > 9){
//                temp = 1;
//            }else{
//                temp = 0;
//            }
//        }
//        if(temp == 1)
//            result.add(0, 1);
//        return result;
        /**
         * 执行用时：46 ms, 在所有 Java 提交中击败了14.37%的用户
         * 内存消耗：41 MB, 在所有 Java 提交中击败了69.23%的用户
         */
//        int[] Val = new int[String.valueOf(K).length()];
//        for (int i = Val.length - 1; i >= 0; i--, K /= 10) {
//            Val[i] = K % 10;
//        }
//        List<Integer> result = new ArrayList<>();
//        int temp = 0;
//        int i = A.length - 1, j = Val.length - 1, value = 0;
//        for (; i >= 0 && j >= 0; i--, j--){
//            value = A[i] + Val[j] + temp;
//            result.add(0, value % 10);
//            if(value > 9){
//                temp = 1;
//            }else{
//                temp = 0;
//            }
//        }
//        while(i >= 0){
//            value = A[i] + temp;
//            result.add(0, value % 10);
//            i--;
//            if(value > 9){
//                temp = 1;
//            }else{
//                temp = 0;
//            }
//        }
//        while(j >= 0){
//            value = Val[j] + temp;
//            result.add(0, value % 10);
//            j--;
//            if(value > 9){
//                temp = 1;
//            }else{
//                temp = 0;
//            }
//        }
//        if(temp == 1)
//            result.add(0, 1);
//        return result;
        /**
         * 执行用时：46 ms, 在所有 Java 提交中击败了14.37%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了93.85%的用户
         */

//        int[] Val = new int[String.valueOf(K).length()];
//        for (int i = Val.length - 1; i >= 0; i--, K /= 10) {
//            Val[i] = K % 10;
//        }
//        List<Integer> result = new ArrayList<>();
//        int temp = 0;
//        if(A.length > Val.length){
//            for (int i = 0; i < A.length; i++) {
//                if(Val.length - i - 1 >= 0){
//                    result.add(0, (A[A.length - i - 1] + Val[Val.length - i - 1] + temp) % 10);
//                    temp = A[A.length - i - 1] + Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
//                }else{
//                    result.add(0, (A[A.length - i - 1] + temp) % 10);
//                    temp = A[A.length - i - 1] + temp > 9 ? 1 : 0;
//                }
//            }
//        }else{
//            for (int i = 0; i < Val.length; i++) {
//                if(A.length - i - 1 >= 0){
//                    result.add(0, (A[A.length - i - 1] + Val[Val.length - i - 1] + temp) % 10);
//                    temp = A[A.length - i - 1] + Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
//                }else{
//                    result.add(0, (Val[Val.length - i - 1] + temp) % 10);
//                    temp = Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
//                }
//            }
//        }
//        if(temp == 1)
//            result.add(0, 1);
//        return result;
        /**
         * 执行用时：46 ms, 在所有 Java 提交中击败了14.37%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了93.85%的用户
         */

        int[] Val = new int[String.valueOf(K).length()];
        for (int i = Val.length - 1; i >= 0; i--, K /= 10) {
            Val[i] = K % 10;
        }
        LinkedList<Integer> ret= new LinkedList<>();
        int temp = 0;
        if(A.length > Val.length){
            for (int i = 0; i < A.length; i++) {
                if(Val.length - i - 1 >= 0){
                    ret.addFirst((A[A.length - i - 1] + Val[Val.length - i - 1] + temp) % 10);
                    temp = A[A.length - i - 1] + Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
                }else{
                    ret.addFirst((A[A.length - i - 1] + temp) % 10);
                    temp = A[A.length - i - 1] + temp > 9 ? 1 : 0;
                }
            }
        }else{
            for (int i = 0; i < Val.length; i++) {
                if(A.length - i - 1 >= 0){
                    ret.addFirst((A[A.length - i - 1] + Val[Val.length - i - 1] + temp) % 10);
                    temp = A[A.length - i - 1] + Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
                }else{
                    ret.addFirst((Val[Val.length - i - 1] + temp) % 10);
                    temp = Val[Val.length - i - 1] + temp > 9 ? 1 : 0;
                }
            }
        }
        if(temp == 1)
            ret.addFirst(1);
        return ret;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了99.06%的用户
         * 内存消耗：42 MB, 在所有 Java 提交中击败了12.31%的用户
         * 特点：LinkedList顺序插入效率高
         */
    }
}
