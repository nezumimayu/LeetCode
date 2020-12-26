package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_119_PascalsTriangleII {
    public static void main(String[] args) {
        int k = 3;
        List<Integer> result = getRow(k);
        for (Integer num : result) {
            System.out.println(num);
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        int[] arr = new int[rowIndex + 1];
        arr[0] = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] += arr[j - 1];
            }
            System.out.println(Arrays.toString(arr));
        }
        List<Integer> result = new ArrayList<>();
        for (int i : arr) {
            result.add(i);
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了5.88%的用户
         */
//        Integer[] dp = new Integer[rowIndex + 1];
//        Arrays.fill(dp,1);
//        for(int i = 2;i < dp.length;i++){
//            for(int j = i - 1;j > 0;j--)
//                dp[j] = dp[j] + dp[j - 1];
//        }
//        List<Integer> res = Arrays.asList(dp);
//        return res;
    }
}
