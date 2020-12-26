package array;

public class No_896_Fastest {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,3};
//        int[] arr = {1,3,2};
        int[] arr = {1,1,1};
        boolean result = isMonotonic(arr);
        System.out.println("result = " + result);
    }

    public static boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public static boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public static boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }

    public static boolean isMonotonic2(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i+1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }
        return true;
    }

}
