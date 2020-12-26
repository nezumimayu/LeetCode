package string;

public class No_1374_GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        int k = 4;
        String result = generateTheString(k);
        System.out.println("result = " + result);
    }

    public static String generateTheString(int n) {
//        StringBuilder sb = new StringBuilder();
//        if((n & 1) == 1){
//            for (int i = 0; i < n; i++) {
//                sb.append('a');
//            }
//        }else{
//            for (int i = 0; i < n - 1; i++) {
//                sb.append('a');
//            }
//            sb.append('b');
//        }
//        return sb.toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.08%的用户
         * 内存消耗：37.2 MB, 在所有 Java 提交中击败了55.55%的用户
         */

        char[] temp = new char[n];
        if((n & 1) == 1){
            for (int i = 0; i < n; i++) {
                temp[i] = 'a';
            }
        }else{
            for (int i = 0; i < n - 1; i++) {
                temp[i] = 'a';
            }
            temp[n - 1] = 'b';
        }
        return new String(temp);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.08%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了69.84%的用户
         * 特点：用char数组代替 StringBuilder
         */
    }
}
