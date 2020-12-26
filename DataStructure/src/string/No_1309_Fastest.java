package string;

public class No_1309_Fastest {
    public static void main(String[] args) {
//        String str = "10#11#12";
        String str = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String result = freqAlphabets(str);
        System.out.println("result = " + result);
    }

    public static String freqAlphabets(String s) {
//        StringBuilder builder = new StringBuilder();
//        char[] chars = s.toCharArray();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            if (chars[i] == '#') {
//                builder.append((char) (chars[--i] - 48 + (chars[--i] - 48) * 10 + 96));
//            } else {
//                builder.append((char) (chars[i] + 48));
//            }
//        }
//        return builder.reverse().toString();
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了45.00%的用户
         * 特点：倒叙查找
         */

        char[] alphabetChars = new char[27];
        for (int i = 1; i < alphabetChars.length; i++) {
            alphabetChars[i] = (char) (96 + i);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                builder.append(alphabetChars[(chars[i] - '0') * 10 + (chars[i + 1] - '0')]);
                i += 2;
            } else {
                builder.append(alphabetChars[chars[i] - '0']);
            }
        }
        return builder.toString();
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了89.29%的用户
         * 特点：(chars[i] - '0') * 10 + (chars[i + 1] - '0')提高 char 转 int 效率
         */
    }
}
