package tree;

import java.util.LinkedList;

public class No_572_Fastest {
    public static void main(String[] args) {
        Integer[] treesS = {4,-9,5,null,-1,null,8,-6,0,7,null,null,-2,null,null,null,null,-3};
//        Integer[] treesS = {3,4,5,1,2};
        Integer[] treesT = {5};
//        Integer[] treesT = {4,1,2};
        TreeNode s = ConstructTree.constructTree(treesS);
        TreeNode t = ConstructTree.constructTree(treesT);
        boolean result = isSubtree(s, t);
        System.out.println("result = " + result);
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (t == null) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSametree(s, t);
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了99.01%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了46.56%的用户
         */
    }

    public static boolean isSametree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSametree(s.left, t.left) && isSametree(s.right, t.right);
    }
}
