package array;

public class No_896_MonotonicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
//        int[] arr = {1,3,2};
//        int[] arr = {1,1,1};
        boolean result = isMonotonic(arr);
        System.out.println("result = " + result);
    }

    public static boolean isMonotonic(int[] A) {
//        boolean flag = false;
//        for (int i = 0; i + 1 < A.length; i++) {
//            if(A[i] > A[i + 1]){
//                flag = true;
//                break;
//            }
//        }
        boolean flag = A[0] > A[A.length - 1];
        if(flag){
            for (int i = 0; i + 1 < A.length; i++) {
                if(A[i] < A[i + 1])
                    return false;
            }
        }else{
            for (int i = 0; i + 1 < A.length; i++) {
                if(A[i] > A[i + 1])
                    return false;
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：47.6 MB, 在所有 Java 提交中击败了71.43%的用户
         */
    }
}
