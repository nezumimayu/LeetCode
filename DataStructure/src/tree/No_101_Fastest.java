package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_101_Fastest {
    public static void main(String[] args) {
//        Integer[] trees = {1,2,3};
        Integer[] trees = {1,2,2,3,4,4,3};
        TreeNode root = ConstructTree.constructTree(trees);
        boolean result = isSymmetric(root);
        System.out.println("result = " + result);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了29.42%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了7.34%的用户
         */
    }
}
