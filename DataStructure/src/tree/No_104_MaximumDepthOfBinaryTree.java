package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {3,9,20,null,null,15,7};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = maxDepth(root);
        System.out.println("result = " + result);
    }

    public static int maxDepth(TreeNode root) {
//        if(root == null)
//            return 0;
//        return dfs(root, 1);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了22.97%的用户
         * 特点：DFS
         */

//        if(root == null)
//            return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了8.45%的用户
         * 特点：递归
         */

        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        while(!queue.isEmpty()){
            result++;
            int size = queue.size();                    //因为size是动态变化的，需要提前决定size
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if(node.right != null)
                    queue.add(node.right);
                if(node.left != null)
                    queue.add(node.left);
            }
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了16.47%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了91.00%的用户
         * 特点：BFS
         */
    }

    private static int dfs(TreeNode root, int i) {
        int left = i, right = i;
        if(root.left != null)
            left = dfs(root.left, i + 1);
        if(root.right != null)
            right = dfs(root.right,  i + 1);
        return Math.max(left, right);
    }

}
