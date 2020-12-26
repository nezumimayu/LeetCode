package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No_349_Fastest {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i : nums1) {
//            if (i > max) max = i;
//            if (i < min) min = i;
//        }
//        boolean[] flag = new boolean[max - min + 1];
//        for (int i : nums1) {
//            flag[i - min] = true;
//        }
//        int size = 0;
//        int[] res = new int[max - min + 1];
//        for (int i : nums2) {
//            if (i >= min && i <= max && flag[i - min]) {
//                res[size++] = i;
//                flag[i - min] = false;
//            }
//        }
//        return Arrays.copyOfRange(res, 0, size);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
         * 内存消耗：38.9 MB, 在所有 Java 提交中击败了69.87%的用户
         */

        Set<Integer> set = new HashSet<>();
        for (int e : nums1)
            set.add(e);
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int e : nums2) {
            if (set.contains(e)) {
                result[index++] = e;
                set.remove(e);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.50%的用户
         * 内存消耗：39 MB, 在所有 Java 提交中击败了59.75%的用户
         */
    }
}
