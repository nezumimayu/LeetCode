package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class No_589_N_aryTreePreorderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(Node root) {
//        Stack<Node> stack = new Stack<>();
//        List<Integer> list = new ArrayList<>();
//        if(root == null)
//            return list;
//        stack.push(root);
//        while(!stack.isEmpty()){
//            Node node = stack.pop();
//            list.add(node.val);
//            for (int i = node.children.size() - 1; i >= 0; i--) {
//                stack.push(node.children.get(i));
//            }
//        }
//        return list;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了42.43%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了37.36%的用户
         */

        LinkedList<Node> stack = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            list.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }
        return list;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了42.43%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了52.14%的用户
         */
    }
}
