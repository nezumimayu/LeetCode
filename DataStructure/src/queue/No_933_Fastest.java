package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class No_933_Fastest {
    public static void main(String[] args) {
        No_933_NumberOfRecentCalls.RecentCounter obj = new No_933_NumberOfRecentCalls.RecentCounter();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }

    static class RecentCounter {
        LinkedList<Integer> list = new LinkedList<>();

        public RecentCounter() {}

        public int ping(int t) {
            while (!list.isEmpty()
                    && list.getFirst() < t - 3000) {
                list.removeFirst();
            }
            list.addLast(t);
            return list.size();
        }
    }


}
