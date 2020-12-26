package array;

public class _No_1346_Fastest {
    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,1,7,11};
//        int[] arr = {-16,-13,8};
//        int[] arr = {-2,0,10,-19,4,6,-8};
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,0,0};
//        int[] arr = {7,1,14,11};
        int[] arr = {3,1,7,11};
        boolean result = checkIfExist(arr);
        System.out.println("result = " + result);
    }

    public static boolean checkIfExist(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i] * 2;
//            for (int j = 0; j < arr.length; j++)
//                if (num == arr[j] && i != j)
//                    return true;
//        }
//        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了93.38%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了42.59%的用户
         * 特点：暴力法反而最快？
         */

        //计数
        int[] cnt = new int[2001];
        for (int n : arr) {
            cnt[n + 1000]++;
        }
        for (int n : arr) {
            if (n == 0) {  // 0 的 2 倍还是 0，需要出现 2次
                if (cnt[1000] >= 2)
                    return true;
            } else if (n <= 500 && n >= -500) {  // 2 倍数不能超过数据允许的范围
                if (cnt[n * 2 + 1000] >= 1)
                    return true;
            }
        }
        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了93.38%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了42.59%的用户
         * 特点：计数法遍历原数组，在计数数组中查找数据
         */
    }
}
