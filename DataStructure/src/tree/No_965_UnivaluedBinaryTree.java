package tree;

import java.util.LinkedList;

public class No_965_UnivaluedBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {1,1,1,1,1,null,1};
        TreeNode root = ConstructTree.constructTree(trees);
        boolean result = isUnivalTree(root);
        System.out.println("result = " + result);
    }

    public static boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        int temp = root.val;
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pollLast();
            if(curr.val != temp)
                return false;
            curr = curr.right;
        }
        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了27.21%的用户
         */
    }
}
