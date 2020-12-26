package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class No_653_TwoSumIV_InputIsABST {
    public static void main(String[] args) {
        Integer[] trees = {5,3,6,2,4,null,7};
        TreeNode root = ConstructTree.constructTree(trees);
        int k = 9;
        boolean result = findTarget(root, k);
        System.out.println("result = " + result);
    }

    public static boolean findTarget(TreeNode root, int k) {
//        HashSet<Integer> set = new HashSet<>();
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        stack.offer(root);
//        while(!stack.isEmpty()){
//            TreeNode node = stack.pollLast();
//            if(set.contains(k - node.val))
//                return true;
//            else
//                set.add(node.val);
//            if(node.right != null)
//                stack.offer(node.right);
//            if(node.left != null)
//                stack.offer(node.left);
//        }
//        return false;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了48.91%的用户
         * 内存消耗：41 MB, 在所有 Java 提交中击败了13.76%的用户
         */

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int sum = list.get(l) + list.get(r);
            if (sum == k)
                return true;
            if (sum < k)
                l++;
            else
                r--;
        }
        return false;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了94.53%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了66.62%的用户
         * 特点：双指针查找
         */
    }

    public static void inorder(TreeNode root, List <Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
