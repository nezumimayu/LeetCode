package hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class No_136_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int result = singleNumber(nums);
        System.out.println("result = " + result);
    }

    public static int singleNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            if(!set.contains(i))
//                set.add(i);
//            else{
//                set.remove(i);
//            }
//        }
//        for (Integer i : set) {
//            return i;
//        }
//        return -1;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了19.16%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了96.00%的用户
         */
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue() == 1)
//                return entry.getKey();
//        }
//        return 0;
        /**
         * 执行用时：15 ms, 在所有 Java 提交中击败了6.74%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了89.94%的用户
         */
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.64%的用户
         * 内存消耗：41.2 MB, 在所有 Java 提交中击败了5.05%的用户
         */

    }
}
