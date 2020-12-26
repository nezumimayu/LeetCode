package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_111_MinimumOfBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {3,9,20,null,null,15,7};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = minDepth(root);
        System.out.println("result = " + result);
    }

    public static int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null)
                    return level;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
        }
        return level;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了78.84%的用户
         */
    }
}
