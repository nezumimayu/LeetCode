package string;

import java.util.Stack;

public class No_13_RomanToInteger {
    public static void main(String[] args) {
//        String str = "MCMXCIV";
//        String str = "LVIII";
        String str = "IIIII";
        int result = romanToInt(str);
        System.out.println("result = " + result);
    }

    public static int romanToInt(String s) {
//        char[] temp = s.toCharArray();
//        int result = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (char c : temp) {
//            int val = 1;
//            switch (c){
//                case 'V':
//                    val = 5;
//                    break;
//                case 'X':
//                    val = 10;
//                    break;
//                case 'L':
//                    val = 50;
//                    break;
//                case 'C':
//                    val = 100;
//                    break;
//                case 'D':
//                    val = 500;
//                    break;
//                case 'M':
//                    val = 1000;
//                    break;
//            }
//            if(stack.isEmpty()){
//                stack.push(val);
//            }else if(stack.peek() >= val){
//                result += stack.pop();
//                stack.push(val);
//            }else if(stack.peek() < val){
//                result += (val - stack.pop());
//            }
//        }
//        if(!stack.isEmpty())
//            result += stack.pop();
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了30.52%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了94.88%的用户
         * 特点：使用栈结构，但是栈深度很浅，大材小用
         */
        char[] temp = s.toCharArray();
        int result = 0;
        int prv = -1;
        for (char c : temp) {
            int val = 1;
            switch (c){
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;
            }
            if(prv == -1){
                prv = val;
                continue;
            }else if(prv >= val){
                result += prv;
                prv = val;
            }else if(prv < val){
                result += (val - prv);
                prv = -1;
            }
        }
        if(prv != -1)
            result += prv;
        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了99.94%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了34.14%的用户
         */
    }

    public static int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
