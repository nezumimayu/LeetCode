package linked_list;

public class _No_160_IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode current = null;
        while(headA != null){
            current = headB;
            while(current != null){
                if(headA == current){
                    return headA;
                }
                current = current.next;
            }
            headA = headA.next;
        }
        return null;
        /**
         * 执行用时：798 ms, 在所有 Java 提交中击败了5.02%的用户
         * 内存消耗：42.5 MB, 在所有 Java 提交中击败了78.57%的用户
         */

    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        _No_160_IntersectionOfTwoLinkedLists l1 = new _No_160_IntersectionOfTwoLinkedLists();
        _No_160_IntersectionOfTwoLinkedLists l2 = new _No_160_IntersectionOfTwoLinkedLists();
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
