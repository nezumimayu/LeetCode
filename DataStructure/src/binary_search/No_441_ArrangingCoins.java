package binary_search;

public class No_441_ArrangingCoins {
    public static void main(String[] args) {
        int n = 1804289383;
        int result = arrangeCoins(n);
        System.out.println("result = " + result);
    }

    public static int arrangeCoins(int n) {
//        int val = 0;
//        while(true){
//            val++;
//            n -= val;
//            if(n < 0)
//                return val - 1;
//        }
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了34.61%的用户
         * 内存消耗：36.1 MB, 在所有 Java 提交中击败了76.59%的用户
         */

        int left = 0, right = n;
        while(left <= right){
            long mid = (left + right) >>> 1;
            long val = (mid * (mid + 1)) >>> 1;
            if(n - val >= 0 && n - val < mid + 1)
                return (int)mid;
            else if(val < n)
                left = (int)mid + 1;
            else
                right = (int)mid - 1;
        }
        return 0;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了83.96%的用户
         * 内存消耗：36.4 MB, 在所有 Java 提交中击败了17.88%的用户
         */
    }
}
