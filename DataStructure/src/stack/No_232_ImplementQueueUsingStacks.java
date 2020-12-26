package stack;

import java.util.Stack;

public class No_232_ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());  // returns 1
//        System.out.println(queue.pop());   // returns 1
//        System.out.println(queue.empty()); // returns false



    }

    static class MyQueue {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if(stack2.isEmpty()){

                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                stack2.push(x);
                while(!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
            }
//            else{
//
//                while(!stack2.isEmpty()){
//                    stack1.push(stack2.pop());
//                }
//                stack1.push(x);
//                while(!stack1.isEmpty()){
//                    stack2.push(stack1.pop());
//                }
//            }
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(stack1.isEmpty())
                return stack2.pop();
            else
                return stack1.pop();
            }

        /** Get the front element. */
        public int peek() {
            if(stack1.isEmpty())
                return stack2.peek();
            else
                return stack1.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
        /**
         * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :37 MB, 在所有 Java 提交中击败了7.14%的用户
         */
    }
}
