package hash_table;

import java.util.Arrays;

public class _No_204_CountPrimes {
    public static void main(String[] args) {
        int n = 100;
        int result = countPrimes(n);
        System.out.println("result = " + result);
    }

    public static int countPrimes(int n) {
//        if(n == 0 || n == 1)
//            return 0;
//        n = n - 1;
//        //素数总和
//        int sum = 0;
//        //1000万以内的所有素数
//        //用数组将1000万以内的数分为两大派系，素数用0代替数值，合数用1代替数值；
//        //一开始默认全部为素数，所以值全部为0，等到开始筛选的时候再把为合数的赋值为1
//        int num[] = new int[n];
//        num[0] = 1;          //由于1规定不是素数，所以要提前用1标值
//        //根据埃氏筛法的结论，要得到自然数  N 以内的全部素数，必须把不大于" 二次根号  N "的所有素数的倍数剔除，剩下的就是素数
//        double prescription = Math.sqrt(n);
//        for (int i = 2; i <= prescription; i++) {
//            //开始把所有素数的倍数剔除，剩下的就是素数
//            for (int j = i*i; j <= n; j+=i) {
//                //从i*i开始去除，因为比i*i小的倍数，已经在前面去除过了
//                //例如：i=5
//                //5的2倍（10），3倍（15），在i=2的时候，已经去除过了
//
//                num[j-1] = 1;   //把素数的倍数剔除，也就是赋值为1，不是素数就是合数
//            }
//        }
//        //遍历数组，把值为0的数全部统计出来，得到素数之和
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]==0)
//                sum++;
//        }
//        return sum;
        /**
         * 执行用时：59 ms, 在所有 Java 提交中击败了17.79%的用户
         * 内存消耗：44.3 MB, 在所有 Java 提交中击败了5.02%的用户
         */

//        int result = 0;
//        a : for (int i = 2; i < n; i++) {
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0)
//                    continue a;
//            }
//            result++;
//        }
//        return result;
        /**
         * 超出时间限制
         */

//        boolean[] noPrime = new boolean[n];
//        int prescription = (int) Math.sqrt(n);
//        for (int i = 2; i <= prescription; i++) {
//            for (int j = i * i; j < n; j += i) {
//                noPrime[j] = true;
//            }
//        }
//        System.out.println(Arrays.toString(noPrime));
//        int result = 0;
//        for (int i = 2; i < noPrime.length; i++) {
//            if(!noPrime[i]) {
//                result++;
//            }
//        }
//        return result;
        /**
         * 执行用时：31 ms, 在所有 Java 提交中击败了25.90%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了85.71%的用户
         */

//        boolean[] noPrime = new boolean[n];
//        int prescription = (int) Math.sqrt(n);
//        for (int i = 2; i <= prescription; i++) {
//            if(noPrime[i])
//                continue;
//            for (int j = i * i; j < n; j += i) {
//                noPrime[j] = true;
//            }
//        }
//        System.out.println(Arrays.toString(noPrime));
//        int result = 0;
//        for (int i = 2; i < noPrime.length; i++) {
//            if(!noPrime[i]) {
//                result++;
//            }
//        }
//        return result;
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了87.83%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了86.04%的用户
         */

        boolean[] noPrime = new boolean[n];
        int result = 0;
        if(n > 2)
            result++;
        for (int i = 3; i < n; i += 2) {
            if(!noPrime[i]){
                for (int j = 3; i * j < n; j += 2) {
                    noPrime[i * j] = true;
                }
                result++;
            }
        }
        System.out.println(Arrays.toString(noPrime));
        return result;
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了95.42%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了45.79%的用户
         */

//        if (n <= 2) {
//            return 0;
//        }
//        // 首先去掉一半的偶数
//        int count = n / 2;
//        boolean[] isPrimes = new boolean[n];
//        for (int i = 3; i * i < n; i += 2) {
//            // 不是质数 => continue
//            if (!isPrimes[i])
//                for (int j = i * i; j < n; j += 2 * i) {
//                    if (!isPrimes[j]) {
//                        //                    System.out.println(j + "不是质数");
//                        count--;
//                        isPrimes[j] = true;
//                    }
//                }
//        }
//        return count;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了98.83%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了21.71%的用户
         */
    }
}
