package math;

public class No_258_AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println("result = " + result);
    }

    public static int addDigits(int num) {
        while(num > 9){
            int temp = 0;
            while(num > 0){
                temp += (num % 10);
                num /= 10;
            }
            num = temp;
        }
        return num;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了43.33%的用户
         */

//        return (num - 1) % 9 + 1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了55.38%的用户
         * 特点：x * 100 + y * 10 + z = x * 99 + y * 9 + x + y + z
         */
    }
}
