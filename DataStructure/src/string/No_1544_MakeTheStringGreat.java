package string;

import java.util.Arrays;
import java.util.Stack;

public class No_1544_MakeTheStringGreat {
    public static void main(String[] args) {
//        String str = "leEeetdDodDe";
        String str = "abBAcC";
//        String str = "Pp";
        String result = makeGood(str);
        System.out.println("result = " + result);
    }

    public static String makeGood(String s) {
//        char[] chars = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        for (char c : chars) {
//            if(stack.isEmpty()){
//                stack.push(c);
//            }else{
//                if(c + 32 == stack.peek() || c - 32 == stack.peek())
//                    stack.pop();
//                else
//                    stack.push(c);
//            }
//        }
//        char[] result = new char[stack.size()];
//        for (int i = result.length - 1; i >= 0; i--) {
//            result[i] = stack.pop();
//        }
//        return new String(result);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了78.26%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了91.37%的用户
         * 特点：栈结构
         */

//        if(s.length() <= 1)
//            return s;
//        char[] chars = s.toCharArray();
//        int lef = -1, rig = 0;
//        while(rig < chars.length) {
//            if(lef == -1){
//                lef = rig;
//            }else{
//                if(chars[lef] + 32 == chars[rig] || chars[lef] - 32 == chars[rig]){
//                    chars[lef] = '#';
//                    while(lef >= 0 && chars[lef] == '#'){
//                        lef--;
//                    }
//                    chars[rig++] = '#';
//                }else{
//                    lef = rig;
//                    rig++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(chars));
//        StringBuilder sb = new StringBuilder();
//        for (char c : chars) {
//            if(c != '#')
//                sb.append(c);
//        }
//        return sb.reverse().toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了86.29%的用户
         * 特点：数组模拟栈
         */

        StringBuilder sb = new StringBuilder(s);
        int len = -1;
        while (len != sb.length()) {
            len = sb.length();
            for (int i = 0; i < sb.length() - 1; i++) {
                if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 'a' - 'A') {
                    sb.delete(i, i + 2);
                    break;
                }
            }
        }
        return sb.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了96.31%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了99.01%的用户
         */
    }
}
