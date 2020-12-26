package recursion;

public class No_1137_N_thTribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        int result = tribonacci(n);
        System.out.println("result = " + result);
    }

    public static int tribonacci(int n) {
//        if(n == 0 || n == 1 || n == 2)
//            return n == 0 ? 0 : 1;
//        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        /**
         * 超出时间限制
         */

//        if(n == 0 || n == 1 || n == 2)
//            return n == 0 ? 0 : 1;
//        int temp = 0, prv = 0, next = 1, val = 1;
//        for (int i = 3; i < n; i++) {
//            temp = prv;
//            prv = next;
//            next = val;
//            val = temp + prv + next;
//        }
//        return prv + next + val;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.6 MB, 在所有 Java 提交中击败了35.58%的用户
         */

        if(n == 0 || n == 1 || n == 2)
            return n == 0 ? 0 : 1;
        return tri(n, 0,1, 1);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了11.99%的用户
         * 特点：尾递归
         *      由于编译器的优化，当方法调用出现在函数末尾时，没有其它操作要执行，
         *      编译器在编译代码时，就不会开辟新的栈空间，而是直接覆盖当前栈执行。
         *      根据此思路使用尾递归进行求解，当递归到n == 0时，就可得到对应的解。
         */
    }

    public static int tri(int n, int res1, int res2, int res3) {
        if (n <= 0)
            return res1;
        return tri(n - 1, res2, res3, res1 + res2 + res3);
    }
}
