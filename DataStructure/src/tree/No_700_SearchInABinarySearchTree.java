package tree;

import java.util.Stack;

public class No_700_SearchInABinarySearchTree {
    public static void main(String[] args) {
        Integer[] trees = {4,2,7,1,3};
        TreeNode root = ConstructTree.constructTree(trees);
        int val = 2;
        TreeNode result = searchBST(root, val);
        System.out.println("result.val = " + result.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val == val)
                return node;
            if(node.right != null && val > node.val)
                stack.push(node.right);
            if(node.left != null && val < node.val)
                stack.push(node.left);
        }
        return null;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了21.70%的用户
         */

//        while (true) {
//            if (root == null || root.val == val)
//                return root;
//            root = root.val > val ? root.left : root.right;
//        }
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了75.63%的用户
         */

//        while (root != null && val != root.val)
//            root = val < root.val ? root.left : root.right;
//        return root;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了14.27%的用户
         */

//        if (root == null || root.val == val)
//            return root;
//        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了54.50%的用户
         */
    }
}
