package dynamic_programming;

public class No_1025_DivisorGame {
    public static void main(String[] args) {
        int N = 3;
        boolean result = divisorGame(N);
        System.out.println("result = " + result);
    }

    public static boolean divisorGame(int N) {
//        return (N & 1) != 1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了5.19%的用户
         */

//        boolean[] res = new boolean[N + 2];
//        res[1] = false;
//        res[2] = true;
//        for (int i = 3; i <= N; i++) {
//            for (int j = 1; j < i; j++) {
//                if(i % j == 0 && !res[i - j]){
//                    res[i] = true;
//                    break;
//                }
//            }
//        }
//        return res[N];
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了22.32%的用户
         * 内存消耗：35.5 MB, 在所有 Java 提交中击败了60.32%的用户
         */

        boolean[] res = new boolean[N + 2];
        res[1] = false;
        res[2] = true;
        for (int i = 3; i <= N; i++) {
            int val = (int) Math.sqrt(i);
            for (int j = 1; j < val; j++) {
                if(i % j == 0 && !res[i - j]){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[N];
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了24.99%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了5.19%的用户
         * 优化：int val = (int) Math.sqrt(i) 减少判断次数
         */
    }
}
