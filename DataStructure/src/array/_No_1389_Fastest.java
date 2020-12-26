package array;

import java.util.Arrays;

public class _No_1389_Fastest {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int result[] = createTargetArray(nums, index);
        for (int i : result) {
            System.out.print(i + "-->");
        }


    }

    public static int[] createTargetArray(int[] nums, int[] index) {
//        for (int i = 0; i < index.length; i++) {
//            if (i > index[i]) {
//                int temp = nums[i];
//                for (int j = i - 1; j >= index[i]; j--) {
//                    nums[j + 1] = nums[j];
//                }
//                nums[index[i]] = temp;
//            }
//        }
//        return nums;

        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < i; j++)
                index[j] += index[j] >= index[i] ? 1 : 0;
        for (int i = 0; i < len; i++)
            ans[index[i]] = nums[i];
        return ans;
    }
}
