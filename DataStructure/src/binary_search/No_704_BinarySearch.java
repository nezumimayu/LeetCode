package binary_search;

public class No_704_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = search(nums, target);
        System.out.println("result = " + result);
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) >> 1;                      //为防止溢出，可写为：int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了23.38%的用户
         */
    }
}
