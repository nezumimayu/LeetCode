package array;

public class _No_485_MaxConsecutiveOnes {
    public static void main(String[] args) {
//        int[] arr = {1,1,0,1,1,1};
        int[] arr = {1,0,1,1,0,1,0,1,0,1,0,1};
//        int[] arr = {0,0,0};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("result = " + result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                temp++;
            }else{
                if(temp > result)
                    result = temp;
                temp = 0;
            }
        }
        return result > temp ? result : temp;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了94.17%的用户
         * 内存消耗：41.8 MB, 在所有 Java 提交中击败了5.22%的用户
         */
//        int[] temp = new int[10001];
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                index++;
//            }else{
//                temp[index]++;
//            }
//        }
//        int result = 0;
//        for (int i = 0; i < index; i++) {
//            if(temp[i] > result)
//                result = temp[i];
//        }
//        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了35.91%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
