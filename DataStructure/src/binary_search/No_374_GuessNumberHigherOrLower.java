package binary_search;

public class No_374_GuessNumberHigherOrLower {
    public static void main(String[] args) {
        int n = 2126753390;
        int target = 1702766719;
        int result = guessNumber(n);
        System.out.println("result = " + result);
    }

    public static int guessNumber(int n) {
        int left = 0, right = n;
        while(left <= right){
            int mid = (left + right) >>> 1;
//            int mid = left + (right - left) / 2;
            if(guess(mid) == 0)
                return mid;
            else if(guess(mid) == -1)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.6 MB, 在所有 Java 提交中击败了48.78%的用户
         * 特点：为防止溢出可写为：int mid = left + (right - left) / 2;
         */
    }

    private static int guess(int num) {
        int target = 1702766719;
        if(num == target)
            return 0;
        return num > target ? -1 : 1;
    }
}
