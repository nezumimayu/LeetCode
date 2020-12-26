package math;

public class No_1175_PrimeArrangements {
    public static void main(String[] args) {
        int n = 15;
        int result = numPrimeArrangements(n);
        System.out.println("result = " + result);
    }

    public static int numPrimeArrangements(int n) {
        boolean[] noPrime = new boolean[n + 1];
        int prime = 0;
        if(n > 2)
            prime++;
        for (int i = 3; i <= n; i += 2) {
            if(!noPrime[i]){
                for (int j = 3; i * j <= n; j += 2) {
                    noPrime[i * j] = true;
                }
                prime++;
            }
        }
        long val = 1;
        for (int i = 1; i <= prime; i++){
            val = (val * i) % 1000000007;
        }
        long temp = 1;
        for (int i = 1; i <= n - prime; i++) {
            temp = (temp * i) % 1000000007;
        }
        return (int)((val * temp) % 1000000007);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：35.4 MB, 在所有 Java 提交中击败了84.21%的用户
         */
    }
}
