package array;

import java.util.Arrays;

public class _No_189_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        int[] arr = {1, 2, 3};
//        int[] arr = {-1,-100,3,99};
//        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
//        int[] temp = nums.clone();
//        for (int i = 0; i < nums.length; i++) {
//            nums[(i + k) % nums.length] = temp[i];
//        }
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了56.83%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了39.17%的用户
         * 特点：使用了额外空间
         */
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[current];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                current = next;
                prev = temp;
                count++;
            }while (current != start);
        }


    }
}
