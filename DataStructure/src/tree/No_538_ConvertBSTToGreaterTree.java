package tree;

import java.util.LinkedList;
import java.util.Stack;

public class No_538_ConvertBSTToGreaterTree {
    public static void main(String[] args) {
        Integer[] trees = {2,1,3};
//        Integer[] trees = {5,2,13};
        TreeNode root = ConstructTree.constructTree(trees);
        TreeNode result = convertBST(root);
        System.out.println("result = " + result.val);
    }

    static int num = 0;

    public static TreeNode convertBST(TreeNode root) {
//        if(root != null){
//            convertBST(root.right);
//            num += root.val;
//            root.val = num;
//            convertBST(root.left);
//        }
//        return root;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了97.91%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了6.22%的用户
         */

        int num = 0;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.add(curr);
                curr = curr.right;
            }
            curr = stack.pollLast();
            num += curr.val;
            curr.val = num;
            System.out.println("num = " + num);
            curr = curr.left;
        }
        return root;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了97.91%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了86.79%的用户
         */
    }
}
