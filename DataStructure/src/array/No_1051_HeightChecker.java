package array;

import java.util.Arrays;

public class No_1051_HeightChecker {
    public static void main(String[] args) {
//        int[] arr = {5,1,2,3,4};
//        int[] arr = {1,1,4,2,1,3};
        int[] arr = {2,1,2,1,1,2,2,1};
        int result = heightChecker(arr);
        System.out.println("result = " + result);
    }

    public static int heightChecker(int[] heights) {
//        int[] temp = heights.clone();
//        Arrays.sort(temp);
//        int result = 0;
//        for (int i = 0; i < heights.length; i++) {
//            if(temp[i] != heights[i])
//                result++;
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了82.62%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了10.00%的用户
         */
        int[] temp = new int[101];
        for (int i = 0; i < heights.length; i++) {
            temp[heights[i]]++;
        }
        int result = 0;
        for (int i = 1, j = 0; i < temp.length; i++) {
            while(temp[i]-- != 0)
                if(i != heights[j++])
                    result++;
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了10.00%的用户
         */
    }
}
