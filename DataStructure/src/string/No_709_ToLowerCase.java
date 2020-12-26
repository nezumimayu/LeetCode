package string;

public class No_709_ToLowerCase {
    public static void main(String[] args) {
//        String str = "HellO";
        String str = "al&phaBET";
        String result = toLowerCase(str);
        System.out.println("result = " + result);
    }

    public static String toLowerCase(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            if((int) c <= 90 && (int)c >= 65)
//                sb.append((char)(c + 32));
//            else
//                sb.append(c);
//        }
//        return sb.toString();
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了33.11%的用户
         */

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c |= 32);
        }
        return sb.toString();
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了24.66%的用户
         * 特点：位运算技巧
         *      大写变小写、小写变大写 : 字符 ^= 32;
         *      大写变小写、小写变小写 : 字符 |= 32;
         *      小写变大写、大写变大写 : 字符 &= -33;
         */
    }
}
