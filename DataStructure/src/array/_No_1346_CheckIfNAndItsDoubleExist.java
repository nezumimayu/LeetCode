package array;

import java.util.HashMap;

public class _No_1346_CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,1,7,11};
//        int[] arr = {-16,-13,8};
//        int[] arr = {-2,0,10,-19,4,6,-8};
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,0,0};
//        int[] arr = {7,1,14,11};
        int[] arr = {3,1,7,11};
        boolean result = checkIfExist(arr);
        System.out.println("result = " + result);
    }

    public static boolean checkIfExist(int[] arr) {
//        HashMap<Integer, Integer> temp = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(temp.containsKey(2 * arr[i]) || ((arr[i] & 1) != 1 && temp.containsKey(arr[i] / 2)))
//                return true;
//            temp.put(arr[i], i);
//        }
//        return false;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了80.58%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了57.41%的用户
         */
        int[] pos = new int[1001];
        int[] neg = new int[1001];
        int nmax = 0, pmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                neg[-arr[i]]++;
                nmax = Math.max(-arr[i], nmax);
            }else{
                pos[arr[i]]++;
                pmax = Math.max(arr[i], pmax);
            }
        }
//        if(pos[0] == 2)
//            return true;
//        for (int i = 1; i <= pmax / 2; i++) {
//            if(pos[i] != 0 && pos[2 * i] > 0)
//                return true;
//        }
//        for (int i = 0; i <= nmax / 2; i++) {
//            if(neg[i] != 0 && neg[2 * i] > 0)
//                return true;
//        }
        for (int i : arr) {
            if(i == 0){
                if(pos[i] >= 2)
                    return true;
            }else if(i <= 500 && i > 0){
                if(pos[2 * i] > 0)
                    return true;
            }else if(i >= -500 && i < 0){
                if(neg[2 * i] > 0)
                    return true;
            }
        }
        return false;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了80.58%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了16.66%的用户
         */
    }
}
