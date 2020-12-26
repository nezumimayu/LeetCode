package stack;

import java.util.Stack;

public class No_20_ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}{}}{{}{}{)";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

//        Stack<Character> stack = new Stack<>();
//        for(char c : s.toCharArray()){
//            if(c == '(' || c == '[' || c == '{')
//                stack.push(c);
//            else
//                if(stack.isEmpty())
//                    return false;
//                else
//                   switch (c){
//                        case '}':
//                            if(stack.peek() == '{')
//                                stack.pop();
//                            else
//                                return false;
//                            break;
//                        case ']':
//                            if(stack.peek() == '[')
//                                stack.pop();
//                            else
//                                return false;
//                            break;
//                        case ')':
//                            if(stack.peek() == '(')
//                                stack.pop();
//                            else
//                                return false;
//                            break;
//                    }
//        }
//        return stack.isEmpty();
        /**
         * 执行用时 :2 ms, 在所有 Java 提交中击败了84.37%的用户
         * 内存消耗 :37.4 MB, 在所有 Java 提交中击败了5.48%的用户
         */
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if((c == ')' || c == ']' || c == '}') && str.length() == 0)
                return false;
            str.append(c);
            switch (c) {
                case '}':
                    if (str.charAt(str.length() - 2) == '{')
                        str.delete(str.length() - 2, str.length());
                    break;
                case ']':
                    if (str.charAt(str.length() - 2) == '[')
                        str.delete(str.length() - 2, str.length());
                    break;
                case ')':
                    if (str.charAt(str.length() - 2) == '(')
                        str.delete(str.length() - 2, str.length());
                    break;
            }
        }
        return str.length() == 0;
        /**
         * 执行用时 :1 ms, 在所有 Java 提交中击败了99.09%的用户
         * 内存消耗 :37.8 MB, 在所有 Java 提交中击败了5.48%的用户
         */

    }

}
