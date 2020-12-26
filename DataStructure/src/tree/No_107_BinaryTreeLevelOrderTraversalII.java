package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_107_BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {
        Integer[] trees = {3,9,20,null,null,15,7};
        TreeNode root = ConstructTree.constructTree(trees);
        List<List<Integer>> result = levelOrderBottom(root);
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " -> ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            result.addFirst(list);
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.25%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了63.97%的用户
         */
    }
}
