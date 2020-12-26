package linked_list;

import java.awt.*;

public class No_206_ReverseLinkedList {

    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        No_206_ReverseLinkedList myList = new No_206_ReverseLinkedList();
        myList.addHead(1);
        myList.addHead(0);
        myList.addHead(1);
        myList.addHead(1);
        myList.addHead(1);
        myList.display();
        ListNode current = myList.reverseList(myList.head);
        while(current != null){
//            newList.addHead(current.val);
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
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head.next;
        ListNode start = new ListNode(head.val);
        ListNode temp = null;
        while(current != null){
            temp = new ListNode(current.val);
            temp.next = start;
            start = temp;
            current = current.next;
        }
        return start;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了5.06%的用户
         */
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
