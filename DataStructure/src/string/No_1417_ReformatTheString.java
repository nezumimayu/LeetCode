package string;

import java.util.LinkedList;

public class No_1417_ReformatTheString {
    public static void main(String[] args) {
        String str = "covid201900";
        String result = reformat(str);
        System.out.println("result = " + result);
    }

    public static String reformat(String s) {
//        int wordLen = 0;
//        for (char c : s.toCharArray()) {
//            if(Character.isLetter(c))
//                wordLen++;
//        }
//        if(Math.abs(s.length() - 2 * wordLen) > 1){
//            return "";
//        }
//
//        int letterIndex = wordLen > (s.length() - wordLen) ? 0 : 1;
//        char[] temp = new char[s.length()];
//        int numIndex = letterIndex ^ 1;
//        for (char c : s.toCharArray()) {
//            if(Character.isLetter(c)){
//                temp[letterIndex] = c;
//                letterIndex += 2;
//            }else{
//                temp[numIndex] = c;
//                numIndex += 2;
//            }
//        }
//        return new String(temp);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了70.68%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了75.47%的用户
         */

//        StringBuilder sb = new StringBuilder();
//        char[] temp = s.toCharArray();
//        int letter = 0, num = 0, len = 0;
//        while(len < s.length()){
//            while(letter < s.length() && !Character.isLetter(temp[letter])){
//                letter++;
//            }
//            while(num < s.length() && Character.isLetter(temp[num])){
//                num++;
//            }
//            if(letter >= s.length()){
//                int otherNum = 1;
//                sb.insert(0, temp[num]);
//                while(++num < s.length()){
//                    if(!Character.isLetter(temp[num]))
//                        otherNum++;
//                }
//                if(otherNum > 1)
//                    return "";
//                return sb.toString();
//            }
//            if(num >= s.length()){
//                int otherLetter = 1;
//                sb.append(temp[letter]);
//                while(++letter < s.length()){
//                    if(Character.isLetter(temp[letter]))
//                        otherLetter++;
//                }
//                if(otherLetter > 1)
//                    return "";
//                return sb.toString();
//            }
//            sb.append(temp[letter++]).append(temp[num++]);
//            len += 2;
//        }
//        return sb.toString();
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了62.92%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了88.68%的用户
         */

        int wordLen = 0;
        for (char c : s.toCharArray()) {
            if(c >= 'a')
                wordLen++;
        }
        if(Math.abs(s.length() - 2 * wordLen) > 1){
            return "";
        }
        char[] temp = new char[s.length()];
        int letterIndex = wordLen > (s.length() - wordLen) ? 0 : 1;
        int numIndex = letterIndex ^ 1;
        for (char c : s.toCharArray()) {
            if(c >= 'a'){
                temp[letterIndex] = c;
                letterIndex += 2;
            }else{
                temp[numIndex] = c;
                numIndex += 2;
            }
        }
        return new String(temp);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.33%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了50.94%的用户
         * 特点：c >= 'a' 代替 Character.isLetter(c)
         */
    }
}
