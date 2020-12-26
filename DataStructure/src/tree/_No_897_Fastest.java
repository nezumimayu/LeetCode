package tree;

public class _No_897_Fastest {
    public static void main(String[] args) {
        Integer[] trees = {5,3,6,2,4,null,8,1,null,null,null,7,9};
        TreeNode root = ConstructTree.constructTree(trees);
        TreeNode result = increasingBST(root);
        System.out.println("result = " + result.val);
    }

    static TreeNode cur;

    public static TreeNode increasingBST(TreeNode root) {
//        return increasingBST(root, null);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.3 MB, 在所有 Java 提交中击败了69.37%的用户
         */

        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了23.27%的用户
         */
    }

    public static TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null)
            return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
    }

    public static void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }
}
