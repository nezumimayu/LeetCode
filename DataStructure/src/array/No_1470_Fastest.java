package array;

import java.util.Arrays;

public class No_1470_Fastest {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2};
       Integer n = 2;
       int result[] = shuffle(arr, n);
       System.out.println(Arrays.toString(result));

    }

    public static int[] shuffle(int[] nums, int n) {
        int index = 0;
        int[] arr = new int[nums.length];
        for (int i = 0;i < n;i ++) {
            arr[index++] = nums[i];
            arr[index++] = nums[i + n];
        }
        return arr;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
