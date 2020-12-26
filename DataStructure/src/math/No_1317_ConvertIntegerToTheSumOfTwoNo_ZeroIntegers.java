package math;

import java.util.Arrays;
import java.util.Random;

public class No_1317_ConvertIntegerToTheSumOfTwoNo_ZeroIntegers {
    public static void main(String[] args) {
        int n = 11;
        int[] result = getNoZeroIntegers(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getNoZeroIntegers(int n) {
        while(true){
//            Random rand = new Random();
//            int first = rand.nextInt(n - 1) + 1;
            /**
             * 执行用时：2 ms, 在所有 Java 提交中击败了17.07%的用户
             * 内存消耗：37 MB, 在所有 Java 提交中击败了18.18%的用户
             */
            int first = (int) (Math.random() * n + 1);
            /**
             * 执行用时：1 ms, 在所有 Java 提交中击败了82.71%的用户
             * 内存消耗：37 MB, 在所有 Java 提交中击败了18.18%的用户
             * 特点：返回的数值是[0.0,1.0）的double型数值，由于double类数的精度很高，
             *      可以在一定程度下看做随机数，借助（int）来进行类型转换就可以得到整数随机数
             */
            int next = n - first;
            if(noZero(first) && noZero(next))
                return new int[]{first, next};
        }

    }

    private static boolean noZero(int val) {
        while(val > 0){
            if(val % 10 == 0)
                return false;
            val /= 10;
        }
        return true;
    }
}
