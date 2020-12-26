package string;

public class No_541_ReverseStringII {
    public static void main(String[] args) {
//        String str = "abcdefg";
        String str = "abcdefgozhglja";
        int k = 5;
        String result = reverseStr(str, k);
        System.out.println("result = " + result);
    }

    public static String reverseStr(String s, int k) {
//        char[] temp = s.toCharArray();
//        for (int i = 0; i < temp.length; i += 2 * k) {
//            int lef = i;
//            int rig = i + k - 1 >= temp.length ? temp.length - 1 : i + k - 1;
//            while(lef < rig){
//                char c = temp[rig];
//                temp[rig--] = temp[lef];
//                temp[lef++] = c;
//            }
//        }
//        return new String(temp);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了29.30%的用户
         */

        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i += 2 * k) {
            int lef = i;
            int rig = Math.min(i + k - 1, temp.length - 1);
            while(lef < rig){
                temp[lef] ^= temp[rig];
                temp[rig] ^= temp[lef];
                temp[lef++] ^= temp[rig--];
            }
        }
        return new String(temp);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了34.26%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了97.13%的用户
         */
    }
}
