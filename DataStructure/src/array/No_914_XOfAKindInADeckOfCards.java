package array;

import java.util.Arrays;

public class No_914_XOfAKindInADeckOfCards {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,4,3,2,1};
//        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
//        int[] arr = {1,1,1,2,2,2,3,3};
//        int[] arr = {1,1};
//        int[] arr = {1,1,2,2,2,2};
        int[] arr = {1,1,1,1,2,2,2,2,2,2};
        boolean result = hasGroupsSizeX(arr);
        System.out.println("result = " + result);
//        System.out.println(getVal(6, 9));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1)
            return false;
        int[] temp = new int[10001];
        for (int i : deck) {
            temp[i]++;
        }

        int index = 0, x = 0;
        for (; index < temp.length; index++) {
            if(temp[index] != 0){
                x = temp[index];
                break;
            }
        }
        for (int i = index + 1; i < temp.length; i++) {
            if(temp[i] != 0){
                x = Math.min(getVal(x, temp[i]), x);
                if(x < 2)
                    return false;
            }
        }
        return true;
    }

    public static int getVal(int m, int n){
//        if(m % n == 0){
//            return n;
//        }else{
//            return getVal(n, m % n);
//        }
        return m % n == 0 ? n : getVal(n, m % n);
    }
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了87.85%的用户
     * 内存消耗：40.5 MB, 在所有 Java 提交中击败了27.00%的用户
     */
}
