package array;

public class _No_581_Fastest {
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
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        boolean flag = false;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < nums[i - 1])
//                flag = true;
//            if (flag)
//                min = Math.min(min, nums[i]);
//        }
//        flag = false;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (nums[i] > nums[i + 1])
//                flag = true;
//            if (flag)
//                max = Math.max(max, nums[i]);
//        }
//        int l, r;
//        for (l = 0; l < nums.length; l++) {
//            if (min < nums[l])
//                break;
//        }
//        for (r = nums.length - 1; r >= 0; r--) {
//            if (max > nums[r])
//                break;
//        }
//        return r - l < 0 ? 0 : r - l + 1;

        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了58.85%的用户
         * 内存消耗：41.1 MB, 在所有 Java 提交中击败了41.28%的用户
         * 特点：记录最小无序数组中的最大、最小元素
         */

        int len = nums.length;
        int max = nums[0];
        int min = nums[len - 1];
        int l = 0, r = -1;
        for (int i = 0; i < len; i++) {
            if (max > nums[i]) {
                r = i;
            } else {
                max = nums[i];
            }
            if (min < nums[len - i - 1]) {
                l = len - i - 1;
            } else {
                min = nums[len - i - 1];
            }
        }
        return r - l + 1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了87.98%的用户
         * 特点：
         * 同时从前往后和从后往前遍历，分别得到要排序数组的右边界和左边界；
         * 寻找右边界：
         * 从前往后遍历的过程中，用max记录遍历过的最大值，如果max大于当前的nums[i]，说明nums[i]的位置不正确，属于需要排序的数组，
         * 因此将右边界更新为i，然后更新max；这样最终可以找到需要排序的数组的右边界，右边界之后的元素都大于max；
         * 寻找左边界：
         * 从后往前遍历的过程中，用min记录遍历过的最小值，如果min小于当前的nums[j]，说明nums[j]的位置不正确，应该属于需要排序的数组，
         * 因此将左边界更新为j，然后更新min；这样最终可以找到需要排序的数组的左边界，左边界之前的元素都小于min；
         * （从前往后遍历和从后往前遍历两个过程可以分两次循环完成，也可以放一起完成，这样的话就有：j=len-i-1）
         */
    }
}
