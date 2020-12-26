package binary_search;

import java.util.Arrays;
import java.util.Comparator;

public class No_1337_Fastest {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
//        int[][] mat = {{1,1},{1,0},{1,0},{1,1},{0,0},{1,1}};
        int k = 3;
        int[] result = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int left = 0, right = mat[i].length - 1, val = mat[i].length;
            while(left <= right){
                int mid = (left + right) >> 1;
                if((mid - 1 < 0 || mat[i][mid - 1] == 1) && mat[i][mid] == 0){
                    val = mid;
                    break;
                }else if(mat[i][mid] == 1){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            int num = val * 100 + i;
            arr[i] = num;
        }
        Arrays.sort(arr);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i] % 100;
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.87%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了53.12%的用户
         */
    }
}
