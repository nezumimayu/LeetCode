package array;

public class No_27_RemoveElement {
    public static void main(String[] args) {
//        int[] arr = {3,2,2,3};
//        int[] arr = {0,1,2,2,3,0,4,2};
        int[] arr = {1};
        int val = 1;
        int result = removeElement(arr, val);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int lef = 0, rig = nums.length - 1;
        int result = nums.length;
        while(lef <= rig){
            if(nums[lef] == val && nums[rig] != val){
                nums[lef++] = nums[rig--];
                result--;
            }
            if(nums[lef] != val)
                lef++;
            if(nums[rig] == val){
                result--;
                rig--;
            }
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了76.84%的用户
         */
//        if (nums == null || nums.length == 0) return 0;
//        int ans = 0;
//        for (int num : nums) {
//            if (num != val) {
//                nums[ans] = num;
//                ans++;
//            }
//        }
//        return ans;

//        int i = 0;
//        int n = nums.length;
//        while (i < n) {
//            if (nums[i] == val) {
//                nums[i] = nums[n - 1];
//                // reduce array size by one
//                n--;
//            } else {
//                i++;
//            }
//        }
//        return n;
    }
}
