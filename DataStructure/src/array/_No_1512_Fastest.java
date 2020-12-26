package array;

public class _No_1512_Fastest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(nums);
        System.out.println("result = " + result);
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        Integer index = 0;
        for (int num : nums) {
            index += temp[num - 1];
            temp[num - 1]++;
        }
        return index;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.2 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }

    public static int numIdenticalPairs2(int[] nums) {
        //一个数出现了n次的话，这个数的好数对就是n*(n-1)/2
        int[] temp = new int[101];
        int count = 0;
        for(int i:nums){
            ++temp[i];
        }
        for(int i:temp){
            if(i==0);
            else{
                count += (i * (i - 1) / 2);
            }
        }
        return count;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
