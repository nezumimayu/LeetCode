package array;

import java.util.Arrays;

public class No_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {5,0,10,0,10,6};
        int[] result = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] temp = new int[101];
//        for (int i = 0; i < nums.length; i++) {
//            temp[nums[i]]++;
//        }
//        int[] result = new int[nums.length];
//        int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            num = 0;
//            for (int j = 0; j < nums[i]; j++) {
//                num+=temp[j];
//            }
//            result[i] = num;
//        }
//        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了77.36%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        int[] temp = new int[101];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        int num = 0;
        for (int i = 0; i < temp.length; i++) {
            num+=temp[i];
            temp[i] = num;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                result[i] = 0;
            else
                result[i] = temp[nums[i] - 1];
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了100.00%的用户
         */
//        int[] sorted = new int[101];
//        for (int num : nums) {
//            sorted[num]++;
//        }
//        int count = 0;
//        for (int i = 0; i < sorted.length; i++) {
//            if (sorted[i] > 0) {
//                int temp = sorted[i];
//                sorted[i] = count;
//                count += temp;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sorted[nums[i]];
//        }
//        return nums;
    }
}
