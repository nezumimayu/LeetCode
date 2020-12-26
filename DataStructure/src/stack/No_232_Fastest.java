package stack;

import java.util.Stack;

public class No_232_Fastest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.push(4);
        queue.push(5);
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());  // returns 1
//        System.out.println(queue.pop());   // returns 1
//        System.out.println(queue.empty()); // returns false



    }
    static class MyQueue {
        private Stack<Integer> a; // 输入栈
        private Stack<Integer> b; // 输出栈

        /** Initialize your data structure here. */
        public MyQueue() {
            a = new Stack<>();
            b = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            a.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // 如果b栈为空，则将a栈全部弹出并压入b栈中，然后b.pop()
            if (b.isEmpty()) {
                while (!a.isEmpty()) {
                    b.push(a.pop());
                }
            }
            return b.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (b.isEmpty()) {
                while (!a.isEmpty()) {
                    b.push(a.pop());
                }
            }
            return b.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return a.isEmpty() && b.isEmpty();
        }
    }
}
