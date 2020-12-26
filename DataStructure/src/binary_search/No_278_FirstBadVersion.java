package binary_search;

import java.util.HashMap;

public class No_278_FirstBadVersion {
    public static void main(String[] args) {
        int n = 1;
        int result = firstBadVersion(n);
        System.out.println("result = " + result);
    }

    public static int firstBadVersion(int n) {
//        int left = 1, right = n;
//        while(left <= right){
//            int mid = (left + right) >>> 1;
//            boolean flag = isBadVersion(mid);
//            if(flag && (mid - 1 < 0 || !isBadVersion(mid - 1))){        //如果 flag == false 则不需要判断 isBadVersion(mid - 1)
//                return mid;
//            }else if(!flag){
//                left = mid + 1;
//            }else{
//                right = mid - 1;
//            }
//        }
//        return -1;
        /**
         * 执行用时：21 ms, 在所有 Java 提交中击败了19.93%的用户
         * 内存消耗：35.6 MB, 在所有 Java 提交中击败了28.68%的用户
         */

        int left = 1, right = n;
        while(left < right){
            int mid = (left + right) >>> 1;
            if(!isBadVersion(mid))
                left = mid + 1;
            else
                right = mid;
        }
        return left;
        /**
         * 执行用时：16 ms, 在所有 Java 提交中击败了98.74%的用户
         * 内存消耗：35.8 MB, 在所有 Java 提交中击败了5.93%的用户
         * 特点：省去 isBadVersion(mid - 1) 判断
         */
    }

    private static boolean isBadVersion(int i) {
        return i == 1;
    }
}
