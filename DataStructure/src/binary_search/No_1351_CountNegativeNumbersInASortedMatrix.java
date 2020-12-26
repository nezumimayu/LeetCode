package binary_search;

public class No_1351_CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int result = countNegatives(grid);
        System.out.println("result = " + result);
    }

    public static int countNegatives(int[][] grid) {
//        int result = 0;
//        for (int[] g : grid) {
//            for (int i = g.length - 1; i >= 0; i--) {
//                if(g[i] < 0)
//                    result++;
//                else
//                    break;
//            }
//        }
//        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了45.40%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了5.13%的用户
         * 特点：暴力法
         */

//        int result = 0;
//        for (int[] arr : grid) {
//            int left = 0, right = arr.length - 1;
//            while(left <= right){
//                int mid = (left + right) / 2;
//                if((mid - 1 < 0 || arr[mid - 1] >= 0) && arr[mid] < 0){
//                    result += (arr.length - mid);
//                    break;
//                }else if(arr[mid] >= 0){
//                    left = mid + 1;
//                }else if(arr[mid] < 0){
//                    right = mid - 1;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了80.04%的用户
         */

        int result = 0;
        int left = 0, right = grid[0].length - 1;
        for (int[] arr : grid) {
            left = 0;
            while(left <= right){
                int mid = (left + right) / 2;
                if((mid - 1 < 0 || arr[mid - 1] >= 0) && arr[mid] < 0){
                    result += (arr.length - mid);
                    right = mid;
                    break;
                }else if(arr[mid] >= 0){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了50.76%的用户
         * 特点：每一行从前往后第一个负数的位置是不断递减的
         */
    }
}
