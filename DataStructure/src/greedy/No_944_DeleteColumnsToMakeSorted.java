package greedy;

public class No_944_DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] A = {"cba","daf","ghi"};
//        String[] A = {"zyx", "wvu", "tsr"};
        int result = minDeletionSize(A);
        System.out.println("result = " + result);
    }

    public static int minDeletionSize(String[] A) {
//        int result = 0;
//        int size = A[0].length();
//        a : for (int i = 0; i < size; i++) {
//            int temp = A[0].charAt(i);
//            for (String s : A) {
//                if(temp > s.charAt(i)){
//                    result++;
//                    continue a;
//                }
//                temp = s.charAt(i);
//            }
//        }
//        return result;
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了79.47%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了88.07%的用户
         */

        int result = 0;
        int size = A[0].length();
        a : for (int i = 0; i < size; i++) {
            int temp = A[0].charAt(i);
            for (String s : A) {
                int c = s.charAt(i);
                if(temp > c){
                    result++;
                    continue a;
                }
                temp = c;
            }
        }
        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了98.66%的用户
         * 内存消耗：38.9 MB, 在所有 Java 提交中击败了73.98%的用户
         */
    }
}
