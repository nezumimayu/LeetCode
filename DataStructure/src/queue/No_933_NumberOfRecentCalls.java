package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class No_933_NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }

    static class RecentCounter {
        Queue<Integer> queue ;
        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
//            int time = t - 3000 < 0 ? 0 : t - 3000;
            queue.offer(t);
            while(queue.peek() < t - 3000){
                queue.poll();
            }
            return queue.size();
        }
        /**
         * 执行用时 :33 ms, 在所有 Java 提交中击败了45.48%的用户
         * 内存消耗 :47.8 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }
}
