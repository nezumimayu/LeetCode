package tree;

import java.util.LinkedList;

public class No_606_ConstructStringFromBinaryTree {
    public static void main(String[] args) {
//        Integer[] trees = {1,2,null,3,4};
//        Integer[] trees = {5,2,null,4,3,1};
        Integer[] trees = {1,2,3,null,4};
//        Integer[] trees = {1,2,3,4};
        TreeNode root = ConstructTree.constructTree(trees);
        String result = tree2str(root);
        System.out.println("result = " + result);
    }

    static StringBuilder res = new StringBuilder();

    public static String tree2str(TreeNode t) {
//        if(t == null)
//            return "";
//        String result = strBuilder(t).toString();
//        return result.substring(1, result.length() - 1);
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了72.28%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了72.46%的用户
         */

        if(t == null)
            return "";
        res.append(t.val);
        if(t.left != null)
            strMethod(t.left);
        if(t.right != null){
            if(t.left == null)
                res.append('(').append(')');
            strMethod(t.right);
        }
        return res.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了95.14%的用户
         * 内存消耗：39.1 MB, 在所有 Java 提交中击败了100.00%的用户
         */
    }

    private static void strMethod(TreeNode t) {
        if(t == null)
            return;
        res.append('(').append(t.val);
        if(t.left != null)
            strMethod(t.left);
        if(t.right != null){
            if(t.left == null)
                res.append('(').append(')');
            strMethod(t.right);
        }
        res.append(')');
    }

    private static StringBuilder strBuilder(TreeNode t) {
        if(t == null)
            return new StringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(t.val);
        if(t.left != null)
            sb.append(strBuilder(t.left));
        if(t.right != null){
            if(t.left == null){
                sb.append("()");
            }
            sb.append(strBuilder(t.right));
        }
        sb.append(")");
        return sb;
    }
}
