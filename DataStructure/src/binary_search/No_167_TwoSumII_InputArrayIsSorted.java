package binary_search;

import java.util.Arrays;

public class No_167_TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {
//        int[] numbers = {-1,0};
//        int[] numbers = {1,2,3,4,4,9,56,90};
        int[] numbers = {3,24,50,79,88,150,345};
//        int[] numbers = {2, 7, 11, 15};
        int target = 200;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length; i++) {
//            int val = target - numbers[i];
//            int left = i + 1, right = numbers.length - 1;
//            while(left <= right){
//                int mid = (left + right) >> 1;
//                if(numbers[mid] == val){
//                    return new int[]{i + 1, mid + 1};
//                }else if(numbers[mid] < val){
//                    left = mid + 1;
//                }else{
//                    right = mid - 1;
//                }
//            }
//        }
//        return null;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了36.47%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了5.08%的用户
         * 特点：二分查找
         */

//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        for (int number : numbers) {
//            if(number > max)
//                max = number;
//            if(number < min)
//                min = number;
//        }
//        int[] arr = new int[max - min + 1];
//        int[] coords = new int[max - min + 1];
//        for (int number : numbers) {
//            arr[number - min]++;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            arr[numbers[i] - min]++;
//            coords[numbers[i] - min] = i;
//        }
//        int val = 0, first = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            val = target - numbers[i];
//            if(val - min <= arr.length && arr[val - min] > 0){
//                first = i;
//                break;
//            }
//        }
//        return new int[]{first + 1, coords[val - min] + 1};
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了96.66%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了43.42%的用户
         */

        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了96.66%的用户
         * 内存消耗：39 MB, 在所有 Java 提交中击败了78.63%的用户
         * 特点：双指针
         */

//        int i = 0, j = numbers.length - 1;
//        while (i < j) {
//            int m = (i + j) >>> 1;
//            if (numbers[i] + numbers[m] > target) {
//                j = m - 1;
//            } else if (numbers[m] + numbers[j] < target) {
//                i = m + 1;
//            } else if (numbers[i] + numbers[j] > target) {
//                j--;
//            } else if (numbers[i] + numbers[j] < target) {
//                i++;
//            } else {
//                return new int[]{i + 1, j + 1};
//            }
//        }
//        return new int[]{0, 0};
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了96.66%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了5.73%的用户
         * 特点：二分查找 + 双指针
         */
    }
}
