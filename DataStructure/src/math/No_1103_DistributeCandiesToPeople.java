package math;

import java.util.Arrays;

public class No_1103_DistributeCandiesToPeople {
    public static void main(String[] args) {
        int candies = 7, num_people = 4;
//        int candies = 10, num_people = 3;
        int[] result = distributeCandies(candies, num_people);
        System.out.println(Arrays.toString(result));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        for (i = 0; i < candies; i++, candies -= i) {
            result[i % num_people] += (i + 1);
            System.out.println(Arrays.toString(result));
        }
        result[i % num_people] += candies;
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了91.10%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了80.43%的用户
         */
    }
}
