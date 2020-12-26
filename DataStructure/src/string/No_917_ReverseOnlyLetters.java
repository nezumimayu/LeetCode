package string;

import java.util.Stack;

public class No_917_ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";
        String result = reverseOnlyLetters(str);
        System.out.println("result = " + result);
    }

    public static String reverseOnlyLetters(String S) {
//        char[] temp = S.toCharArray();
//        int lef = 0, rig = temp.length - 1;
//        while(lef < rig){
//            if(((temp[lef] >= 65 && temp[lef] <= 90) || (temp[lef] >= 97 && temp[lef] <= 122)) && ((temp[rig] >= 65 && temp[rig] <= 90) || (temp[rig] >= 97 && temp[rig] <= 122))){
//                char c = temp[rig];
//                temp[rig--] = temp[lef];
//                temp[lef++] = c;
//            }
//            if(temp[lef] < 65 || (temp[lef] > 90 && temp[lef] < 97)){
//                lef++;
//            }
//            if(temp[rig] < 65 || (temp[rig] > 90 && temp[rig] < 97)){
//                rig--;
//            }
//        }
//        return new String(temp);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了70.28%的用户
         */

        char[] temp = S.toCharArray();
        int lef = 0, rig = temp.length - 1;
        while(lef < rig){
            if(Character.isLetter(temp[lef]) && Character.isLetter(temp[rig])){
                char c = temp[rig];
                temp[rig--] = temp[lef];
                temp[lef++] = c;
            }
            if(!Character.isLetter(temp[lef])){
                lef++;
            }
            if(!Character.isLetter(temp[rig])){
                rig--;
            }
        }
        return new String(temp);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了80.98%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了98.45%的用户
         * 特点：调用API：Character.isLetter(c)
         */

//        char[] chars = S.toCharArray();
//        int i = 0;
//        int j = chars.length - 1;
//        while (i < j) {
//            while (i < j && (chars[i] < 'A' || (chars[i] > 'Z' && chars[i] < 'a') || chars[i] > 'z')) i++;
//            while (i < j && (chars[j] < 'A' || (chars[j] > 'Z' && chars[j] < 'a') || chars[j] > 'z')) j--;
//            if(i < j) {
//                chars[i] ^= chars[j];
//                chars[j] ^= chars[i];
//                chars[i++] ^= chars[j--];
//            }
//        }
//        return String.valueOf(chars);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了80.98%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了96.64%的用户
         * 特点：使用位运算     异或交换
         */

//        Stack<Character> letters = new Stack();
//        for (char c: S.toCharArray())
//            if (Character.isLetter(c))
//                letters.push(c);
//
//        StringBuilder ans = new StringBuilder();
//        for (char c: S.toCharArray()) {
//            if (Character.isLetter(c))
//                ans.append(letters.pop());
//            else
//                ans.append(c);
//        }
//        return ans.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了27.92%的用户
         * 内存消耗：38.4 MB, 在所有 Java 提交中击败了8.27%的用户
         * 特点：使用字母栈
         */
    }
}
