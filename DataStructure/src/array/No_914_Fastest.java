package array;

public class No_914_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,4,3,2,1};
//        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
//        int[] arr = {1,1,1,2,2,2,3,3};
//        int[] arr = {1,1};
//        int[] arr = {1,1,2,2,2,2};
        int[] arr = {1,1,1,1,2,2,2,2,2,2};
        boolean result = hasGroupsSizeX(arr);
        System.out.println("result = " + result);
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int c : deck)
            count[c]++;

        int g = -1;
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0) {
                if (g == -1)
                    g = count[i];
                else
                    g = gcd(g, count[i]);
            }

        return g >= 2;
    }

    public static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了87.85%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了22.00%的用户
     */
}
