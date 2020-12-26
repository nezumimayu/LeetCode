package array;

public class _No_1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(nums);
        System.out.println("result = " + result);
    }

    public static int numIdenticalPairs(int[] nums) {
        Integer index = 0;
        Integer len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(nums[i] == nums[j])
                    index++;
            }
        }
        return index;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了88.06%的用户
         * 内存消耗：36.9 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
