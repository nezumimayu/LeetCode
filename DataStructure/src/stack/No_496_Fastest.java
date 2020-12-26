package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No_496_Fastest {
    public static void main(String[] args) {

        int[] nums2 = {3,1,2,4};
        int[] nums1 = {4,1,2};
        long startTime = System.currentTimeMillis();

//        for (int i = 0; i < 100000; i++) {

        int[] result = nextGreaterElement2(nums1, nums2);
        System.out.println(Arrays.toString(result));
//        }

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums1;
        }

        int min = nums2[0];
        int max = nums2[0];
        for (int value : nums2) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }

        int[] map = new int[max - min + 1];
        map[nums2[nums2.length - 1] - min] = -1;
        for (int i = nums2.length - 2; i >= 0; i--) {
            int current = nums2[i];
            int next = nums2[i + 1];
            while (current > next && next != -1) {
                next = map[next - min];
            }
            map[current - min] = next;
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map[nums1[i] - min];
        }
        return result;
    }

    public static int[] nextGreaterElement1(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[findNums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] > stack.peek())
                map.put(stack.pop(), nums[i]);
            stack.push(nums[i]);
        }
        while (!stack.empty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < findNums.length; i++) {
            res[i] = map.get(findNums[i]);
        }
        return res;
    }

    /**
     * 单调栈
     */
    //链接：https://leetcode-cn.com/problems/next-greater-element-i/solution/xia-yi-ge-geng-da-yuan-su-i-by-leetcode/


    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ans = new int[nums2.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (index != 0 && nums2[i] > ans[index - 1]) {
                map.put(ans[--index], nums2[i]);
                i--;
            } else {
                ans[index++] = nums2[i];
            }
        }
        for (int i = 0; i < index; i++)
            map.put(ans[i], -1);
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
        return nums1;
    }

}
