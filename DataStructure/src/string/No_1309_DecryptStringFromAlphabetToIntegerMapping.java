package string;

import java.time.temporal.ValueRange;

public class No_1309_DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
//        String str = "10#11#12";
        String str = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String result = freqAlphabets(str);
        System.out.println("result = " + result);
    }

    public static String freqAlphabets(String s) {
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(i + 2 <= chars.length - 1 && chars[i + 2] == '#'){
////                String val = String.valueOf(new char[] {chars[i], chars[i + 1]});
//                sb.append((char)(Integer.parseInt(String.valueOf(new char[] {chars[i], chars[i + 1]})) + 96));
//                i+=2;
//            }else{
//                sb.append((char)(Integer.parseInt(String.valueOf(chars[i])) + 96));
//            }
//        }
//        return sb.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了40.00%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了20.00%的用户
         */

//        char[] temp = new char[]{'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            StringBuilder val = new StringBuilder();
//            if(i + 2 <= chars.length - 1 && chars[i + 2] == '#'){
//                val.append(chars[i]);
//                val.append(chars[i + 1]);
//                sb.append(temp[Integer.parseInt(String.valueOf(val))]);
//                i+=2;
//            }else{
//                val.append(chars[i]);
//                sb.append(temp[Integer.parseInt(val.toString())]);
//            }
//        }
//        return sb.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了40.00%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了17.14%的用户
         */

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i + 2 <= chars.length - 1 && chars[i + 2] == '#'){
                if(chars[i] == '1'){
                    sb.append((char) (chars[i + 1] + 58));
                }else{
                    sb.append((char) (chars[i + 1] + 68));
                }
                i+=2;
            }else{
                sb.append((char) (chars[i] + 48));
            }
        }
        return sb.toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了82.47%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了96.43%的用户
         */
    }
}
