package string;

public class _No_788_RotatedDigits {
    public static void main(String[] args) {
//        int N = 10;
//        int N = 10;
        int N = 1000;
        int result = rotatedDigits(N);
        System.out.println("result = " + result);
    }

    public static int rotatedDigits(int N) {
        int[] temp = new int[]{0,1,2,5,6,8,9};
        int[] target = new int[]{0,1,8};
        int result = 0;
        for (int i : temp) {
            for (int j : temp) {
                for (int k : temp) {
                    for (int l : temp) {
                        int val = i * 1000 + j * 100 + k * 10 + l;
                        if(val > N)
                            return result;
                        int flag = 0;
                        for (int t : target) {
                            if(i == t) flag++;
                            if(j == t) flag++;
                            if(k == t) flag++;
                            if(l == t) flag++;
                        }
                        if(flag < 4)
                            result++;
                    }
                }
            }
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了94.78%的用户
         * 内存消耗：36.7 MB, 在所有 Java 提交中击败了43.96%的用户
         */

//        int result = 0;
//        int i = 0, j = 0, k = 0, l = 0;
//        int target = 0;
//        for (int n = N; n > 0; n--) {
//            target = n;
//            l = target % 10;
//            k = (target /= 10) % 10;
//            j = (target /= 10) % 10;
//            i = (target /= 10) % 10;
//            if((l == 3 || k == 3 || j == 3 || i == 3 || l == 4 || k == 4 || j == 4 || i == 4 || l == 7 || k == 7 || j == 7 || i == 7) || ((l == 0 || l == 1 || l == 8) && (k == 0 || k == 1 || k == 8) && (j == 0 || j == 1 || j == 8) && (i == 0 || i == 1 || i == 8))){
//                continue;
//            }
//            result++;
//        }
//        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了59.38%的用户
         * 内存消耗：36.2 MB, 在所有 Java 提交中击败了93.97%的用户
         */
    }
}
