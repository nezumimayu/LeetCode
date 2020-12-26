package tree;

import java.util.Stack;

public class No_226_InvertBinaryTree {
    public static void main(String[] args) {
//        Integer[] trees = {4,2,7,1,3,6,9};
        Integer[] trees = {1,2};
        TreeNode root = ConstructTree.constructTree(trees);
        TreeNode node = invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
//        if(root == null)
//            return root;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            if(node.left == null && node.right == null)
//                continue;
//            if(node.left == null){
//                node.left = node.right;
//                node.right = null;
//                stack.push(node.left);
//            }else if(node.right == null){
//                node.right = node.left;
//                node.left = null;
//                stack.push(node.right);
//            }else{
//                TreeNode temp = node.left;
//                node.left = node.right;
//                node.right = temp;
//                stack.push(node.right);
//                stack.push(node.left);
//            }
//        }
//        return root;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了44.99%的用户
         */

        if(root == null)
            return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null)
                stack.push(node.left);
            if(node.right != null)
                stack.push(node.right);
        }
        return root;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了39.66%的用户
         */
    }
}
