package array;

import java.util.Arrays;

public class No_88_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3, n = 3;
//        int[] arr1 = {0};
//        int[] arr2 = {1};
//        int m = 0, n = 1;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int index = nums1.length - 1;
//        while(m > 0 || n > 0){
//            if(n == 0){
//                break;
//            }else if(m == 0){
//                for (int i = n - 1; i >= 0; i--) {
//                    nums1[index--] = nums2[i];
//                }
//                break;
//            }else if(nums2[n - 1] >= nums1[m - 1]){
//                nums1[index--] = nums2[n - 1];
//                n--;
//            }else if(nums1[m - 1] > nums2[n - 1]){
//                nums1[index--] = nums1[m - 1];
//                m--;
//            }
//            System.out.println(Arrays.toString(nums1));
//        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了24.25%的用户
         */

        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
