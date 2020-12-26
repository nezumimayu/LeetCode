package array;

public class No_717_1_bitAnd2_bitCharacters {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 0};
        int[] arr = {1, 1, 1, 0};
        boolean result = isOneBitCharacter(arr);
        System.out.println("result = " + result);
    }

    public static boolean isOneBitCharacter(int[] bits) {
//        for (int i = 0; i < bits.length; i++) {
//            if(bits[i] == 1){
//                i++;
//            }else{
//                if(i == bits.length - 1)
//                    return true;
//            }
//        }
//        return false;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了40.68%的用户
         */

        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 0) {
                return (bits.length - 1 - i - 1) % 2 == 0;
            }
        }
        return (bits.length - 1) % 2 == 0;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了40.68%的用户
         * 特点：最后0是否为1比特，只与最后一个元素0的前面的连续1的个数有关系
         */
    }
}
