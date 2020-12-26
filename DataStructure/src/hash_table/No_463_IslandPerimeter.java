package hash_table;

public class No_463_IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        int result = islandPerimeter(grid);
        System.out.println("result = " + result);
    }

    public static int islandPerimeter(int[][] grid) {
//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if(grid[i][j] == 1){
//                    result += 4;
//                    if(i > 0 && grid[i - 1][j] == 1)
//                        result--;
//                    if(i < grid.length - 1 && grid[i + 1][j] == 1)
//                        result--;
//                    if(j > 0 && grid[i][j - 1] == 1)
//                        result--;
//                    if(j < grid[0].length - 1 && grid[i][j + 1] == 1)
//                        result--;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了71.39%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了82.54%的用户
         */

//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            int temp = 0;
//            int edge = 0;
//            for (int j = 0; j < grid[i].length; j++) {
//                if(grid[i][j] == 1){
//                    temp++;
//                    if(temp == 1)
//                        edge++;
//                    result += 2;
//                    if(i > 0 && grid[i - 1][j] == 1)
//                        result--;
//                    if(i < grid.length - 1 && grid[i + 1][j] == 1)
//                        result--;
//                }else{
//                    temp = 0;
//                }
//            }
//            result += edge * 2;
//        }
//        return result;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了96.84%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了38.70%的用户
         */

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    if(j == 0 || grid[i][j - 1] == 0)
                        result += 2;
                    result += 2;
                    if(i > 0 && grid[i - 1][j] == 1)
                        result--;
                    if(i < grid.length - 1 && grid[i + 1][j] == 1)
                        result--;
                }
            }
        }
        return result;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了96.84%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了74.02%的用户
         */
    }
}
