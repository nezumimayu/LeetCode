package tree;

public class No_993_Fastest {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,null,4,null,5};
//        Integer[] trees = {1,2,3,null,4};
//        Integer[] trees = {1,2,3,4};
        TreeNode root = ConstructTree.constructTree(trees);
        int x = 5, y = 4;
        boolean result = isCousins(root, x, y);
        System.out.println("result = " + result);
    }

    static int xpar, xdep, ypar, ydep;

    public static boolean isCousins(TreeNode root, int x, int y) {
        dfs(root.left, 1, x, y, root.val);
        dfs(root.right, 1, x, y, root.val);
        return (xpar != ypar) && (xdep == ydep);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了38.71%的用户
         */
    }

    public static void dfs(TreeNode node, int dep, int x, int y, int par) {
        if (node == null) {
            return;
        }
        if (node.val == x) {
            xpar = par;
            xdep = dep;
        } else if (node.val == y) {
            ypar = par;
            ydep = dep;
        } else {
            dfs(node.left, dep + 1, x, y, node.val);
            dfs(node.right, dep + 1, x, y, node.val);
        }
    }
}
