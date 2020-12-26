package tree;

import java.util.LinkedList;

public class No_671_SecondMinimumNodeInABinaryTree {
    public static void main(String[] args) {
//        Integer[] trees = {5,8,5};
        Integer[] trees = {2,2,5,null,null,5,7};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = findSecondMinimumValue(root);
        System.out.println("result = " + result);
    }

    public static int findSecondMinimumValue(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        int first = root.val;
        int second = Integer.MAX_VALUE;
        boolean flag = false;
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            if(node.val > second)
                continue;
            if(node.val > first && node.val <= second){
                second = node.val;
                flag = true;
            }else{
                if(node.right != null)
                    stack.offer(node.right);
                if(node.left != null)
                    stack.offer(node.left);
            }
        }
        return flag ? second : -1;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.7 MB, 在所有 Java 提交中击败了95.19%的用户
         */
    }
}
