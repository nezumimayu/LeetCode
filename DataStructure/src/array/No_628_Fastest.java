package array;

public class No_628_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,6,2,8,4,3,56,2,4};
        int[] arr = {-1,-2,1,2,3};
//        int[] arr = {0,0,0,4};
//        int[] arr = {-4,-3,-2,-1,60};
        int result = maximumProduct(arr);
        System.out.println("result = " + result);
    }

    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.47%的用户
         * 内存消耗：41.6 MB, 在所有 Java 提交中击败了74.04%的用户
         */

//        int min1=Integer.MAX_VALUE;
//        int min2=Integer.MAX_VALUE;
//        int max1=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        int max3=Integer.MIN_VALUE;
//        for(int num:nums){
//            if(num<min2){
//                if(num<min1){
//                    min2=min1;
//                    min1=num;
//                }else{
//                    min2=num;
//                }
//            }
//            if(num>max3){
//                if(num>max1){
//                    max3=max2;
//                    max2=max1;
//                    max1=num;
//                }else if(num>max2){
//                    max3=max2;
//                    max2=num;
//                }else{
//                    max3=num;
//                }
//            }
//        }
//        return Math.max(min1*min2,max3*max2)*max1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.9 MB, 在所有 Java 提交中击败了18.27%的用户
         */

    }
}
