package array;

import java.util.Arrays;

public class No_1299_Fastest {
    public static void main(String[] args) {
        int[] arr = {20,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了8.33%的用户
         */
    }
}
