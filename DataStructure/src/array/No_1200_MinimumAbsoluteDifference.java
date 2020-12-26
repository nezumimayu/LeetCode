package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_1200_MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> result = minimumAbsDifference(arr);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
//        Arrays.sort(arr);
//        int[] temp = new int[arr.length];
//        int min = 999999;
//        for (int i = 1; i < temp.length; i++) {
//            temp[i] = ((arr[i] - arr[i - 1]) ^ ((arr[i] - arr[i - 1]) >> 31)) - ((arr[i] - arr[i - 1]) >> 31);
//            if(temp[i] < min)
//                min = temp[i];
//        }
//        System.out.println(Arrays.toString(temp));
//        System.out.println("min = " + min);
//
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 1; i < temp.length; i++)
//            if(temp[i] == min){
//                List<Integer> list = new ArrayList<>();
//                list.add(arr[i - 1]);
//                list.add(arr[i]);
//                result.add(list);
//            }
//        return result;
        /**
         * 执行用时：19 ms, 在所有 Java 提交中击败了66.31%的用户
         * 内存消耗：51.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] < min)
                min = arr[i + 1] - arr[i];
        }
        System.out.println("min = " + min);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++)
            if(arr[i + 1] - arr[i] == min){
//                List<Integer> list = new ArrayList<>();
//                list.add(arr[i]);
//                list.add(arr[i + 1]);
//                result.add(list);
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        return result;
        /**
         * 执行用时：17 ms, 在所有 Java 提交中击败了99.60%的用户
         * 内存消耗：50.6 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
