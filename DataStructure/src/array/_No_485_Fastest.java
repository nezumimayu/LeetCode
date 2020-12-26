package array;

public class _No_485_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,1,0,1,1,1};
//        int[] arr = {1,0,1,1,0,1};
//        int[] arr = {1,1,0,1};
//        int[] arr = {1};
        int[] arr = {0,0,0};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("result = " + result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
//        int length = nums.length;
//        int left = 0;
//        int right = 0;
//        int maxSize = 0;
//
//        while(right < length){
//            //当窗口中所有元素为 1 时，右指针向右移，扩大窗口。
//            if (nums[right++] == 0){
//                //当窗口中存在 0 时，计算连续序列长度，左指针指向右指针。
//                maxSize = Math.max(maxSize, right - left - 1);
//                left = right;
//            }
//        }
//        // 因为最后一次连续序列在循环中无法比较，所以在循环外进行比较
//        return Math.max(maxSize, right - left);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.3 MB, 在所有 Java 提交中击败了72.17%的用户
         */
        int result = 0, index = 0;
        for (int i = 0; i < nums.length; ) {
            /**
             * 重点：把 i++ 放在 nums[i++] 处进行
             */
            if(nums[i++] == 0){
                result = result > i - 1- index ? result : i - 1 - index;
                index = i;
            }
        }
        return result > nums.length - index ? result : nums.length - index;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.2 MB, 在所有 Java 提交中击败了88.70%的用户
         */
    }
}
