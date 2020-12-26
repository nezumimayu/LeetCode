package tree_medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No_145_BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,4,5,6,7,null,null,8};
        TreeNode root = ConstructTree.constructTree(trees);
        List<Integer> list = postorderTraversal(root);
        for (Integer i : list) {
            System.out.print(i + " -> ");
        }
    }

    List<Integer> list = new ArrayList<>();

    public static List<Integer> postorderTraversal(TreeNode root) {
//        if(root == null)
//            return list;
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        list.add(root.val);
//        return list;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了16.50%的用户
         */

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root, r = null;          //r结点用来区分之前的结点是否被访问过
        while (current != null || !stack.isEmpty()) {
            if (current != null) {                  //到树的最左面
                stack.push(current);
                current = current.left;
            } else {
                current = stack.peek();             //看最左结点有没有右子树
                if (current.right != null && current.right != r) {
                    current = current.right;
                    stack.push(current);
                    current = current.left;         //右子树再到最左
                } else {
                    current = stack.pop();          //访问该结点，并标记被访问
                    ans.add(current.val);
                    r = current;
                    current = null;
                }
            }
        }
        return ans;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了57.51%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了66.35%的用户
         * 特点：r结点用来区分之前的结点是否被访问过
         */

//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        while (true) {
//            while (root != null) {
//                stack.push(root);
//                stack.push(root);
//                root = root.left;
//            }
//            if (stack.isEmpty())
//                break;
//            root = stack.pop();
//            if (!stack.isEmpty() && stack.peek() == root) {
//                root = root.right;
//            } else {
//                list.add(root.val);
//                root = null;
//            }
//        }
//        return list;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了57.51%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了32.11%的用户
         * 特点：两次入栈
         */
    }
}
