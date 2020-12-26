package queue_stack;

public class No_622_Fastest {
    public static void main(String[] args) {
        //创建一个队列
        MyCircularQueue2 circularQueue = new MyCircularQueue2(3);
        System.out.println(circularQueue.enQueue(1));  // 返回 true

        System.out.println(circularQueue.enQueue(2));  // 返回 true

        System.out.println(circularQueue.enQueue(3));  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 false，队列已满

        System.out.println(circularQueue.Rear());  // 返回 3

        System.out.println(circularQueue.isFull());  // 返回 true

        System.out.println(circularQueue.deQueue());  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 true

        System.out.println(circularQueue.Rear());  // 返回 4
    }
}
class MyCircularQueue2 {
    int[] a;
    int front;
    int rear;
    int count;
    int n ;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue2(int k) {
        this.a = new int[k];
        this.n = k;
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (!isFull()) {
            rear = (rear+1) % n;
            a[rear] = value;
            count++;
            return true;
        }else {
            return false;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front+1)  % n;
            count--;
            return true;
        } else {
            return false;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : a[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty() ? -1 : a[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count == a.length;
    }
}