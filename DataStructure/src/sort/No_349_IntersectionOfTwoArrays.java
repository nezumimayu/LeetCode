package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class No_349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
//        if(nums1.length == 0 || nums2.length == 0)
//            return new int[]{};
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int index1 = 0, index2 = 0, prv = Integer.MAX_VALUE;
//        ArrayList<Integer> list = new ArrayList<>();
//        while(index1 < nums1.length && index2 < nums2.length){
//            if(nums1[index1] < nums2[index2])
//                index2--;
//            else if(nums2[index2] < nums1[index1])
//                index1--;
//            else if(nums1[index1] != prv && nums1[index1] == nums2[index2]){
//                prv = nums1[index1];
//                list.add(nums1[index1]);
//            }
//            index1++;
//            index2++;
//        }
//        int[] arr = new int[list.size()];
//        int index = 0;
//        for (Integer i : list) {
//            arr[index++] = i;
//        }
//        return arr;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了97.23%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了22.99%的用户
         */

        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2)
            if(set1.contains(i))
                set2.add(i);
        int[] arr = new int[set2.size()];
        int index = 0;
        for (Integer i : set2) {
            arr[index++] = i;
        }
        return arr;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了97.23%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了46.79%的用户
         */

//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        for (int i : nums1) {
//            if(i < min)
//                min = i;
//            if(i > max)
//                max = i;
//        }
//        int[] arr = new int[max - min + 1];
//        for (int i : nums1)
//            arr[i - min]++;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i : nums2) {
//            if(i - min >= 0 && i <= max && arr[i - min] > 0){
//                list.add(i);
//                arr[i - min] = 0;
//            }
//        }
//        int[] result = new int[list.size()];
//        int index = 0;
//        for (Integer i : list) {
//            result[index++] = i;
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了33.31%的用户
         */


    }
}
