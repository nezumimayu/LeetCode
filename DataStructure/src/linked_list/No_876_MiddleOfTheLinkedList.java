package linked_list;

public class No_876_MiddleOfTheLinkedList {
    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        No_876_MiddleOfTheLinkedList myList = new No_876_MiddleOfTheLinkedList();
        myList.addHead(6);
        myList.addHead(5);
        myList.addHead(4);
        myList.addHead(3);
        myList.addHead(2);
        myList.addHead(1);
        myList.display();
        ListNode current = myList.middleNode(myList.head);
        System.out.println(current.val);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode result = head;
        Integer index = 0;
        Float temp = 0.0f;
        Integer mid = 1;
        Integer num = 0;
        if(head.next == null){
            return head;
        }
        while(current != null){
            index++;
            temp = (Float.valueOf(index) + 1) / 2;
            num = Math.round(temp);
            if(num != mid){
                result  = result.next;
                mid++;
            }
            current = current.next;
            System.out.println("index = " + index);
            System.out.println("temp = " + temp);
            System.out.println("mid = " + mid);
            System.out.println("===============");

        }
        return result;
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
