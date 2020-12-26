package string;

public class No_415_AddStrings {
    public static void main(String[] args) {
        String num1 = "1240";
        String num2 = "678";
        String result = addStrings(num1, num2);
        System.out.println("result = " + result);
    }

    public static String addStrings(String num1, String num2) {
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int alen = a.length - 1, blen = b.length - 1;
        int val = 0, temp = 0;
        StringBuilder sb = new StringBuilder();
        while(alen >= 0 || blen >= 0){
            if(alen < 0){
                val = b[blen--] + temp - '0';
            }else if(blen < 0){
                val = a[alen--] + temp - '0';
            }else{
                val = a[alen--] + b[blen--] + temp - 2 * '0';
            }
//            if(val <= 9){
//                sb.append(val);
//                temp = 0;
//            }else{
//                sb.append(val - 10);
//                temp = 1;
//            }
            sb.append(val % 10);
            temp = val / 10;
        }
        if(temp != 0)
            sb.append(1);
        return sb.reverse().toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.79%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了10.23%的用户
         */

//        StringBuilder s = new StringBuilder();
//        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
//        char[] num1Char = num1.toCharArray();
//        char[] num2Char = num2.toCharArray();
//        while (i >= 0 || j >= 0 || carry != 0) {
//            int x = i < 0 ? 0 : num1Char[i--] - '0';
//            int y = j < 0 ? 0 : num2Char[j--] - '0';
//            int sum = x + y + carry;
//            s.append(sum % 10);//添加到字符串尾部
//            carry = sum / 10;
//        }
//        return s.reverse().toString();//对字符串反转
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.79%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了9.98%的用户
         * 特点：整合temp
         */

    }
}
