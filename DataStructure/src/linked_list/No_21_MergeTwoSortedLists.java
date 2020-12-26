package linked_list;

public class No_21_MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = null;
        ListNode head = result;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
//            System.out.println(temp.val);
            result.next = temp;
            result = result.next;
        }
        if(l1 != null)
            result.next = l1;
        if(l2 != null)
            result.next = l2;
        return head.next;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了63.40%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了65.42%的用户
         */
    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        No_21_MergeTwoSortedLists l1 = new No_21_MergeTwoSortedLists();
        No_21_MergeTwoSortedLists l2 = new No_21_MergeTwoSortedLists();
        l1.addHead(4);
        l1.addHead(2);
        l1.addHead(1);
        l2.addHead(4);
        l2.addHead(3);
        l2.addHead(1);
        l1.display();
        l2.display();
        ListNode current = mergeTwoLists(l1.head, l2.head);
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
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public  void addHead(Integer val){
        ListNode newHead = new ListNode(val);
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
