package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_404_SumOfLeftLeaves {
    public static void main(String[] args) {
//        Integer[] trees = {3,9,20,null,null,15,7};
        Integer[] trees = {1,2,3,4,5};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = sumOfLeftLeaves(root);
        System.out.println("result = " + result);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        LinkedList<TreeNode> stack = new LinkedList<>();
        int result = 0;
        stack.offer(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            if(node.right != null)
                stack.offer(node.right);
            if(node.left != null) {
                stack.offer(node.left);
                if(node.left.left == null && node.left.right == null)
                    result += node.left.val;
            }
        }
        return result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了9.33%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了80.34%的用户
         */
    }
}
