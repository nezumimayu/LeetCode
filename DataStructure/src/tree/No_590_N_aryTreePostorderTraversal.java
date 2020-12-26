package tree;

import java.util.*;
import java.util.stream.Collectors;

public class No_590_N_aryTreePostorderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> postorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        Stack<Node> stack = new Stack<>();
//        if(root == null)
//            return list;
//        stack.push(root);
//        while(!stack.isEmpty()){
//            Node node = stack.pop();
//            list.add(node.val);
//            for (Node child : node.children) {
//                stack.push(child);
//            }
//        }
//        Collections.reverse(list);
//        return list;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了22.49%的用户
         * 内存消耗：40.9 MB, 在所有 Java 提交中击败了23.38%的用户
         */

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if(root == null)
            return list;
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            list.addFirst(node.val);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return list;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了40.27%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了56.67%的用户
         */
    }
}
