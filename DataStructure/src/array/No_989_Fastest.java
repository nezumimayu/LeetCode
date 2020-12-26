package array;

import java.util.LinkedList;
import java.util.List;

public class No_989_Fastest {
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
        int len = A.length;
        int lastNum = K;
        LinkedList<Integer> ret = new LinkedList<>();
        int i = len - 1;
        while (i >= 0 || lastNum > 0) {
            if (i >= 0) {
                lastNum += A[i];
            }
            ret.addFirst(lastNum % 10);
            lastNum /= 10;
            i--;
        }
        return ret;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了99.06%的用户
         * 内存消耗：42 MB, 在所有 Java 提交中击败了12.31%的用户
         * 特点：LinkedList顺序插入效率高
         */
    }
}
