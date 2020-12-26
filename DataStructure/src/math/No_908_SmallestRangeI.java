package math;

public class No_908_SmallestRangeI {
    public static void main(String[] args) {
        int[] A = {0,10};
        int K = 2;
        int resutl = smallestRangeI(A, K);
        System.out.println("resutl = " + resutl);
    }

    public static int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : A) {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }
//        if(max - min <= 2 * K)
//            return 0;
//        else
//            return max - min - 2 * K;
        return Math.max(0, max - min - 2 * K);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了11.47%的用户
         */
    }
}
