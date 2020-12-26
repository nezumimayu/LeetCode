package tree_medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Integer[] trees = {3,9,20,null,null,15,7};
        TreeNode root = ConstructTree.constructTree(trees);
        List<List<Integer>> result = levelOrder(root);
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " -> ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return result;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了92.94%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了81.69%的用户
         */
    }
}
