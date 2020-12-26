package sort;

import java.util.LinkedList;
import java.util.Queue;

public class No_1030_MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        int R = 2;
        int C = 3;
        int r0 = 1;
        int c0 = 2;
        int[][] result = allCellsDistOrder(R, C, r0, c0);
        for (int[] r : result) {
            for (int i : r) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result = new int[R * C][2];
        int index = 0, deep = 1;
        result[index++] = new int[]{r0, c0};
        while(index < R * C){
            if(c0 - deep >= 0)
                result[index++] = new int[]{r0, c0 - deep};
            if(c0 + deep < C)
                result[index++] = new int[]{r0, c0 + deep};
            if(r0 - deep >= 0)
                result[index++] = new int[]{r0 - deep, c0};
            if(r0 + deep < R)
                result[index++] = new int[]{r0 + deep, c0};
            for (int i = 1; i < deep; i++) {                //↘
                if(r0 + i < R && c0 + (deep - i) < C)
                    result[index++] = new int[]{r0 + i, c0 + (deep - i)};
            }
            for (int i = 1; i < deep; i++) {                //↙
                if(r0 + i < R && c0 - (deep - i) >= 0)
                    result[index++] = new int[]{r0 + i, c0 - (deep - i)};
            }
            for (int i = 1; i < deep; i++) {                //↗
                if(r0 - i >= 0 && c0 + (deep - i) < C)
                    result[index++] = new int[]{r0 - i, c0 + (deep - i)};
            }
            for (int i = 1; i < deep; i++) {                //↖
                if(r0 - i >= 0 && c0 - (deep - i) >= 0)
                    result[index++] = new int[]{r0 - i, c0 - (deep - i)};
            }
            deep++;
        }
        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了96.86%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了64.46%的用户
         */

//        int[][] result = new int[R * C][2];
//        boolean[][] isVisit = new boolean[R][C];
//        int index = 0;
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[]{r0, c0});
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                int[] curr = queue.poll();
//                if(!isVisit[curr[0]][curr[1]]){
//                    isVisit[curr[0]][curr[1]] = true;
//                    result[index++] = curr;
//                    if(curr[1] - 1 >= 0 && !isVisit[curr[0]][curr[1] - 1])      //←
//                        queue.offer(new int[]{curr[0], curr[1] - 1});
//                    if(curr[1] + 1 < C && !isVisit[curr[0]][curr[1] + 1])       //→
//                        queue.offer(new int[]{curr[0], curr[1] + 1});
//                    if(curr[0] - 1 >= 0 && !isVisit[curr[0] - 1][curr[1]])      //↑
//                        queue.offer(new int[]{curr[0] - 1, curr[1]});
//                    if(curr[0] + 1 < R && !isVisit[curr[0] + 1][curr[1]])       //↓
//                        queue.offer(new int[]{curr[0] + 1, curr[1]});
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：19 ms, 在所有 Java 提交中击败了37.95%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了78.05%的用户
         */
    }
}
