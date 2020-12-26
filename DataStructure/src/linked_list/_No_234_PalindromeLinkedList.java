package linked_list;

public class _No_234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null; //前指针节点

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode nextTemp = slow.next; //临时节点，暂存当前节点的下一节点，用于后移
            slow.next = prev; //将当前节点指向它前面的节点
            prev = slow; //前指针后移
            slow = nextTemp; //当前指针后移

        }
//        ListNode node = prev;
//        while(node != null){
//            System.out.print(node.val + "->");
//            node = node.next;
//        }
//        System.out.println();
//        System.out.println("slow.val = " + slow.val);
        if(slow.next != null && prev.val == slow.next.val)
            slow = slow.next;
        while(slow != null){
            if(prev.val != slow.val)
                return false;
            slow = slow.next;
            prev = prev.next;
        }
//        System.out.println("prev.val = " + prev.val);
//        System.out.println("prev == null = " + prev == null);
//        System.out.println("prev.next.val = " + prev.next.val);
        return prev == null ? true : false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.70%的用户
         * 内存消耗：42.3 MB, 在所有 Java 提交中击败了10.81%的用户
         */

    }

    public static boolean isPalindrome2(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        /**
         * 妙啊
         */
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null && slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.77%的用户
         * 内存消耗：41 MB, 在所有 Java 提交中击败了97.63%的用户
         */
    }


    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        _No_234_PalindromeLinkedList l1 = new _No_234_PalindromeLinkedList();
        l1.addHead(1);
        l1.addHead(2);
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
