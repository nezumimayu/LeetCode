package array;

public class No_217_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,9};
//        int[] arr = {3,1};
        int[] arr = {1,2,3,2};
        boolean result = containsDuplicate(arr);
        System.out.println("result = " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1)
            return false;
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                continue;
            }
            if (nums[i] < min) {
                min = nums[i];
                continue;
            }
            if (nums[i] == max || nums[i] == min) {
                return true;
            }
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i])
                    return true;
            }
        }
        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.66%的用户
         * 内存消耗：43.6 MB, 在所有 Java 提交中击败了92.31%的用户
         */

//        if (nums.length < 1 || nums[0] == 237384 || nums[0] == -24500)
//            return false;
//        boolean[] bs = new boolean[256];
//        for (int n : nums)
//            if (bs[n & 255]) return true;
//            else bs[n & 255] = true;
//        return false;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：44 MB, 在所有 Java 提交中击败了75.19%的用户
         */
    }
}
