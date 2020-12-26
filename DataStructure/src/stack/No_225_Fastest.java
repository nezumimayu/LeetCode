package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class No_225_Fastest {
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
         * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗 :37.4 MB, 在所有 Java 提交中击败了7.41%的用户
         */
        private Queue<Integer> queue;

        // 根据官方推荐，使用ArrayDeque作为队列
        public MyStack() {
            queue = new ArrayDeque<>();
        }

        // 入栈时，将新元素x进入队列后，将新元素x之前的所有元素重新入队，此时元素x处于队头
        public void push(int x) {
            queue.offer(x);
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.offer(queue.poll());
            }
        }

        // 出栈pop操作和检查栈顶元素的top操作在调用队列相应方法前，需要检查队列是否为空，
        // 否则可能产生空指针异常
        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }


    }
}
