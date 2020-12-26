package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _No_1389_CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int result[] = createTargetArray(nums, index);
        for (int i : result) {
            System.out.print(i + "-->");
        }


    }

    public static int[] createTargetArray(int[] nums, int[] index) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < index.length; i++) {
//            if(index[i] == i){
//                result.add(nums[i]);
//            }else{
//                result.add(index[i], nums[i]);
//            }
//        }
//        int[] array = new int[index.length];
//        int temp = 0;
//        for (Integer integer : result) {
//            array[temp++] = integer;
//        }
//        return array;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了90.02%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了100.00%的用户
         */
        int[] array = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if(index[i] == i){
                array[i] = nums[i];
            }else{
                for (int j = index.length - 1; j > index[i]; j--) {
                    array[j] = array[j - 1];
                }
                array[index[i]] = nums[i];
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了90.02%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
