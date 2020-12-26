package math;

public class No_1037_ValidBoomerang {
    public static void main(String[] args) {
        int[][] points = {{0,20},{1,0},{0,0}};
//        int[][] points = {{1,1},{2,2},{3,3}};
//        int[][] points = {{1,1},{2,3},{3,2}};
        boolean result = isBoomerang(points);
        System.out.println("result = " + result);
    }

    public static boolean isBoomerang(int[][] points) {
//        return (points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1] - points[0][0] * points[2][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1]) != 0;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.3 MB, 在所有 Java 提交中击败了91.85%的用户
         * 特点：计算三角形面积，判断是否等于0
         *      面积公式S = 1 / 2 * [(x1y2 - x2y1) + (x2y3 - x3y2) + (x3y1 - x1y3)];
         */

        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.3 MB, 在所有 Java 提交中击败了91.85%的用户
         * 特点：
         *      a、b两点的斜率为 k1 = (y2 - y1) / (x2 - x1)
         *      a、c两点的斜率为 k2 = (y3 - y1) / (x3 - x1)
         *      如果在同一直线，则k1 = k2，考虑到分母为 0 的情况，可以直接交叉相乘，省去判断0的情况，直接判断
         *      (y2 - y1) * (x3 - x1) 与 (y3 - y1) * (x2 - x1) 不相等即为不在同一直线上
         */

    }
}
