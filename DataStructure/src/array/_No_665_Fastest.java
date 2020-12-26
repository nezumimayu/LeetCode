package array;

public class _No_665_Fastest {
    public static void main(String[] args) {
//        int[] arr = {4,2,3};
//        int[] arr = {4,5,3};
//        int[] arr = {3,6,4};
//        int[] arr = {4,2,1};
//        int[] arr = {3,4,2,3};
//        int[] arr = {2,3,2,4};
        int[] arr = {-1,4,2,3};
        boolean result = checkPossibility(arr);
        System.out.println("result = " + result);
    }

    public static boolean checkPossibility(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                sum++;
                if (sum >= 2)
                    return false;
                if (i - 2 >= 0 && nums[i - 2] > nums[i])
                    nums[i] = nums[i - 1];
                else
                    nums[i - 1] = nums[i];
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.91%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了99.48%的用户
         * 特点：看上去很简单，就是想不到
         */

    }
}
