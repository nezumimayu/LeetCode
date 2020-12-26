package queue_stack;

public class No_622_CircularQueue {
    public static void main(String[] args) {
        /**
         * MyCircularQueue(k): 构造器，设置队列长度为 k 。
         * Front: 从队首获取元素。如果队列为空，返回 -1 。
         * Rear: 获取队尾元素。如果队列为空，返回 -1 。
         * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回true。
         * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回true。
         * isEmpty(): 检查循环队列是否为空。
         * isFull(): 检查循环队列是否已满。
         */
        //创建一个队列
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));  // 返回 true

        System.out.println(circularQueue.enQueue(2));  // 返回 true

        System.out.println(circularQueue.enQueue(3));  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 false，队列已满

        System.out.println(circularQueue.Rear());  // 返回 3

        System.out.println(circularQueue.isFull());  // 返回 true

        System.out.println(circularQueue.deQueue());  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 true

        System.out.println(circularQueue.Rear());  // 返回 4



        System.out.println(circularQueue.enQueue(1));

        System.out.println(circularQueue.enQueue(2));

        System.out.println(circularQueue.enQueue(3));

        System.out.println(circularQueue.enQueue(4));

        System.out.println(circularQueue.Rear());

        System.out.println(circularQueue.isFull());

        System.out.println(circularQueue.deQueue());

        System.out.println(circularQueue.enQueue(4));

        System.out.println(circularQueue.Rear());

        /**
         * 执行用时 :6 ms, 在所有 Java 提交中击败了99.81%的用户
         * 内存消耗 :40.2 MB, 在所有 Java 提交中击败了8.33%的用户
         */
    }

}

class MyCircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        maxSize = k;
        arr = new int[maxSize];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isEmpty()){
            arr[rear % maxSize] = value;
            rear += 1;
            return true;
        }else if(isFull()){
            return false;
        }
        arr[rear % maxSize] = value;
        rear += 1;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = front + 1;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
//        if(isEmpty()){
//            return -1;
//        }
//        return arr[front];
        return isEmpty() ? -1 : arr[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
//        if(isEmpty()){
//            return -1;
//        }
//        return arr[(rear -1 ) % maxSize];
        return isEmpty() ? -1 : arr[(rear -1 ) % maxSize];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return rear == front;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(rear == front){
            return false;
        }
        return rear % maxSize == front;
    }
}
