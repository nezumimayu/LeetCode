package linked_list;

public class _No_160_Fastest {

    public static ListNode getIntersectionNodeForSize(ListNode headA, ListNode headB) {
        //O(n) 能解决
        // get 2 size
        // two point
        if(headA==null||headB==null){return null;}

        ListNode pa = headA;
        ListNode pb = headB;
        ListNode p = null;
        int sizeA = 1;
        while(pa.next!=null){
            pa = pa.next;
            sizeA++;
        }
        int sizeB = 1;
        while(pb.next!=null){
            pb = pb.next;
            sizeB++;
        }
        if(pa!=pb){
            return null;
        }
        pa = headA;
        pb = headB;
        int dif = sizeA-sizeB;
        while(dif!=0){
            if(dif>0){
                pa = pa.next;
                dif--;
            }
            else{
                pb = pb.next;
                dif++;
            }
        }
        while(pa!=pb){
            pa = pa.next;
            pb = pb.next;
        }
        return pa;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
         * 内存消耗：42.7 MB, 在所有 Java 提交中击败了71.43%的用户
         */

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /**
         定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
         两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
         **/
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
         * 内存消耗：42.3 MB, 在所有 Java 提交中击败了80.95%的用户
         */

    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        _No_160_Fastest l1 = new _No_160_Fastest();
        _No_160_Fastest l2 = new _No_160_Fastest();
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(8);
        l1.addNode(node1);
        l1.addNode(node2);
        l1.addNode(node3);
        l1.addHead(1);
        l1.addHead(4);

        l2.addNode(node1);
        l2.addNode(node2);
        l2.addNode(node3);
        l2.addHead(1);
        l2.addHead(0);
        l2.addHead(5);

        l1.display();
        l2.display();
        ListNode current = getIntersectionNode(l1.head, l2.head);
        while(current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //在链表头添加节点
    public void addHead(Integer val){
        ListNode newHead = new ListNode(val);
        if(size==0){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    //在链表头添加节点
    public void addNode(ListNode newHead){
        if(size==0){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    //遍历链表
    public void display(){
        if(size>0){
            ListNode node = head;
            int tempSize = size;
            if(tempSize ==1){
                System.out.print( "["+node.val+"]");
            }
            while(tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.val+"->");
                }else if(node.next == null){
                    System.out.print(node.val+"]");
                }else{
                    System.out.print(node.val+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{
            System.out.println("[]");
        }
    }

}
