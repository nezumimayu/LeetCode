package array;

public class No_674_LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,4,7};
//        int[] arr = {1,2};
//        int[] arr = {1,2,5,8,0};
//        int[] arr = {1,3,5,4,2,3,4};
//        int[] arr = {1,3,5,4,2,3,4,5};
        int[] arr = {2,2,2,2,2};
        int result = findLengthOfLCIS(arr);
        System.out.println("result = " + result);
    }

    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        int result = 1;
        for (int i = 1, temp = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] > 0){
                temp++;
                if(temp > result)
                    result = temp;
            }else{
                temp = 1;
            }
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.80%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了37.91%的用户
         */
//        if(nums.length <= 1) {
//            return nums.length;
//        }
//        int max = 1;
//        for (int i = 1, index = 0; i < nums.length; i++) {
//            if(nums[i] > nums[i-1]){
//                max = Math.max(i - index + 1,max);
//            }else{
//                index = i;
//            }
//        }
//        return max;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.80%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了64.62%的用户
         */
    }
}
