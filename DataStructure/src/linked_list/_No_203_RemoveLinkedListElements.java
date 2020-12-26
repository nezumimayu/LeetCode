package linked_list;

public class _No_203_RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        if(head.val == val && head.next == null)
            return null;
        ListNode curr = head;
        ListNode pre = null;
        ListNode result = head;
        while(curr != null){
            if(curr.val == val){
                if(pre == null){
                    curr = curr.next;
                    result = curr;
                    continue;
                }else{
                    pre.next = curr.next;
                    curr = pre;
                }
            }
            pre = curr;
            curr = curr.next;
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.81%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了6.25%的用户
         */
    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        _No_203_RemoveLinkedListElements l1 = new _No_203_RemoveLinkedListElements();
        l1.addHead(6);
//        l1.addHead(5);
//        l1.addHead(4);
        l1.addHead(3);
        l1.addHead(6);
//        l1.addHead(2);
//        l1.addHead(1);
        l1.display();

        ListNode current = removeElements(l1.head, 6);
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
