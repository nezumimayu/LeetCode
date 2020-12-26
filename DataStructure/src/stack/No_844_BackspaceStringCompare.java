package stack;

import java.util.Stack;

public class No_844_BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "y#fo##f";
        String T = "y#f#o##f";
        System.out.println(backspaceCompare(S, T));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Integer> stack = new Stack<>();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        String strS = strProcess(stack, s).toString();
        String strT = strProcess(stack, t).toString();

        return strS.equals(strT);
    }

    private static StringBuilder strProcess(Stack<Integer> stack, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == '#')
//                if(stack.isEmpty())
//                    continue;
//                else
//                    stack.pop();
//            else
//                stack.push(i);
            /**
             * 优化判断条件
             */
            if(arr[i] != '#')
                stack.push(i);
            else if(!stack.isEmpty())
                stack.pop();
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(arr[stack.pop()]);
        }
        return str;
    }
    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了96.91%的用户
     * 内存消耗 :37.9 MB, 在所有 Java 提交中击败了33.33%的用户
     */

}
