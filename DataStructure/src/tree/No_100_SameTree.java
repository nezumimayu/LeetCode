package tree;

public class No_100_SameTree {
    public static void main(String[] args) {
        Integer[] trees1 = {1,2,3};
        Integer[] trees2 = {1,2,3};
        TreeNode p = ConstructTree.constructTree(trees1);
        TreeNode q = ConstructTree.constructTree(trees2);
        boolean result = isSameTree(p, q);
        System.out.println("result = " + result);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return p == q;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.9 MB, 在所有 Java 提交中击败了92.72%的用户
         */
    }
}
