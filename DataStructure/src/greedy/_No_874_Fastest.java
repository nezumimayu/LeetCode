package greedy;

import java.util.*;

public class _No_874_Fastest {
    public static void main(String[] args) {
//        int[] commands = {7,-2,-2,7,5};
//        int[] commands = {4,-1,3};
        int[] commands = {4,-1,4,-2,4};
//        int[][] obstacles = {{-3,2},{-2,1},{0,1},{-2,4},{-1,0},{-2,-3},{0,-3},{4,4},{-3,3},{2,2}};
//        int[][] obstacles = {};
        int[][] obstacles = {{2,4}};
        int result = robotSim(commands, obstacles);
        System.out.println("result = " + result);
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;

        // Encode obstacles (x, y) as (x+30000) * (2^16) + (y+30000)
        Set<Long> obstacleSet = new HashSet();
        for (int[] obstacle: obstacles) {
            long ox = (long) obstacle[0] + 30000;
            long oy = (long) obstacle[1] + 30000;
            obstacleSet.add((ox << 16) + oy);
        }

        int ans = 0;
        for (int cmd: commands) {
            if (cmd == -2)  //left
                di = (di + 3) % 4;
            else if (cmd == -1)  //right
                di = (di + 1) % 4;
            else {
                for (int k = 0; k < cmd; ++k) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
                    if (!obstacleSet.contains(code)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x*x + y*y);
                    }
                }
            }
        }

        return ans;
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了98.07%的用户
         * 内存消耗：44.4 MB, 在所有 Java 提交中击败了36.08%的用户
         */


    }
}
