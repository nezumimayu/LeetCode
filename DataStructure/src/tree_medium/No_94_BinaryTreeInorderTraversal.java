package tree_medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No_94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,4,5,6,7,null,null,8};
        TreeNode root = ConstructTree.constructTree(trees);
        List<Integer> list = inorderTraversal(root);
        for (Integer i : list) {
            System.out.print(i + " -> ");
        }
    }

    List<Integer> list = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null)
//            return list;
//        inorderTraversal(root.left);
//        list.add(root.val);
//        inorderTraversal(root.right);
//        return list;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了35.73%的用户
         */

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了49.39%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了24.84%的用户
         */
    }
}
