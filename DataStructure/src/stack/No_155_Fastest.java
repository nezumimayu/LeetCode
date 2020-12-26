package stack;

import java.util.Stack;

public class No_155_Fastest {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();

    }

    static class MinStack {
        /**
         * 为了不让min更新时丢失原min值，先把原min值入栈，再将更新min值，同时让新min值入栈，
         */
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        public void push(int x) {
            // only push the old minimum value when the current
            // minimum value changes after pushing the new value x
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }

        public void pop() {
            // if pop operation could result in the changing of the current minimum value,
            // pop twice and change the current minimum value to the last minimum value.
            if(stack.pop() == min)
                min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }

    static class MinStack2 {
        /**
         * 每个节点同时保存值与当前为止的最小值
         */
        private Node head;
        /** initialize your data structure here. */
        public MinStack2() {

        }

        public void push(int x) {
            if (head == null) {
                head = new Node(x, x);
            } else {
                head = new Node(x, Math.min(x, head.min), head);
            }

        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        private class Node {
            int val;
            int min;
            Node next;

            private Node(int val, int min) {
                this(val, min, null);
            }

            private Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }

}
