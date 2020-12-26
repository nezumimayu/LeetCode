package string;

import java.util.Arrays;

public class No_557_ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String result = reverseWords(str);
        System.out.println("result = " + result);
    }

    public static String reverseWords(String s) {
//        String[] temp = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < temp.length - 1; i++) {
//            sb.append(new StringBuilder(temp[i]).reverse() + " ");
//        }
//        sb.append(new StringBuilder(temp[temp.length - 1]).reverse());
//        System.out.println(Arrays.toString(temp));
//        return sb.toString();
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了74.66%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了71.18%的用户
         */

//        char[] result = new char[s.length()];
//        String[] temp = s.split(" ");
//        int index = 0;
//        for (int i = 0; i < temp.length; i++) {
//            char[] chars = temp[i].toCharArray();
//            for (int j = chars.length - 1; j >= 0; j--) {
//                result[index++] = chars[j];
//            }
//            if(index < result.length - 1)
//                result[index++] = ' ';
//        }
//        return new String(result);
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了88.16%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了13.16%的用户
         */

        char[] temp = s.toCharArray();
        int prv = 0, last = 1;
        while(prv < temp.length){
            if(last == temp.length || temp[last] == ' '){
                int i = 0;
                while(i < (last - prv) / 2){
                    char val = temp[last - 1 - i];
                    temp[last - 1 - i] = temp[prv + i];
                    temp[prv + i] = val;
                    i++;
                }
                prv = last + 1;
            }
            last++;
        }
        return new String(temp);
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了93.58%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了76.46%的用户
         */
    }
}
