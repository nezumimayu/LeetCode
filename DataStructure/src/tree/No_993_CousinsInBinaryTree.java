package tree;

import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class No_993_CousinsInBinaryTree {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,null,4,null,5};
//        Integer[] trees = {1,2,3,null,4};
//        Integer[] trees = {1,2,3,4};
        TreeNode root = ConstructTree.constructTree(trees);
        int x = 5, y = 4;
        boolean result = isCousins(root, x, y);
        System.out.println("result = " + result);
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        Queue<TreeNode> father = new LinkedList<>();
//        int xLevel = -1, yLevel = -2;
//        TreeNode xNode = new TreeNode(-1), yNode = new TreeNode(-1);
//        int level = 0;
//        queue.offer(root);
//        father.offer(new TreeNode(0));
//        while(!queue.isEmpty()){
//            level++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                TreeNode temp = father.poll();
//                if(node.val == x){
//                    xLevel = level;
//                    xNode = temp;
//                }else if(node.val == y){
//                    yLevel = level;
//                    yNode = temp;
//                }
//                if(node.left != null){
//                    queue.offer(node.left);
//                    father.offer(node);
//                }
//                if(node.right != null){
//                    queue.offer(node.right);
//                    father.offer(node);
//                }
//            }
//            if(xLevel == yLevel && xNode != yNode)
//                return true;
//        }
//        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了63.25%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了22.78%的用户
         */

//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            TreeNode xNode = null, yNode = null;
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    if (node.left.val == x)
//                        xNode = node;
//                    if (node.left.val == y)
//                        yNode = node;
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    if (node.right.val == x)
//                        xNode = node;
//                    if (node.right.val == y)
//                        yNode = node;
//                    queue.offer(node.right);
//                }
//                if (xNode != null && yNode != null && xNode != yNode)
//                    return true;
//            }
//        }
//        return false;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了63.25%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了50.61%的用户
         */

        int[] arr1 = new int[2];
        arr1 = judge(root, x, 0, arr1);
        int[] arr2 = new int[2];
        arr2 = judge(root, y,0, arr2);
        return arr1[0] == arr2[0] && arr1[1] != arr2[1];
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了92.94%的用户
         */
    }

    private static int[] judge(TreeNode root, int val, int level, int[] arr) {
        if(root != null){
            level++;
            if(root.left != null){
                if(root.left.val == val)
                    return new int[]{level, root.val};
                else
                    arr = judge(root.left, val, level, arr);
            }
            if(root.right != null){
                if(root.right.val == val)
                    return new int[]{level, root.val};
                else
                    arr = judge(root.right, val, level, arr);
            }
        }
        return arr;
    }
}
