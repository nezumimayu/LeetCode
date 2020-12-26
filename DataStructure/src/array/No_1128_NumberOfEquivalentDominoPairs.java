package array;

import java.util.Arrays;

public class No_1128_NumberOfEquivalentDominoPairs {
    public static void main(String[] args) {
//        int[][] arr = {{1,2},{2,1},{3,4},{5,6}};
//        int[][] arr = {{1,2},{2,1},{1,2},{4,3},{3,4},{5,6}};
        int[][] arr = {{2,1},{5,4},{3,7},{6,2},{4,4},{1,8},{9,6},{5,3},{7,4},{1,9},{1,1},{6,6},{9,6},{1,3},{9,7},{4,7},{5,1},{6,5},{1,6},{6,1},{1,8},{7,2},{2,4},{1,6},{3,1},{3,9},{3,7},{9,1},{1,9},{8,9}};
        int result = numEquivDominoPairs(arr);
        System.out.println("result = " + result);
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] temp = new int[100];
        for (int[] dominoe : dominoes) {
            if(dominoe[0] <= dominoe[1]){
                temp[dominoe[0] * 10 + dominoe[1]]++;
            }else{
                temp[dominoe[1] * 10 + dominoe[0]]++;
            }
        }
        System.out.println(Arrays.toString(temp));
        int[] index = new int[]{11,12,13,14,15,16,17,18,19,22,23,24,25,26,27,28,29,33,34,35,36,37,38,39,44,45,46,47,48,49,55,56,57,58,59,66,67,68,69,77,78,79,88,89,99};
        int result = 0;
//        for (int i : temp) {
//            if(i >= 2)
//                result += i == 2 ? 1 : ((i * (i - 1)) / 2);
//        }
        for (int i : index) {
            if(temp[i] >= 2)
                result += ((temp[i] * (temp[i] - 1)) / 2);
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了98.54%的用户
         * 内存消耗：49.2 MB, 在所有 Java 提交中击败了31.58%的用户
         */
    }
}
