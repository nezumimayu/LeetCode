package tree;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class No_530_MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        Integer[] trees = {1,null,3,2};
        TreeNode root = ConstructTree.constructTree(trees);
        int result = getMinimumDifference(root);
        System.out.println("result = " + result);
    }

    public static int getMinimumDifference(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        stack.offer(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.pollLast();
//            list.add(node.val);
//            if(node.right != null)
//                stack.offer(node.right);
//            if(node.left != null)
//                stack.offer(node.left);
//        }
////        Integer[] arr = list.toArray(new Integer[list.size()]);
//        int[] arr = new int[list.size()];
//        int index = 0;
//        for (Integer i : list)
//            arr[index++] = i;
//        Arrays.sort(arr);
//        int len = Integer.MAX_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] - arr[i - 1] < len)
//                len = arr[i] - arr[i - 1];
//        }
//        return len;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了9.60%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了5.00%的用户
         */

//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        TreeNode curr = root;
//        while(curr != null || !stack.isEmpty()){
//            while(curr != null){
//                stack.offer(curr);
//                curr = curr.left;
//            }
//            curr = stack.pollLast();
//            list.add(curr.val);
//            curr = curr.right;
//        }
//        int len = Integer.MAX_VALUE;
//        for (int i = 1; i < list.size(); i++) {
//            int tmep = list.get(i) - list.get(i - 1);
//            if(tmep < len)
//                len = tmep;
//        }
//        return len;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了13.84%的用户
         * 内存消耗：41.2 MB, 在所有 Java 提交中击败了5.00%的用户
         * 特点：线索化二叉树中序遍历有序
         */

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        int len = Integer.MAX_VALUE, prv = -9999;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.offer(curr);
                curr = curr.left;
            }
            curr = stack.pollLast();
            if(curr.val - prv < len){
                len = curr.val - prv;
            }
            prv = curr.val;
            list.add(curr.val);
            curr = curr.right;
        }
        return len;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了31.14%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了5.13%的用户
         * 特点：线索化二叉树中序遍历有序，prv代表前一节点
         */
    }
}
