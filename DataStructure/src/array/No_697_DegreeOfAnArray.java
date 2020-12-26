package array;

import java.util.Arrays;

public class No_697_DegreeOfAnArray {
    public static void main(String[] args) {
//        int[] arr = {2,2,5,5};
//        int[] arr = {1,2,2,3,1};
//        int[] arr = {1,2,2,3,1,4,2};
        int[] arr = {2};
        int result = findShortestSubArray(arr);
        System.out.println("result = " + result);
    }

    public static int findShortestSubArray(int[] nums) {
//        int[] temp  = new int[50001];
//        for (int num : nums) {
//            temp[num]++;
//        }
//
//        int max = 0, index = 0;
//        int[] maxList = new int[50001];
//        for (int i = 0; i < temp.length; i++) {
//            if(temp[i] != 0){
//                if(temp[i] > max){
//                    max = temp[i];
//                    index = 0;
//                }
//                if(temp[i] == max){
//                    maxList[index++] = i;
//                }
//            }
//        }
//
//        int[] start = new int[50001];
//        int[] end = new int[50001];
//
//        for (int i = 0; i < nums.length; i++) {
//            if(start[nums[i]] == 0 && nums[i] != nums[0]){
//                start[nums[i]] = i;
//            }
//            end[nums[i]] = i + 1;
//        }
//
////        System.out.println(Arrays.toString(maxList));
//        for (int i = 0; i < index; i++) {
//            maxList[i] = end[maxList[i]] - start[maxList[i]] ;
//        }
//
//        int result = Integer.MAX_VALUE;
//        for (int i = 0; i < index; i++) {
//            result = Math.min(result, maxList[i]);
//        }
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了96.70%的用户
         * 内存消耗：44.8 MB, 在所有 Java 提交中击败了10.81%的用户
         */

        int[] start = new int[50001];
        int[] end = new int[50001];

        for (int i = 0; i < nums.length; i++) {
            if(start[nums[i]] == 0 && nums[i] != nums[0]){
                start[nums[i]] = i;
            }
            end[nums[i]] = i + 1;
        }

        int[] temp  = new int[50001];
        for (int num : nums) {
            temp[num]++;
        }

        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0){
                if(temp[i] == max && end[i] - start[i] < min){
                    min = end[i] - start[i];
                }
                if(temp[i] > max){
                    max = temp[i];
                    min = end[i] - start[i];
                }
            }
        }

        return min;
    }

}
