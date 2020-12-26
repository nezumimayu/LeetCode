package tree;

public class No_543_DiameterOfBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,4,5};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = diameterOfBinaryTree(root);
        System.out.println("result = " + result);
    }

    static int result = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了53.18%的用户
         * 特点：自底向上
         */
    }

    private static int diameter(TreeNode root) {
        if(root == null)
            return 0;
        int l = diameter(root.left);
        int r = diameter(root.right);
        if(r + l > result)
            result = r + l;
        return Math.max(l, r) + 1;

//        if(root == null)
//            return 0;
//        int l = 0, r = 0;
//        if(root.left != null)
//            l = diameter(root.left) + 1;
//        if(root.right != null)
//            r = diameter(root.right) + 1;
//        if(r + l > result)
//            result = r + l;
//        return Math.max(l, r);
    }
}
