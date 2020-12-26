package linked_list;

public class _No_234_Fastest {
    public static boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null){
            return true;
        }
        if (head.next.next==null){
            return head.val == head.next.val;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next!=null){
            if (slow.val == fast.next.val){
                if (fast.next.next!=null){
                    return false;
                }
                fast.next = null;
                slow = slow.next;
                fast = slow.next;
                if (fast==null || slow.val == fast.val){
                    return true;
                }
            }else{
                fast = fast.next;
            }
        }
        return false;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：42.7 MB, 在所有 Java 提交中击败了10.81%的用户
         */
    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        _No_234_Fastest l1 = new _No_234_Fastest();
        l1.addHead(1);
        l1.addHead(2);
        l1.addHead(3);
        l1.addHead(3);
        l1.addHead(2);
//        l1.addHead(1);
        l1.addHead(1);
//        l1.addHead(2);
//        l1.addHead(1);
//        l1.addHead(1);
//        l1.addHead(1);
        l1.display();

        Boolean current = isPalindrome(l1.head);
        System.out.println();
        System.out.println("current = " + current);
//        while(current != null){
//            System.out.print(current.val + "->");
//            current = current.next;
//        }
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
