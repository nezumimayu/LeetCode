package array;

import java.util.Arrays;

public class _No_581_ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
//        int[] arr = {2, 6, 4, 8, 10, 9, 15};
//        int[] arr = {2};
//        int[] arr = {2,1,1,1,1};
//        int[] arr = {1,4,2,5,3,1,4,3,99,100,101,203,222,210,150,213};
//        int[] arr = {1,3,5,4,2};
        int[] arr = {1,3,2,2,2};
//        int[] arr = {1,1,1,1,0,3,2,2,2};
        int result = findUnsortedSubarray(arr);
        System.out.println("result = " + result);
    }

    public static int findUnsortedSubarray(int[] nums) {
//        int[] temp = nums.clone();
//        Arrays.sort(temp);
//        int l = 0, r = nums.length - 1;
//        while(l < r){
//            if(temp[l] != nums[l] && temp[r] != nums[r])
//                return r - l + 1;
//            if(temp[l] == nums[l])
//                l++;
//            if(temp[r] == nums[r])
//                r--;
//        }
//        return 0;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了58.20%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了61.21%的用户
         */

        int l = 0, r = nums.length - 1;
        while(l + 1 <= r - 1){
            if(nums[l] > nums[l + 1] && nums[r - 1] > nums[r]){
                break;
            }
            if(nums[l] <= nums[l + 1]){
                l++;
            }
            if(nums[r - 1] <= nums[r]){
                r--;
            }
        }
        System.out.println("l = " + l);
        System.out.println("r = " + r);

        if(r - l <= 1 && nums[l] <= nums[r]) {
            return 0;
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        while(l - 1 >= 0 || r + 1 <= nums.length - 1){
            if((l == 0 || nums[l - 1] <= min) && (r == nums.length - 1 || max <= nums[r + 1])){
                break;
            }
            if(l - 1 >= 0 && nums[l - 1] > min){
                l--;
            }
            if(r + 1 <= nums.length - 1 && nums[r + 1] < max){
                r++;
            }
        }
        System.out.println("l = " + l);
        System.out.println("r = " + r);


        return r - l + 1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.1 MB, 在所有 Java 提交中击败了35.07%的用户
         */
    }
}
