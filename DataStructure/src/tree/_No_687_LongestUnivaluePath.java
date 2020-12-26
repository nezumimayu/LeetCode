package tree;

public class _No_687_LongestUnivaluePath {
    public static void main(String[] args) {
//        Integer[] trees = {1,1};
//        Integer[] trees = {1,4,5,4,4,5};
//        Integer[] trees = {1,null,1,1,1,1,1,1};
        Integer[] trees = {5,4,5,1,1,5};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = longestUnivaluePath(root);
        System.out.println("result = " + result);
    }

    static int max = 0;

    public static int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    private static int dfs(TreeNode root) {
        if(root == null || root.left == null && root.right == null)
            return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        int len = 0;
        if(root.left != null && root.right != null && root.val == root.left.val && root.val == root.right.val){
            len = l + r + 2;
            if(len > max){
                max = len;
            }
            return Math.max(l, r) + 1;
        }else if(root.left != null && root.left.val == root.val){
            len = l + 1;
            if(len > max)
                max = len;
        }else if(root.right != null && root.right.val == root.val){
            len = r + 1;
            if(len > max)
                max = len;
        }
        return len;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：42.4 MB, 在所有 Java 提交中击败了82.56%的用户
         */
    }
}
