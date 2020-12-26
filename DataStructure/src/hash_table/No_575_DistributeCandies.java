package hash_table;

import java.util.Arrays;
import java.util.HashSet;

public class No_575_DistributeCandies {
    public static void main(String[] args) {
//        int[] candies = {1,1,2,2,3,3};
        int[] candies = {1,1,2,3};
        int result = distributeCandies(candies);
        System.out.println("result = " + result);
    }

    public static int distributeCandies(int[] candies) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < candies.length && set.size() < candies.length / 2; i++) {
//            set.add(candies[i]);
//        }
//        return set.size();
        /**
         * 执行用时：26 ms, 在所有 Java 提交中击败了96.03%的用户
         * 内存消耗：41.7 MB, 在所有 Java 提交中击败了51.32%的用户
         */

//        int[] temp = new int[200001];
//        int result = 0;
//        for (int candy : candies) {
//            if(temp[candy + 100000] == 0){
//                temp[candy + 100000]++;
//                result++;
//            }
//            if(result > candies.length / 2)
//                return candies.length / 2;
//        }
//        return result;
        /**
         * 执行用时：12 ms, 在所有 Java 提交中击败了97.48%的用户
         * 内存消耗：42 MB, 在所有 Java 提交中击败了17.74%的用户
         */

//        int half = candies.length >>> 1;
//
//        int typeCount = 0;
//        boolean[] array = new boolean[200001];
//        for (int candy : candies) {
//            candy += 100000;
//            if (!array[candy]) {
//                array[candy] = true;
//                typeCount++;
//
//                if (typeCount == half) {
//                    return typeCount;
//                }
//            }
//        }
//        return typeCount;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.2 MB, 在所有 Java 提交中击败了87.39%的用户
         * 特点：计数排序只需进行一次判断，可用boolean[]代替
         */

        boolean[] temp = new boolean[200001];
        int result = 0, half = candies.length / 2;
        for (int candy : candies) {
            if(!temp[candy + 100000]){
                temp[candy + 100000] = true;
                result++;
            }
            if(result > half)
                return half;
        }
        return result;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：41.4 MB, 在所有 Java 提交中击败了82.85%的用户
         */
    }
}
