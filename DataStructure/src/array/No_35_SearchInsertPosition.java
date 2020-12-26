package array;

public class No_35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1};
        int k = 0;
        int result = searchInsert(arr, k);
        System.out.println("result = " + result);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target)
                return i;
        }
        return nums.length;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了81.42%的用户
         */
    }
}