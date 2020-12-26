package array;

import java.util.Arrays;

public class No_1313_DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = decompressRLElist(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i+=2) {
            len += nums[i];
        }
        int[] result = new int[len];
        len = 0;
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                result[len++] = nums[i + 1];
            }
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.80%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了100.00%的用户
         */
//        int count =0;
//        for(int i=0;i<nums.length;i+=2){
//            count+=nums[i];
//        }
//        int[] result= new int[count];
//        count=0;
//        for(int i=0;i<nums.length;i+=2){
//            Arrays.fill(result, count, count + nums[i], nums[i + 1]);
//            count += nums[i];
//        }
//        return result;
    }
}
