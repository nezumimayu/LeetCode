package hash_table;

import java.util.Arrays;

public class _No_594_Fastest {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,7,9,11,13,15,17};
//        int[] nums = {-1,-1,0,4,4,4,4};
//        int[] nums = {-1,0,-1,0,-1,0,-1};
//        int[] nums = {1,4,1,3,1,-14,1,-13};
        int[] nums = {1,3,2,2,5,2,3,7};
        int result = findLHS(nums);
        System.out.println("result = " + result);
    }

    public static int findLHS(int[] nums) {
//        Arrays.sort(nums);
//        int begin = 0;
//        int res = 0;
//        for(int end = 1; end < nums.length; end++){
//            while(nums[end] - nums[begin] > 1){
//                begin++;
//            }
//            if(nums[end] - nums[begin] == 1){
//                res = Math.max(res, end - begin + 1);
//            }
//        }
//        return res;
        /**
         * 执行用时：16 ms, 在所有 Java 提交中击败了90.95%的用户
         * 内存消耗：40.8 MB, 在所有 Java 提交中击败了70.65%的用户
         */

        Arrays.sort(nums);
        int start = 0;
        int res = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] - nums[start] > 1) {
                start++;
            }
            if (nums[end] - nums[start] == 1) {
                res = Math.max(res, end - start + 1);
            }
        }
        return res;
        /**
         * 执行用时：14 ms, 在所有 Java 提交中击败了98.92%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了48.81%的用户
         */

//        if (nums.length < 2)
//            return 0;
//        int min = nums[0];
//        int max = nums[0];
//        for (int num : nums) {
//            if (num > max)
//                max = num;
//            if (num < min)
//                min = num;
//        }
//        int len = max - min + 1;
//        int result = 0;
//        if (len < nums.length * 10) {//计数可能超出内存限制
//            int[] map = new int[len];
//            for (int num : nums) {
//                map[num - min]++;
//            }
//            for (int i = 1; i < len; i++) {
//                if (map[i] != 0 && map[i - 1] != 0 && map[i] + map[i - 1] > result)
//                    result = map[i - 1] + map[i];
//            }
//        } else {
//            Arrays.sort(nums);
//            int per = nums[0];
//            int cur = nums[0];
//            int m = 1;
//            int pm = 0;
//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] == cur) {
//                    m++;
//                } else {
//                    if (cur - per == 1 && m + pm > result) {
//                        result = m + pm;
//                    }
//                    per = cur;
//                    cur = nums[i];
//                    m = 1;
//                    pm = m;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了99.57%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了82.77%的用户
         */
    }
}
