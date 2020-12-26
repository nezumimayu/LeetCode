package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No_872_Leaf_SimilarTrees {
    public static void main(String[] args) {
        Integer[] trees1 = {3,5,1,6,2,9,8,null,null,7,4};
        Integer[] trees2 = {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};
        TreeNode root1 = ConstructTree.constructTree(trees1);
        TreeNode root2 = ConstructTree.constructTree(trees2);
        boolean result = leafSimilar(root1, root2);
        System.out.println("result = " + result);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leafMethod(root1).equals(leafMethod(root2));
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了27.25%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了16.49%的用户
         */

//        List<Integer> list1 = new ArrayList();
//        List<Integer> list2 = new ArrayList();
//        dfs(root1, list1);
//        dfs(root2, list2);
//        return list1.equals(list2);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了60.40%的用户
         */
    }

    private static void dfs(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.val);
            dfs(node.left, leafValues);
            dfs(node.right, leafValues);
        }
    }

    private static List<Integer> leafMethod(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            if(node.left == null && node.right == null)
                list.add(node.val);
            if(node.right != null)
                stack.add(node.right);
            if(node.left != null)
                stack.add(node.left);
        }
        return list;
    }
}
