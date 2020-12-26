package array;

public class No_1232_CheckIfItIsAStraightLine {
    public static void main(String[] args) {
//        int[][] arr = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
//        int[][] arr = {{0,0},{0,1},{0,-1}};
//        int[][] arr = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
//        int[][] arr = {{1,1},{2,2},{2,0}};
//        int[][] arr = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
        int[][] arr = {{2,1},{4,2},{6,3}};
        boolean result = checkStraightLine(arr);
        System.out.println("result = " + result);
    }

    public static boolean checkStraightLine(int[][] coordinates) {
//        double lef = coordinates[1][0] - coordinates[0][0];
//        double rig = coordinates[1][1] - coordinates[0][1];
//        double temp = 0;
//
//        if(lef == 0){
//            double val = lef / rig;
//            for (int i = 0; i + 1 < coordinates.length; i++) {
//                rig = coordinates[i + 1][0] - coordinates[i][0];
//                lef = coordinates[i + 1][1] - coordinates[i][1];
//                temp = rig / lef;
//                if(coordinates[i + 1][1] - coordinates[i][1] == 0 || temp != val)
//                    return false;
//            }
//        }else{
//            double val = rig / lef;
//            for (int i = 0; i + 1 < coordinates.length; i++) {
//                rig = coordinates[i + 1][1] - coordinates[i][1];
//                lef = coordinates[i + 1][0] - coordinates[i][0];
//                temp = rig / lef;
//                if(coordinates[i + 1][0] - coordinates[i][0] == 0 || temp != val)
//                    return false;
//            }
//        }
//        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了88.24%的用户
         */
        for (int i = 1; i < coordinates.length - 1; i++) {
            int res1 = (coordinates[i][0] - coordinates[i - 1][0]) * (coordinates[i + 1][1] - coordinates[i][1]);
            int res2 = (coordinates[i + 1][0] - coordinates[i][0]) * (coordinates[i][1] - coordinates[i - 1][1]);
            if (res1 != res2)
                return false;
        }
        return true;
    }
}
