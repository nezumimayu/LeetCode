package array;

import java.util.Arrays;

public class No_628_MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,6,2,8,4,3,56,2,4};
        int[] arr = {-1,-2,1,2,3};
//        int[] arr = {0,0,0,4};
//        int[] arr = {-4,-3,-2,-1,60};
        int result = maximumProduct(arr);
        System.out.println("result = " + result);
    }

    public static int maximumProduct(int[] nums) {
//        if(nums.length == 3)
//            return nums[0] * nums[1] * nums[2];
//        int[] positive = new int[3];
//        int[] negative = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] >= 0){
//                if(nums[i] > positive[0]){
//                    if(nums[i] > positive[2]){
//                        positive[0] = positive[1];
//                        positive[1] = positive[2];
//                        positive[2] = nums[i];
//                    }else if(nums[i] > positive[1]){
//                        positive[0] = positive[1];
//                        positive[1] = nums[i];
//                    }else if(nums[i] > positive[0]){
//                        positive[0] = nums[i];
//                    }
//                }
//            }else{
//                if(-nums[i] > -negative[1]){
//                    negative[0] = negative[1];
//                    negative[1] = nums[i];
//                }else if(-nums[i] > -negative[0]){
//                    negative[0] = nums[i];
//                }
//            }
//
//        }
//        return Math.max(positive[0] * positive[1] * positive[2], positive[2] * negative[0] * negative[1]);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了80.42%的用户
         * 内存消耗：41.8 MB, 在所有 Java 提交中击败了31.73%的用户
         */

        if(nums.length == 3)
            return nums[0] * nums[1] * nums[2];
        int p1 = 0, p2 = 0, p3 = 0, n1 = Integer.MIN_VALUE, n2 = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] >= 0){
//                if(nums[i] > p1){
//                    p3 = p2;
//                    p2 = p1;
//                    p1 = nums[i];
//                }else if(nums[i] > p2){
//                    p3 = p2;
//                    p2 = nums[i];
//                }else if(nums[i] > p3){
//                    p3 = nums[i];
//                }
//            }else{
//                if(-nums[i] > -n1){
//                    n2 = n1;
//                    n1 = nums[i];
//                }else if(-nums[i] > -n2){
//                    n2 = nums[i];
//                }
//            }
//        }
        for (int num : nums){
            if(num > p3){
                if(num > p1){
                    p3 = p2;
                    p2 = p1;
                    p1 = num;
                }else if(num > p2){
                    p3 = p2;
                    p2 = num;
                }else if(num > p3){
                    p3 = num;
                }
            }else if(-num > -n2){
                if(-num > -n1){
                    n2 = n1;
                    n1 = num;
                }else if(-num > -n2){
                    n2 = num;
                }
            }
        }
        return Math.max(p1 * p2 * p3, p1 * n1 * n2);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了80.42%的用户
         * 内存消耗：41.8 MB, 在所有 Java 提交中击败了31.73%的用户
         */

    }
}
