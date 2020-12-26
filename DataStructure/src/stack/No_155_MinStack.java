package stack;

import java.util.ArrayList;
import java.util.List;

public class No_155_MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2

    }

    static class MinStack {

//        List<Integer> minStack = new ArrayList();
//        int index = -1;
//        int minIndex = 0;
//
//        /** initialize your data structure here. */
//        public MinStack() {
//        }
//
//        public void push(int x) {
//            minStack.add(x);
//            index++;
//            if(x < minStack.get(minIndex)){
//                minIndex = index;
//            }
//        }
//
//        public void pop() {
//            if(index == minIndex){
//                minIndex = 0;
//                for (int i = 0; i < index; i++) {
//                    if(minStack.get(i) < minStack.get(minIndex))
//                        minIndex = i;
//                }
//            }
//            minStack.remove(index);
//            index--;
//        }
//
//        public int top() {
//            return minStack.get(index);
//        }
//
//        public int getMin() {
//            return minStack.get(minIndex);
//        }
        /**
         * 执行用时 :6 ms, 在所有 Java 提交中击败了97.43%的用户
         * 内存消耗 :41.4 MB, 在所有 Java 提交中击败了15.66%的用户
         */
        int[] minStack = new int[9999];
        int index = -1;
        int minIndex = 0;

        /** initialize your data structure here. */
        public MinStack() {
        }

        public void push(int x) {
            index++;
            minStack[index] = x;
            if(x < minStack[minIndex])
                minIndex = index;
        }

        public void pop() {
            if(index == minIndex){
                minIndex = 0;
                for (int i = 0; i < index ; i++) {
                    if(minStack[i] < minStack[minIndex])
                        minIndex = i;
                }
            }
            index--;
        }

        public int top() {
            return minStack[index];
        }

        public int getMin() {
            return minStack[minIndex];
        }
        /**
         * 执行用时 :5 ms, 在所有 Java 提交中击败了99.96%的用户
         * 内存消耗 :41.1 MB, 在所有 Java 提交中击败了16.87%的用户
         */
    }
}
