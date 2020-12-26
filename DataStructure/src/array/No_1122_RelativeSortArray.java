package array;

import java.util.Arrays;

public class No_1122_RelativeSortArray {
    public static void main(String[] args) {
//        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
//        int[] arr2 = {2,1,4,3,9,6};
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = {2,42,38,0,43,21};
        int[] result = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] temp = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            temp[arr1[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while(temp[arr2[i]] > 0){
                arr1[index++] = arr2[i];
                temp[arr2[i]]--;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0)
                while(temp[i]-- > 0)
                    arr1[index++] = i;
        }
        return arr1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了10.00%的用户
         */
    }
}
