package array;

import java.util.Arrays;

public class No_1470_ShuffleTheArray {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2};
       Integer n = 2;
       int result[] = shuffle(arr, n);
       System.out.println(Arrays.toString(result));

    }

    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if(i % 2 == 1){
                arr[i] = nums[n++];
            }else{
                arr[i] = nums[j++];
            }
        }
        return arr;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
