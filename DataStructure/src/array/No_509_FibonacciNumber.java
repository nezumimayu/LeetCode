package array;

public class No_509_FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        int result = fib(n);
        System.out.println("result = " + result);
    }

    public static int fib(int N) {
        int pre = 0, next = 1;
        if(N == 0) return pre;
        if(N == 1) return next;
        int cur = 0;
        for (int i = 2; i <= N; i++) {
            cur = pre + next;
            pre = next;
            next = cur;
        }
        return cur;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.5 MB, 在所有 Java 提交中击败了5.26%的用户
         */
    }
}
