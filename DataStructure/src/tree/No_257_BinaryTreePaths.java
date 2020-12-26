package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_257_BinaryTreePaths {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,null,5};
        TreeNode root = ConstructTree.constructTree(trees);
        List<String> result = binaryTreePaths(root);
        for (String s : result) {
            System.out.print(s + " -> ");
        }
    }


    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null)
            return result;
        dfs(root, new StringBuilder().append(root.val), result);
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了88.57%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了11.55%的用户
         */
    }

    private static void dfs(TreeNode root, StringBuilder sb, List<String> result) {
        if(root.right == null && root.left == null){
            result.add(sb.toString());
            return;
        }
        if(root.right != null)
            dfs(root.right, new StringBuilder(sb).append("->").append(root.right.val), result);
        if(root.left != null)
            dfs(root.left, new StringBuilder(sb).append("->").append(root.left.val), result);
    }
}
