package string;

public class No_38_CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println("result = " + result);
    }

    public static String countAndSay(int n) {
//        String temp = "1";
//        if(n == 1)
//            return temp;
//        for (int i = 1; i < n; i++) {
//            char[] chars = temp.toCharArray();
//            StringBuilder sb = new StringBuilder();
//            int val = 1;
//            for (int j = 1; j < chars.length; j++) {
//                if(chars[j - 1] == chars[j]){
//                    val++;
//                }else{
//                    sb.append(val).append(chars[j - 1]);
//                    val = 1;
//                }
//            }
//            sb.append(val).append(chars[chars.length - 1]);
//            temp = sb.toString();
//        }
//        return temp;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了69.12%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了30.41%的用户
         * 特点：StringBuilder
         */

//        if(n == 1)
//             return "1";
//        String temp = countAndSay(n-1);
//        StringBuilder sb = new StringBuilder();
//        char c = '0';
//        int count = 0;
//        for(int x = 0 ; x < temp.length() ; x++){
//            if(x == 0){
//                c = temp.charAt(x);
//                count = 1;
//            }else{
//                if(temp.charAt(x) == c){
//                    count++;
//                }else{
//                    sb.append(count);
//                    sb.append(c);
//                    c = temp.charAt(x);
//                    count = 1;
//                }
//            }
//        }
//        sb.append(count);
//        sb.append(c);
//        return sb.toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了97.69%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了46.76%的用户
         * 特点：StringBuilder 的递归版
         */

//        String temp = "1";
//        if(n == 1)
//            return temp;
        char[] chars = new char[]{'1'};
        if(n == 1)
            return new String(chars);
        for (int i = 1; i < n; i++) {
//            char[] chars = temp.toCharArray();

            int len = 1;
            for (int j = 1; j < chars.length; j++) {
                if(chars[j - 1] != chars[j])
                    len++;
            }
            char[] res = new char[2 * len];

            int val = 1, index = 0;
            for (int j = 1; j < chars.length; j++) {
                if(chars[j - 1] == chars[j]){
                    val++;
                }else{
                    res[index++] = (char)(val + '0');
                    res[index++] = chars[j - 1];
                    val = 1;
                }
            }
            res[index++] = (char)(val + '0');
            res[index++] = chars[chars.length - 1];
            chars = res;
//            temp = new String(res);
        }
//        return temp;
        return new String(chars);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了97.69%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了47.22%的用户
         * 特点：省去 char[] chars = temp.toCharArray() 的过程
         */
    }
}
