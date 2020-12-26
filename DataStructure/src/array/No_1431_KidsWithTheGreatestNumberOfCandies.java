package array;

import java.util.ArrayList;
import java.util.List;

public class No_1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3};
        Integer extraCandies = 3;
        List<Boolean> result = kidsWithCandies(arr, extraCandies);
        for (Boolean aBoolean : result) {
            System.out.println(aBoolean);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        Integer max = 0;
        for (int candy : candies) {
            if(candy > max)
                max = candy;
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.92%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
