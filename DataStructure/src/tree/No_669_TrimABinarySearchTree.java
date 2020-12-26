package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class No_669_TrimABinarySearchTree {
    public static void main(String[] args) {
//        Integer[] trees = {3,0,4,null,2,null,null,1};
        Integer[] trees = {3,1,4,null,2};
        TreeNode root = ConstructTree.constructTree(trees);
        int L = 3;
        int R = 4;
        TreeNode result = trimBST(root, L, R);
        System.out.println("result = " + result.val);
    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
//        if(root == null)
//            return null;
//        if(root.val < L){
//            root = trimBST(root.right, L, R);
//        }else if(root.val > R){
//            root = trimBST(root.left, L, R);
//        }
//        if(root != null){
//            if(root.right != null)
//                root.right = trimBST(root.right, L, R);
//            if(root.left != null)
//                root.left = trimBST(root.left, L, R);
//        }
//        return root;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了72.62%的用户
         */

        if (root == null)
            return root;
        if (root.val > R)
            return trimBST(root.left, L, R);
        if (root.val < L)
            return trimBST(root.right, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了5.54%的用户
         */
    }

}
