package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_637_AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {3,9,20,15,7};
        TreeNode root = ConstructTree.constructTree(trees);
        List<Double> result = averageOfLevels(root);
        for (Double d : result) {
            System.out.print(d + " -> ");
        }
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Double val = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                val += node.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            result.add(val / size);
        }
        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了74.13%的用户
         * 内存消耗：41.4 MB, 在所有 Java 提交中击败了68.16%的用户
         */
    }
}
