package linked_list;

import java.util.Stack;

public class No_1290_Fastest {
    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        No_1290_Fastest myList = new No_1290_Fastest();
        myList.addHead(1);
        myList.addHead(0);
        myList.addHead(1);
        myList.addHead(1);
        myList.addHead(1);
        myList.display();
        Integer num = myList.getDecimalValue(myList.head);
        System.out.println(num);

    }

    public static int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int ans = 0;
        while (cur != null) {
            ans <<= 1;
            ans += cur.val;
            cur = cur.next;
        }
        return ans;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了5.00%的用户
         */
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
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
