package array;

public class No_1394_FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        int result = findLucky(arr);
        System.out.println("result = " + result);
    }

    public static int findLucky(int[] arr) {
        int[] temp = new int[501];
        for (int i : arr) {
            temp[i]++;
        }
        for (int i = temp.length - 1; i > 0; i--) {
            if(i == temp[i])
                return i;
        }
        return -1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
