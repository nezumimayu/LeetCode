package stack;

import java.util.*;

public class No_496_NextGreaterElementI {
    public static void main(String[] args) {

        int[] nums2 = {1,3,4,2};
        int[] nums1 = {4,1,2};
        long startTime = System.currentTimeMillis();

//        for (int i = 0; i < 100000; i++) {

            int[] result = nextGreaterElement(nums1, nums2);
            System.out.println(Arrays.toString(result));
//        }

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

//        for (int i = 0; i < nums1.length; i++) {
//            boolean isAdd = false;
//            for (int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]){
//                    for(int a = j + 1; a < nums2.length; a++){
//                        if(nums2[a] > nums1[i]){
//                            nums1[i] = nums2[a];
//                            isAdd = true;
//                            break;
//                        }
//                    }
//                    if(!isAdd)
//                        nums1[i] = -1;
//                    break;
//                }
//            }
//        }
//        return nums1;
        /**
         * 执行用时 :11 ms, 在所有 Java 提交中击败了8.39%的用户
         * 内存消耗 :39.8 MB, 在所有 Java 提交中击败了9.09%的用户
         */
        Map indexMap = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            indexMap.put(nums2[i], i);
        }
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            boolean isAdd = false;
            index = (int)indexMap.get(nums1[i]);
            for (int j = index; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]){
                    nums1[i] = nums2[j];
                    isAdd = true;
                    break;
                }
            }
            if(!isAdd)
                nums1[i] = -1;
        }
        return nums1;
        /**
         * 执行用时 :4 ms, 在所有 Java 提交中击败了90.02%的用户
         * 内存消耗 :39.8 MB, 在所有 Java 提交中击败了9.09%的用户
         */



    }
}
