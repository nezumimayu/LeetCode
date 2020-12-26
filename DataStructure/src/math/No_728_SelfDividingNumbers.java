package math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class No_728_SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> result = selfDividingNumbers(left, right);
        for (Integer i : result) {
            System.out.print(i + " -> ");
        }
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(selfDividing(i))
                result.add(i);
        }
        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了89.15%的用户
         * 内存消耗：36.3 MB, 在所有 Java 提交中击败了75.60%的用户
         */
    }

    private static boolean selfDividing(int val) {
        int temp = val;
        while(temp > 0){
            int i = temp % 10;
            if(i == 0 || val % i != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
}
