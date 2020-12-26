package hash_table;

public class No_463_Fastest {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        int result = islandPerimeter(grid);
        System.out.println("result = " + result);
    }

    public static int islandPerimeter(int[][] grid) {
//        int rows = grid.length;
//        if(rows == 0){
//            return 0;
//        }
//        int cols = grid[0].length;
//        int area = 0;
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < cols; j++){
//                if(grid[i][j] == 1){
//                    if(j == 0 || grid[i][j-1] == 0){
//                        area ++;
//                    }
//                    if(i == 0 || grid[i-1][j] == 0){
//                        area++;
//                    }
//                }
//            }
//        }
//        return area * 2;

        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了96.84%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了74.02%的用户
         */

        //重点关注前面遍历过得方格，如果之前有相邻方格，就-2;
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rsp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    rsp += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        rsp -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        rsp -= 2;
                    }
                }
            }
        }
        return rsp;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了96.84%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了98.38%的用户
         */
    }
}
