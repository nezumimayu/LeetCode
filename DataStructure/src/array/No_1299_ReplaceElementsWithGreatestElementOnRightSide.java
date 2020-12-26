package array;

import java.util.Arrays;

public class No_1299_ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr = {20,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int temp = 0;
        int max = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > max)
                max = arr[i];
            else if(temp >= max)
                max = temp;
            temp = arr[i - 1];
            arr[i - 1] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了58.79%的用户
         * 内存消耗：41.3 MB, 在所有 Java 提交中击败了8.33%的用户
         */
    }
}
