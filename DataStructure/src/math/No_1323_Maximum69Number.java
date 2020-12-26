package math;

public class No_1323_Maximum69Number {
    public static void main(String[] args) {
        int num = 6;
        int result = maximum69Number(num);
        System.out.println("result = " + result);
    }

    public static int maximum69Number (int num) {
        int val = 1000;
        while(val > 0){
            if(num / (3 * val) % 10 == 2)
                break;
            val /= 10;
        }
        return num + 3 * val;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.7 MB, 在所有 Java 提交中击败了66.15%的用户
         */
    }
}

