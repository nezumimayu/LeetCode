package linked_list;

import java.util.Stack;

public class No_1290_ConvertBinaryNumberInALinkedListToInteger {
    private ListNode head;//表示链表头
    private ListNode tail;//表示链表尾
    private int size;//表示链表的节点个数

    public static void main(String[] args) {
        No_1290_ConvertBinaryNumberInALinkedListToInteger myList = new No_1290_ConvertBinaryNumberInALinkedListToInteger();
        myList.addHead(1);
        myList.addHead(0);
        myList.addHead(1);
        myList.addHead(1);
        myList.addHead(1);
//        myList.addHead(4);
//        myList.addHead(4);
//        myList.addHead(5);
        myList.display();
        Integer num = myList.getDecimalValue(myList.head);
        System.out.println(num);

    }

    public static int getDecimalValue(ListNode head) {
        ListNode current = head;
        Integer result = 0;
        Integer index = 0;
        int arr[] = new int[30];
        while(current != null){
            arr[index] = current.val;
            current = current.next;
            index++;
        }
        for (int i = 0,j = index - 1; i < index; i++,j--) {
            result += arr[i] * (int) Math.pow(2, j);
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了5.00%的用户
         */
    }
    public static int getDecimalValueForStringBuilder(ListNode head) {
        ListNode current = head;
        Integer result = 0;
        StringBuilder sb = new StringBuilder();
        while(current != null){
            sb.append(current.val);
            current = current.next;
        }
        sb.reverse();
        Integer len = sb.length();
        for (int i = 0; i < len ; i++) {
            result += (sb.charAt(0) - '0') * (int) Math.pow(2, i);
            sb.deleteCharAt(0);
        }
        return result;

        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了17.39%的用户
         * 内存消耗：37.3 MB, 在所有 Java 提交中击败了5.00%的用户
         */
    }

    public static int getDecimalValueForStack(ListNode head) {
        ListNode current = head;
        Integer result = 0;
        Double index = 0.0;
        Stack<Integer> myStack = new Stack<>();
        while(current != null){
            myStack.push(current.val);
            current = current.next;
        }
        while(!myStack.isEmpty()){
            result += myStack.pop() * (int) Math.pow(2, index);
            index++;
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了17.39%的用户
         * 内存消耗：37.3 MB, 在所有 Java 提交中击败了5.00%的用户
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
