package tree;

import java.util.LinkedList;

public class No_1022_SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        Integer[] trees = {1,0,1,0,1,0,1};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = sumRootToLeaf(root);
        System.out.println("result = " + result);
//        int val = 0;
//        val = val << 1 | 1;
//        System.out.println(val);
//        val = val << 1 | 1;
//        System.out.println(val);
//        val = val << 1 | 0;
//        System.out.println(val);
    }

    public static int sumRootToLeaf(TreeNode root) {
//        LinkedList<TreeNode> nodeStack = new LinkedList<>();
//        LinkedList<StringBuilder> numStack = new LinkedList<>();
//        int result = 0;
//        nodeStack.add(root);
//        numStack.add(new StringBuilder().append(root.val));
//        while(!nodeStack.isEmpty()){
//            TreeNode node = nodeStack.pollLast();
//            StringBuilder sb = numStack.pollLast();
//            if(node.left == null && node.right == null) {
//                result += Integer.valueOf(sb.toString(), 2);
//                System.out.println(sb.toString());
//            }
//            if(node.right != null){
//                nodeStack.add(node.right);
//                numStack.add(new StringBuilder(sb).append(node.right.val));
//            }
//            if(node.left != null){
//                nodeStack.add(node.left);
//                numStack.add(new StringBuilder(sb).append(node.left.val));
//            }
//        }
//        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了13.18%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了20.71%的用户
         */

        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        LinkedList<Integer> numStack = new LinkedList<>();
        int result = 0;
        nodeStack.add(root);
        numStack.add(0 << 1 | root.val);
        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pollLast();
            int val = numStack.pollLast();
            if(node.left == null && node.right == null) {
                result += val;
                System.out.println(val);
            }
            if(node.right != null){
                nodeStack.add(node.right);
                numStack.add(val << 1 | node.right.val);
            }
            if(node.left != null){
                nodeStack.add(node.left);
                numStack.add(val << 1 | node.left.val);
            }
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了18.50%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了86.43%的用户
         * 特点：位运算
         */

//        return inorder(root, 0);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了15.00%的用户
         */
    }

    private static int inorder(TreeNode root, int res) {
        if(root.left == null && root.right == null)
            return res << 1 | root.val;
        res = res << 1 | root.val;
        int l = 0, r = 0;
        if(root.left != null)
            l = inorder(root.left, res);
        if(root.right != null)
            r = inorder(root.right, res);
        return l + r;
    }
}
