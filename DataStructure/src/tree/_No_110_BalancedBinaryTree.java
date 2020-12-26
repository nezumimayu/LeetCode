package tree;

import java.util.LinkedList;
import java.util.Queue;

public class _No_110_BalancedBinaryTree {
    public static void main(String[] args) {
//        Integer[] trees = {1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5};
//        Integer[] trees = {1,2,2,3,null,null,3,4,null,null,4};
        Integer[] trees = {1,2,2,3,3,null,null,4,4};
        TreeNode root = ConstructTree.constructTree(trees);
        boolean result = isBalanced(root);
        System.out.println("result = " + result);
    }

    public static boolean isBalanced(TreeNode root) {
//        if(root == null)
//            return true;
//        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.87%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了76.84%的用户
         * 特点：自顶向下
         */

        return height(root) >= 0;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.87%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了95.37%的用户
         * 特点：自底向上
         */
    }

    private static int height(TreeNode root) {
        if(root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        if(l == -1 || r == -1 || Math.abs(l - r) > 1)
            return -1;
        else
            return Math.max(l, r) + 1;
    }

    private static int depth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
