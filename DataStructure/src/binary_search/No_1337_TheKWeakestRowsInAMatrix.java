package binary_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class No_1337_TheKWeakestRowsInAMatrix {
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
        int[][] arr = new int[mat.length][2];
        int index = 0;
        for (int[] m : mat) {
            int left = 0, right = m.length - 1, val = m.length;
            while(left <= right){
                int mid = (left + right) >> 1;
                if((mid - 1 < 0 || m[mid - 1] == 1) && m[mid] == 0){
                    val = mid;
                    break;
                }else if(m[mid] == 1){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            arr[index] = new int[]{val, index++};
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return compareTo(o1[1], o2[1]);
                }else{
                    return compareTo(o1[0], o2[0]);
                }
            }
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = arr[i][1];
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了69.26%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了5.05%的用户
         */

//        LinkedList<int[]> list = new LinkedList<>();
//        int index = 0;
//        a : for (int[] m : mat) {
//            int left = 0, right = m.length - 1, val = m.length;
//            while(left <= right){
//                int mid = (left + right) >> 1;
//                if((mid - 1 < 0 || m[mid - 1] == 1) && m[mid] == 0){
//                    val = mid;
//                    break;
//                }else if(m[mid] == 1){
//                    left = mid + 1;
//                }else{
//                    right = mid - 1;
//                }
//            }
//            if(list.isEmpty()){
//                list.add(new int[]{val, index++});
//            }else{
//                int len = Math.min(list.size(), k);
//                for (int i = 0; i < len; i++) {
//                    if(list.get(i)[0] > val){
//                        list.add(i, new int[]{val, index++});
//                        continue a;
//                    }
//                }
//                if(list.size() < k)
//                    list.addLast(new int[]{val, index});
//                index++;
//            }
//        }
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++)
//            result[i] = list.get(i)[1];
//        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了41.07%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了61.78%的用户
         */
    }

    public static int compareTo(int o1, int o2){
        if(o1 > o2){
            return 1;
        }else if(o1 < o2){
            return -1;
        }
        return 0;
    }
}
