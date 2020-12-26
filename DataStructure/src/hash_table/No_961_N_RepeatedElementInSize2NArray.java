package hash_table;

public class No_961_N_RepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,3};
        int result = repeatedNTimes(A);
        System.out.println("result = " + result);
    }

    public static int repeatedNTimes(int[] A) {
        boolean[] temp = new boolean[10001];
        for (int i : A) {
            if(temp[i]){
                return i;
            }else{
                temp[i] = true;
            }
        }
        return 0;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了80.57%的用户
         */
    }
}
