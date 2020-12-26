package tree;

public class _No_687_Fastest {
    public static void main(String[] args) {
//        Integer[] trees = {1,1};
//        Integer[] trees = {1,4,5,4,4,5};
//        Integer[] trees = {1,null,1,1,1,1,1,1};
        Integer[] trees = {5,4,5,1,1,5};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = longestUnivaluePath(root);
        System.out.println("result = " + result);
    }

    static int ans;

    public static int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了86.95%的用户
         * 内存消耗：42.5 MB, 在所有 Java 提交中击败了61.58%的用户
         */
    }
    public static int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
