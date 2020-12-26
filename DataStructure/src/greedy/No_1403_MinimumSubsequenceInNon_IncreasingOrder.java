package greedy;

import java.util.ArrayList;
import java.util.List;

public class No_1403_MinimumSubsequenceInNon_IncreasingOrder {
    public static void main(String[] args) {
        int[] nums = {4,4,7,6,7};
        List<Integer> result = minSubsequence(nums);
        for (Integer i : result) {
            System.out.print(i + " -> ");
        }
    }

    public static List<Integer> minSubsequence(int[] nums) {
//        int count = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        int[] temp = new int[101];
//        for (int num : nums) {
//            temp[num]++;
//            count += num;
//        }
//        int result = 0;
//        for (int i = temp.length - 1; i >= 0; i--) {
//            for (int j = 0; j < temp[i]; j++) {
//                if(result <= count){
//                    list.add(i);
//                }
//                result += i;
//                count -= i;
//            }
//            if(result > count)
//                break;
//        }
//        return list;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.63%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了34.68%的用户
         */

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = new int[101];
        for (int num : nums) {
            temp[num]++;
            count += num;
        }
        int result = 0;
        a : for (int i = temp.length - 1; i >= 0; i--) {
            for (int j = 0; j < temp[i]; j++) {
                if(result <= count){
                    list.add(i);
                }
                result += i;
                count -= i;
                if(result > count)
                    break a;
            }
        }
        return list;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了36.44%的用户
         */
    }
}
