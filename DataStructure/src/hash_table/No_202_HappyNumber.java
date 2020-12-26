package hash_table;

import java.util.HashSet;

public class No_202_HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        boolean result = isHappy(n);
        System.out.println("result = " + result);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int result = n;
        while(result != 1){
            n = result;
            result = 0;
            while(n > 0){
                result += Math.pow(n % 10, 2);
                n /= 10;
            }
            System.out.println(result);
            if(set.contains(result))
                return false;
            set.add(result);
        }
        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了49.76%的用户
         * 内存消耗：36.8 MB, 在所有 Java 提交中击败了57.33%的用户
         */
    }
}
