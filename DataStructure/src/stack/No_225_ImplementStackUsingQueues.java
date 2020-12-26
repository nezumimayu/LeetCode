package stack;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class No_225_ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.top();
        System.out.println(param_3);
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }

    public static class MyStack {
        /**
         * 执行用时 :3 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :37.4 MB, 在所有 Java 提交中击败了7.41%的用户
         */

        private Queue<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            queue = new ArrayBlockingQueue<>(999);
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int index = queue.size();
            while(index-- > 1){
                queue.offer(queue.poll());
            }
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            int top = 0;
            for (Integer integer : queue) {
                top = integer;
            }
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }

    }

    public static class MyStack2 {
        /**
         * 执行用时 :3 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :38.1 MB, 在所有 Java 提交中击败了7.41%的用户
         */
        private Queue<Integer> queue;
        private Queue<Integer> queue2;

        /** Initialize your data structure here. */
        public MyStack2() {
            queue = new ArrayBlockingQueue<>(999);
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            queue2 = new ArrayBlockingQueue<>(queue.size());
            int top = 0;
            int i = 1;
            for (Integer integer : queue) {
                if(i == queue.size()){
                    top = integer;
                    continue;
                }
                queue2.offer(integer);
                i++;
            }
            queue = queue2;
            return top;
        }

        /** Get the top element. */
        public int top() {
            int top = 0;
            for (Integer integer : queue) {
                top = integer;
            }
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }

    }

}
