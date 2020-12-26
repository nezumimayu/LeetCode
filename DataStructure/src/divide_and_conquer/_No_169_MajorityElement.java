package divide_and_conquer;

import java.util.LinkedList;

public class _No_169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println("result = " + result);
    }

    public static int majorityElement(int[] nums) {
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        for (int num : nums) {
//            if(num > max)
//                max = num;
//            if(num < min)
//                min = num;
//        }
//        int len = max - min;
//        int[] arr = new int[len + 1];
//        for (int num : nums) {
//            arr[num - min]++;
//        }
//        int half = nums.length / 2;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > half)
//                return i + min;
//        }
//        return 0;
        /**
         * java.lang.NegativeArraySizeException: -2147483647
         */

//        LinkedList<Integer> stack = new LinkedList<>();
//        for (int num : nums) {
//            if(stack.isEmpty()){
//                stack.offer(num);
//            }else{
//                if(num != stack.peek())
//                    stack.pollLast();
//                else
//                    stack.offer(num);
//            }
//        }
//        return stack.pollLast();
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了32.84%的用户
         * 内存消耗：44.4 MB, 在所有 Java 提交中击败了5.03%的用户
         */

        int[] stack = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            if(len == 0){
                stack[len++] = num;
            }else{
                if(num != stack[len - 1])
                    len--;
                else
                    stack[len++] = num;
            }
        }
        return stack[len - 1];
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了77.23%的用户
         * 内存消耗：44.3 MB, 在所有 Java 提交中击败了5.97%的用户
         */

    }
}
