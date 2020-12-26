package tree;

public class No_563_BinaryTreeTilt {
    public static void main(String[] args) {
//        Integer[] trees = {3,9,20,null,null,15,7,3,5};
        Integer[] trees = {1,2};
//        Integer[] trees = {1,2,null,3,4};
//        Integer[] trees = {1,2,3,4,null,5};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = findTilt(root);
        System.out.println("result = " + result);
    }

    static int result = 0;

    public static int findTilt(TreeNode root) {
//        if(root == null)
//            return 0;
//        int result = Math.abs(dfs(root.right) - dfs(root.left));
//        return result + findTilt(root.right) + findTilt(root.left);
        /**
         * 执行用时：17 ms, 在所有 Java 提交中击败了7.36%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了35.21%的用户
         */

//        if(root == null)
//            return 0;
//        int val = Math.abs((postOrder(root.left) ) - (postOrder(root.right) ));
//        result += val;
//        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了94.99%的用户
         */

        traverse(root);
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了94.99%的用户
         */
    }

    private static int traverse(TreeNode root) {
        if (root == null)
            return 0;
        int left = traverse(root.left);
        int right = traverse(root.right);
        result += Math.abs(left - right);
        return left + right + root.val;
    }

    private static int postOrder(TreeNode root) {
        if(root == null)
            return 0;
        int l = 0, r = 0;
        if(root.left != null)
            l = postOrder(root.left);
        if(root.right != null)
            r = postOrder(root.right);
        result += Math.abs(l - r);
        return l + r + root.val;
    }

    private static int dfs(TreeNode root) {
        if(root == null)
            return 0;
        return root.val + dfs(root.right) + dfs(root.left);
    }
}
