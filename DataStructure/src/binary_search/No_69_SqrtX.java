package binary_search;

public class No_69_SqrtX {
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("result = " + result);
    }

    public static int mySqrt(int x) {
//        long n = x;
//        while(n > x / n){                   //防止 n * n > x 造成溢出
//            n = (n + (x / n)) / 2;
//        }
//        return Math.toIntExact(n);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了64.38%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了45.69%的用户
         * 特点：使用 n > x / n 代替 n * n > x 防止溢出
         */

        int left = 0, right = x;
        while(left <= right){
            long mid = (left + right) >>> 1;
            if(mid * mid == x){
                return (int)mid;
            }else if(mid * mid > x){
                right = (int)mid - 1;
            }else{
                left = (int)mid + 1;
            }
        }
        return right;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了37.59%的用户
         */
    }
}
