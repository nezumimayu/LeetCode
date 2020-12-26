package array;

import java.util.Arrays;

public class No_268_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        int[] arr = {0,1};
        int result = missingNumber(arr);
        System.out.println("result = " + result);
    }

    public static int missingNumber(int[] nums) {
//        int all = 0, temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            all+=(i + 1);
//            temp+=nums[i];
//        }
//        return all - temp;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了51.46%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了84.34%的用户
         */

        boolean[] temp = new boolean[nums.length + 1];
        for (int i : nums)
            temp[i] = true;
        for (int i = 0; i < temp.length; i++)
            if(!temp[i])
                return i;
        return nums.length;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了31.33%的用户
         */
    }
}
