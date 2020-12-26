package tree;

import java.util.LinkedList;

public class No_783_MinimumDistanceBetweenBSTNodes {
    public static void main(String[] args) {
        Integer[] trees = {4,2,6,1,3,null,null};
        TreeNode root = ConstructTree.constructTree(trees);
        int result= minDiffInBST(root);
        System.out.println("result = " + result);
    }

    static int len = Integer.MAX_VALUE;
    static int prv = -999;

    public static int minDiffInBST(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        TreeNode curr = root;
//        int prv = -9999, len = Integer.MAX_VALUE;
//        while(curr != null || !stack.isEmpty()){
//            while(curr != null){
//                stack.offer(curr);
//                curr = curr.left;
//            }
//            curr = stack.pollLast();
//            if(curr.val - prv < len)
//                len = curr.val - prv;
//            prv = curr.val;
//            curr = curr.right;
//        }
//        return len;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了31.40%的用户
         * 内存消耗：37 MB, 在所有 Java 提交中击败了93.11%的用户
         */

//        inorder(root);
//        return len;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.2 MB, 在所有 Java 提交中击败了75.00%的用户
         */

        if(root == null)
            return len;
        minDiffInBST(root.left);
        if(root.val - prv < len)
            len = root.val - prv;
        prv = root.val;
        minDiffInBST(root.right);
        return len;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.1 MB, 在所有 Java 提交中击败了81.76%的用户
         */
    }

    private static void inorder(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null)
            inorder(root.left);
        if(root.val - prv < len)
            len = root.val - prv;
        prv = root.val;
        inorder(root.right);
    }
}
