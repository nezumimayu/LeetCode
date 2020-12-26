package math;

public class No_1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int n = 234;
        int result = subtractProductAndSum(n);
        System.out.println("result = " + result);
    }

    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while(n > 0){
            int val = n % 10;
            product *= val;
            sum += val;
            n /= 10;
        }
        return product - sum;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了12.65%的用户
         */
    }
}
