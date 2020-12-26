package sort;

public class No_976_Fastest {
    public static void main(String[] args) {
        int[] A = {1,2,2,4,18,8};
//        int[] A = {3,2,3,4};
        int result = largestPerimeter(A);
        System.out.println("result = " + result);
    }

    public static int largestPerimeter(int[] A) {
        //最大的数
        int a = getMax(A);
        //第二大的数
        int b = getMax(A);
        //第三大的数
        int c = getMax(A);
        while (c > 0) {
            //如果符合条件就返回
            if ( (b + c) > a) {
                return a + b + c;
            } else {
                a = b;
                b = c;
                c = getMax(A);
            }
        }
        return 0;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.26%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了74.24%的用户
         */
    }

    //获取最大的数，然后把最大的数改成0，也就是获取最大的数之后删掉它
    private static int getMax(int[] A) {
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        int max = A[maxIndex];
        A[maxIndex] = 0;
        return max;
    }
}
