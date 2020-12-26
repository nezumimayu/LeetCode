package tree_medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null)
//            return list;
//        list.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return list;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了84.45%的用户
         */

//        LinkedList<TreeNode> stack = new LinkedList<>();
//        LinkedList<Integer> output = new LinkedList<>();
//        if (root == null) {
//            return output;
//        }
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pollLast();
//            output.add(node.val);
//            if (node.right != null) {
//                stack.add(node.right);
//            }
//            if (node.left != null) {
//                stack.add(node.left);
//            }
//        }
//        return output;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了21.59%的用户
         * 特点：LinkedList 代替 Stack、迭代
         */

//        List<Integer> output = new LinkedList<>();
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        // 只将右节点入栈，左节点与自身节点直接访问
//        TreeNode temp = root;
//        while (temp != null) {
//            // 访问自身节点
//            output.add(temp.val);
//            // 如果存在右节点则入栈
//            if (temp.right != null) {
//                stack.push(temp.right);
//            }
//            // 访问左节点
//            if (temp.left != null) {
//                temp = temp.left;
//            } else {
//                // 弹出栈顶节点
//                if (!stack.isEmpty()) {
//                    temp = stack.pop();
//                } else {
//                    break;
//                }
//            }
//        }
//        return output;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了20.81%的用户
         * 特点：只入栈右节点、LinkedList 代替 Stack、迭代
         */

        LinkedList<Integer> output = new LinkedList<>();
        TreeNode node = root;
        while (node != null) {
            if (node.left == null) {
                output.add(node.val);
                node = node.right;
            }
            else {
                TreeNode predecessor = node.left;
                while ((predecessor.right != null) && (predecessor.right != node)) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    output.add(node.val);
                    predecessor.right = node;
                    node = node.left;
                }
                else{
                    predecessor.right = null;
                    node = node.right;
                }
            }
        }
        return output;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了12.73%的用户
         * 特点：莫里斯（Morris）遍历，空间复杂度为O(1)
         */

//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        if(root == null)
//            return list;
//        stack.add(root);
//        while(!stack.isEmpty()){
//            TreeNode t = stack.pop();
//            list.add(t.val);
//            if(t.right != null)
//                stack.push(t.right);
//            if(t.left != null)
//                stack.push(t.left);
//        }
//        return list;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了46.52%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了31.00%的用户
         * 特点：栈、迭代
         */
    }
}
