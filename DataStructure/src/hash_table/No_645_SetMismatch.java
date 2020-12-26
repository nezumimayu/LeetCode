package hash_table;

import java.util.Arrays;

public class No_645_SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num]++;
        }
        int repeat = 0, miss = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 2)
                repeat = i;
            if(arr[i] == 0)
                miss = i;
        }
        return new int[]{repeat, miss};
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.7 MB, 在所有 Java 提交中击败了21.95%的用户
         */
    }
}
