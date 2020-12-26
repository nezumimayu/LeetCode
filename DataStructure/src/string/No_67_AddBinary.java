package string;

public class No_67_AddBinary {
    public static void main(String[] args) {
//        String a = "1010";
//        String b = "1011";
        String a = "111010101011";
        String b = "111";
        String result = addBinary(a, b);
        System.out.println("result = " + result);
    }

    public static String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int alen = A.length - 1, blen = B.length - 1;
        StringBuilder sb = new StringBuilder();
        int temp = 0, val = 0;
        while(alen >= 0 || blen >= 0){
            if(alen < 0){
                val = B[blen--] + temp - '0';
            }else if(blen < 0){
                val = A[alen--] + temp - '0';
            }else{
                val = A[alen--] + B[blen--] + temp - 2 * '0';
            }
            if(val <= 1){
                sb.append(val);
                temp = 0;
            }else{
                sb.append(val - 2);
                temp = 1;
            }
        }
        if(temp != 0)
            sb.append(1);
        return sb.reverse().toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了98.72%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了49.45%的用户
         */

//        StringBuilder sb = new StringBuilder();
//        int i = a.length() - 1, j = b.length() - 1, c = 0;
//        while (i >= 0 || j >= 0 || c != 0){
//            int a1 = 0, b1 = 0;
//            if (i >= 0) a1 = a.charAt(i--) - '0';
//            if (j >= 0) b1 = b.charAt(j--) - '0';
//            sb.append(a1^b1^c);
//            c = a1 + b1 + c >= 2 ? 1 : 0;
//        }
//        return sb.reverse().toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了98.72%的用户
         * 内存消耗：38.4 MB, 在所有 Java 提交中击败了67.53%的用户
         */
    }
}
