package interview;

import java.util.Arrays;
import java.util.HashMap;

public class _3k_No_1_TwoSum {
    public static void main(String[] args) {
        //        int[] arr = {2, 7, 11, 15};
        int[] arr = {3,3};
//        int[] arr = {0,4,3,0};
//        int[] arr = {-3,4,3,90};
//        int[] arr = {-1,-2,-3,-4,-5};
        int k = 6;
        int[] result = twoSum(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{i, map.get(temp)};
            }
        }
        return new int[]{};
    }
}
