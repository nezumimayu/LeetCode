package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class No_350_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
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
//                arr[i - min]--;
//            }
//        }
//        int[] result = new int[list.size()];
//        int index = 0;
//        for (Integer i : list) {
//            result[index++] = i;
//        }
//        return result;
        /**
         *  java.lang.NegativeArraySizeException: -2147483644
         */

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0, index2 = 0;
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int index = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] == nums2[index2]){
                result[index++] = nums1[index1];
                index1++;
                index2++;
            }else if(nums1[index1] > nums2[index2]){
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.59%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了91.95%的用户
         */



    }
}
