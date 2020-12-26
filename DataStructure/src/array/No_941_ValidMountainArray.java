package array;

public class No_941_ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,5};
//        int[] arr = {2, 1};
//        int[] arr = {0,3,2,1};
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        boolean result = validMountainArray(arr);
        System.out.println("result = " + result);
    }

    public static boolean validMountainArray(int[] A) {
//        if(A.length < 3 || A[0] >= A[1] || A[A.length - 2] <= A[A.length - 1])
//            return false;
//        int l = 0, r = A.length - 1;
//        for (; l + 1 < A.length; l++) {
//            if(A[l] >= A[l + 1])
//                break;
//        }
//        System.out.println("l = " + l);
//        for (; r - 1 >= 0; r--) {
//            if(A[r - 1] <= A[r])
//                break;
//        }
//        System.out.println("r = " + r);
//        return l == r;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了49.88%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了70.21%的用户
         */
        if(A.length < 3 || A[0] >= A[1] || A[A.length - 2] <= A[A.length - 1])
            return false;
        int l = 0, r = A.length - 1;
        while(l < r){
            if(A[l] < A[l + 1]){
                l++;
            }else if(A[r - 1] > A[r]){
                r--;
            }else{
                return false;
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了96.81%的用户
         */
    }
}
