package string;

import java.util.Arrays;

public class No_824_GoatLatin {
    public static void main(String[] args) {
//        String str = "I speak Goat Latin";
        String str = "The quick brown fox jumped over the lazy dog";
        String result = toGoatLatin(str);
        System.out.println("result = " + result);
//        System.out.println("new String(\"Imaa peaksmaaa oatGmaaaa atinLmaaaaa\").length() = " + new String("Imaa peaksmaaa oatGmaaaa atinLmaaaaa").length());
    }

    public static String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        int strLen = strings.length;
        int len = ((1 + strLen) * strLen) / 2 + 2 * strLen + S.length() + 1;
        char[] chars = new char[len];
        int index = 0;

        for (int i = 0; i < chars.length - 1;) {
            char[] temp = strings[index].toCharArray();
            if(temp[0] == 'a' || temp[0] == 'A' || temp[0] == 'e' || temp[0] == 'E' || temp[0] == 'i' || temp[0] == 'I' || temp[0] == 'o' || temp[0] == 'O' || temp[0] == 'u' || temp[0] == 'U'){
//                for (int j = 0; j < temp.length; j++) {
//                    chars[i++] = temp[j];
//                }
                System.arraycopy(temp, 0, chars, i, temp.length);
                i += temp.length;
                chars[i++] = 'm';
                chars[i++] = 'a';
                for (int a = 0; a < (index + 1); a++) {
                    chars[i++] = 'a';
                }
            }else{
//                for (int j = 1; j < temp.length; j++) {
//                    chars[i++] = temp[j];
//                }
                System.arraycopy(temp, 1, chars, i, temp.length - 1);
                i += temp.length - 1;
                chars[i++] = temp[0];
                chars[i++] = 'm';
                chars[i++] = 'a';
                for (int a = 0; a < (index + 1); a++) {
                    chars[i++] = 'a';
                }
            }
//            if(i < chars.length - 1)
            chars[i++] = ' ';
            index++;
        }
        return new String(chars, 0, chars.length - 1);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了88.24%的用户
         */
    }
}
