package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class No_697_Fastest {
    public static void main(String[] args) {
//        int[] arr = {2,2,5,5};
//        int[] arr = {1,2,2,3,1};
//        int[] arr = {1,2,2,3,1,4,2};
        int[] arr = {2};
        int result = findShortestSubArray(arr);
        System.out.println("result = " + result);
    }

    public static int findShortestSubArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //找出数组中的最大值和最小值
        for(int i = 0 ; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int[] count = new int[max - min + 1];
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            maxCount = Math.max(maxCount, ++count[nums[i] - min]);
        }
        if(maxCount == 1){
            return 1;
        }
        int ans = nums.length;
        for(int i = 0 ; i < count.length ;i ++){
            if(count[i] == maxCount){
                int l = 0, r = nums.length - 1,target = i + min;
                while(l < r && nums[l] != target){
                    l++;
                }
                while(l < r && nums[r] != target){
                    r--;
                }
                ans = Math.min(ans,r - l + 1);
            }
        }
        return ans;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：44.6 MB, 在所有 Java 提交中击败了19.69%的用户
         * 特点：找出数组中的最大值和最小值，减少桶的数量
         */


//        Map<Integer, Integer> left = new HashMap(),
//                right = new HashMap(), count = new HashMap();
//
//        for (int i = 0; i < nums.length; i++) {
//            int x = nums[i];
//            if (left.get(x) == null) left.put(x, i);
//            right.put(x, i);
//            count.put(x, count.getOrDefault(x, 0) + 1);
//        }
//
//        int ans = nums.length;
//        int degree = Collections.max(count.values());
//        for (int x: count.keySet()) {
//            if (count.get(x) == degree) {
//                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
//            }
//        }
//        return ans;
        /**
         * 执行用时：27 ms, 在所有 Java 提交中击败了74.06%的用户
         * 内存消耗：43.3 MB, 在所有 Java 提交中击败了72.73%的用户
         * 特点：充分利用HashMap数据结构的特点
         */

//        int n = nums.length;
//        if (n == 0) return 0;
//        int[] freq = new int[50000];
//        int d = 0;
//        for (int i : nums) {
//            freq[i]++;
//            d = Math.max(d, freq[i]);
//        }
//        freq = new int[50000];
//        int l = -1, r = 0, ans = Integer.MAX_VALUE;
//        while (r < n) {
//            int v = nums[r];
//            freq[v]++;
//            // 收缩l
//            boolean done = false;
//            while (freq[v] == d) {
//                l++;
//                freq[nums[l]]--;
//                done = true;
//            }
//            if (done) ans = Math.min(ans, r-l+1);
//            r++;
//        }
//        return ans;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了98.02%的用户
         * 内存消耗：42.7 MB, 在所有 Java 提交中击败了96.97%的用户
         * 特点：双指针伸缩窗
         */
    }

}
