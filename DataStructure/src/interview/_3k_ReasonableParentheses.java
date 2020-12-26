package interview;

import java.util.Stack;

public class _3k_ReasonableParentheses {
    public static void main(String[] args) {
        String str = "((()()))";
        boolean result = method(str);
        System.out.println("result = " + result);
    }

    public static boolean method(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if(stack.isEmpty()){
                stack.add(c);
            }else if(c == ')'){
                if(stack.peek() != '(')
                    return false;
                else
                    stack.pop();
            }else{
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}
