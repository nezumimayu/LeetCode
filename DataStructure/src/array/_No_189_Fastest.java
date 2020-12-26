package array;

public class _No_189_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {1, 2, 3};
//        int[] arr = {-1,-100,3,99};
//        int[] arr = {1,2,3,4,5,6};
        int k = 4;
        rotate(arr, k);
//        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        int count = 0;
//        for (int start = 0; count < nums.length; start++) {
//            int current = start;
//            int prev = nums[start];
//            do {
//                int next = (current + k) % nums.length;
//                int temp = nums[next];
//                nums[next] = prev;
//                prev = temp;
//                current = next;
//                count++;
//            } while (start != current);
//        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了48.91%的用户
         * 特点：使用环状替换
         */

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
