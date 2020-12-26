package array;

import java.util.Arrays;

public class No_561_ArrayPartitionI {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,4,7,9,7,7};
        int result = arrayPairSum(arr);
        System.out.println("result = " + result);
    }

    public static int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int result = 0;
//        for (int i = 0; i < nums.length; i+=2) {
//            result+=nums[i];
//        }
//        return result;
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了96.58%的用户
         * 内存消耗：41.9 MB, 在所有 Java 提交中击败了8.33%的用户
         */
        int[] temp = new int[20001];
        for (int num : nums)
            temp[num + 10000]++;
        int result = 0;
        boolean flag = true;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0)        //重点
                if((temp[i] & 1) == 1){
                    if(flag)
                        result+=i;
                    flag = !flag;
                    result+=((temp[i] - 1) / 2 * i);
                }else
                    result+=(temp[i] / 2 * i);
        }
        return result - nums.length / 2 * 10000;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了99.44%的用户
         * 内存消耗：41.5 MB, 在所有 Java 提交中击败了8.33%的用户
         */
    }

}
