package tree;

public class _No_110_Fastest {
    public static void main(String[] args) {
        Integer[] trees = {1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5};
//        Integer[] trees = {1,2,2,3,null,null,3,4,null,null,4};
//        Integer[] trees = {1,2,2,3,3,null,null,4,4};
        TreeNode root = ConstructTree.constructTree(trees);
        boolean result = isBalanced(root);
        System.out.println("result = " + result);
    }


    public static boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了99.87%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了97.05%的用户
         * 特点：自底向上
         */
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
