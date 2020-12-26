package math;

import java.util.Arrays;

public class No_1103_Fastest {
    public static void main(String[] args) {
        int candies = 7, num_people = 4;
//        int candies = 10, num_people = 3;
        int[] result = distributeCandies(candies, num_people);
        System.out.println(Arrays.toString(result));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        // how many people received complete gifts
        int p = (int)(Math.sqrt(2 * candies + 0.25) - 0.5);
        int remaining = (int)(candies - (p + 1) * p * 0.5);
        int rows = p / n, cols = p % n;

        int[] d = new int[n];
        for(int i = 0; i < n; ++i) {
            // complete rows
            d[i] = (i + 1) * rows + (int)(rows * (rows - 1) * 0.5) * n;
            // cols in the last row
            if (i < cols)
                d[i] += i + 1 + rows * n;
        }
        // remaining candies
        d[cols] += remaining;
        return d;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了88.82%的用户
         */
    }
}
