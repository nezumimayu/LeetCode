package tree;

import java.util.Stack;

public class No_617_MergeTwoBinaryTrees {
    public static void main(String[] args) {

    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if(t1 == null)
//            return t2;
//        if(t2 == null)
//            return t1;
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left, t2.left);
//        t1.right = mergeTrees(t1.right, t2.right);
//        return t1;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了63.69%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了83.93%的用户
         * 特点：递归
         */

//        if(t1 == null && t2 == null)
//            return null;
//        TreeNode root = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
//        root.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
//        root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
//        return root;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了63.69%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了5.10%的用户
         * 特点：创建新树
         */

        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1, t2});
        while(!stack.isEmpty()){
            TreeNode[] t = stack.pop();
            if (t[1] == null) {
                continue;
            }
            t[0].val += t[1].val;
            if(t[0].left == null){
                t[0].left = t[1].left;
            }else{
                stack.push(new TreeNode[]{t[0].left, t[1].left});
            }
            if(t[0].right == null){
                t[0].right = t[1].right;
            }else{
                stack.push(new TreeNode[]{t[0].right, t[1].right});
            }
        }
        return t1;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了7.26%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了17.08%的用户
         * 特点：迭代
         */
    }

}
