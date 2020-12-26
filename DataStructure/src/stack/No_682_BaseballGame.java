package stack;

import java.util.Stack;

public class No_682_BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"36","28","70","65","C","+","33","-46","84","C"};

        long startTime = System.currentTimeMillis();

        int result = calPoints(ops);
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");

    }

    public static int calPoints(String[] ops) {
//        Stack<Integer> stack = new Stack<Integer>();
//        for (int i = 0; i < ops.length; i++) {
//            if(ops[i].equals("C")){
//                stack.pop();
//            }else if(ops[i].equals("D")){
//                int num = stack.peek() * 2;
//                stack.push(num);
//            }else if(ops[i].equals("+")){
//                int a = stack.pop();
//                int b = stack.pop();
//                int ab = a + b;
//                stack.push(b);
//                stack.push(a);
//                stack.push(ab);
//            }else{
//                stack.push(new Integer(ops[i]));
//            }
//        }
//        int result = 0;
//        while(!stack.isEmpty()){
//            result += stack.pop();
//        }
//        return result;
        /**
         * 执行用时 :3 ms, 在所有 Java 提交中击败了84.87%的用户
         * 内存消耗 :39.1 MB, 在所有 Java 提交中击败了25.00%的用户
         */
        int[] arr = new int[ops.length];
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            if(ops[i].equals("C")){
                index--;
            }else if(ops[i].equals("D")){
                arr[index] = 2 * arr[index - 1];
                index++;
            }else if(ops[i].equals("+")){
                arr[index] = arr[index - 1] + arr[index - 2];
                index++;
            }else{
                arr[index] = Integer.parseInt(ops[i]);
                index++;
            }
        }
        int result = 0;
        for (int i = 0; i < index; i++) {
            result += arr[i];
        }
        return result;
        /**
         * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :38 MB, 在所有 Java 提交中击败了25.00%的用户
         */
    }
}