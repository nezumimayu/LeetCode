package dynamic_programming;

public class No_70_ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int result = climbStairs(n);
        System.out.println("result = " + result);
    }

    public static int climbStairs(int n) {
//        if(n <= 2)
//            return n;
//        int[] arr = new int[n + 1];
//        arr[1] = 1;
//        arr[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        return arr[n];
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.3 MB, 在所有 Java 提交中击败了87.44%的用户
         * 特点：DP
         */

        int pre = 0, next = 0, result = 1;
        for (int i = 1; i <= n; i++) {
            next = pre;
            pre = result;
            result = pre + next;
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.6 MB, 在所有 Java 提交中击败了45.24%的用户
         * 特点：DP的状态压缩
         */
    }
}
