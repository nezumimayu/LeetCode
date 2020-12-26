package tree;

import java.util.LinkedList;

public class _No_897_IncreasingOrderSearchTree {
    public static void main(String[] args) {
        Integer[] trees = {5,3,6,2,4,null,8,1,null,null,null,7,9};
        TreeNode root = ConstructTree.constructTree(trees);
        TreeNode result = increasingBST(root);
        System.out.println("result = " + result.val);
    }

    public static TreeNode increasingBST(TreeNode root) {
//        TreeNode result = new TreeNode(0);
//        TreeNode res = result;
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        TreeNode curr = root;
//        while(curr != null || !stack.isEmpty()){
//            while(curr != null){
//                stack.add(curr);
//                curr = curr.left;
//            }
//            curr = stack.pollLast();
//            result.right = new TreeNode(curr.val);
//            result = result.right;
//            curr = curr.right;
//        }
//        return res.right;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了7.72%的用户
         * 特点：创建了新节点
         */

        TreeNode temp = new TreeNode(0);
        TreeNode res = temp;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pollLast();
            curr.left = null;
            temp.right = curr;
            temp = curr;
            curr = curr.right;
        }
        return res.right;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.3 MB, 在所有 Java 提交中击败了72.84%的用户
         * 特点：没有创建新节点
         */
    }
}
