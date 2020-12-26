package array;

public class _No_1252_Fastest {
    public static void main(String[] args) {
        int n = 2, m = 2;
        int[][] arr = {{1,1}, {0,0}};
        Boolean[] nums = new Boolean[n * m];
        int result = oddCells(n, m, arr);
        System.out.println("result = " + result);
    }

    public static int oddCells(int n, int m, int[][] indices) {
//        int[] row = new int[n];
//        int[] col = new int[m];
//
//        for (int i = 0; i < indices.length; i++) {
//            row[indices[i][0]]++;
//            col[indices[i][1]]++;
//        }
//
//        int ans = 0;
//        for (int i = 0; i < n; i++)
//            for (int j = 0; j < m; j++) {
//                if ((row[i] + col[j]) % 2 > 0)
//                    ans++;
//            }
//        return ans;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了80.22%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了33.33%的用户
         */
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];

        for(int i = 0; i < indices.length; i++){
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }

        int rr = 0, cc = 0;
        for(int i = 0; i < r.length; i++){
            if(r[i]) rr++;
        }

        for(int i = 0; i < c.length; i++){
            if(c[i]) cc++;
        }

        return rr * m + cc * n - rr * cc * 2;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了33.33%的用户
         */

    }
}
