package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_112_PathSum {
    public static void main(String[] args) {
        Integer[] trees = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode root = ConstructTree.constructTree(trees);
        int sum = 22;
        boolean result = hasPathSum(root, sum);
        System.out.println("result = " + result);
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
//        if(root == null)
//            return false;
//        if(root.val == sum && root.left == null && root.right == null)
//            return true;
//        return isHasPathSum(root.left, sum, root.val) || isHasPathSum(root.right, sum, root.val);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了63.59%的用户
         */

//        return isHasPathSum(root, sum, 0);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了25.32%的用户
         */

//        if (root == null) {
//            return false;
//        }
//        if (root.left == null && root.right == null) {
//            return sum == root.val;
//        }
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了28.58%的用户
         */

        if(root == null)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> value = new LinkedList<>();
        queue.offer(root);
        value.offer(0);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int val = value.poll() + node.val;
                if(val == sum && node.left == null && node.right == null)
                    return true;
                if(node.left != null){
                    queue.offer(node.left);
                    value.offer(val);
                }
                if(node.right != null){
                    queue.offer(node.right);
                    value.offer(val);
                }
            }
        }
        return false;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了11.64%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了99.04%的用户
         */
    }

    private static boolean isHasPathSum(TreeNode root, int sum, int val) {
        if(root == null)
            return false;
        val += root.val;
        if(val == sum && root.left == null && root.right == null)
            return true;
        boolean l = isHasPathSum(root.left, sum, val);
        boolean r = isHasPathSum(root.right, sum, val);
        return l || r;
    }
}
