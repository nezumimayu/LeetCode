package array;

public class No_724_FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
//        int[] arr = {-1,-1,-1,0,1,1};
//        int[] arr = {1, 2,3};
//        int[] arr = {};
//        int[] arr = {-1,-1,-1,-1,-1,-1};
//        int[] arr = {-1,-1,-1,-1,-1,0};
        int result = pivotIndex(arr);
        System.out.println("result = " + result);
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0, val = 0; i < nums.length; i++) {
            if(val == nums[nums.length - 1] - nums[i]){
                return i;
            }else{
                val = nums[i];
            }
        }
        return -1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了45.47%的用户
         */
//        int sum = 0, leftsum = 0;
//        for (int x: nums) sum += x;
//        for (int i = 0; i < nums.length; ++i) {
//            if (leftsum == sum - leftsum - nums[i]) return i;
//            leftsum += nums[i];
//        }
//        return -1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了48.34%的用户
         */
    }
}
