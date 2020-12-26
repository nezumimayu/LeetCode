package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_101_SymmetricTree {
    public static void main(String[] args) {
//        Integer[] trees = {1,2,3};
        Integer[] trees = {1,2,2,3,4,4,3};
        TreeNode root = ConstructTree.constructTree(trees);
        boolean result = isSymmetric(root);
        System.out.println("result = " + result);
    }

    public static boolean isSymmetric(TreeNode root) {
//        if(root == null)
//            return true;
//        if(root.left == null || root.right == null)
//            return root.left == root.right;
//        if(root.left.val != root.right.val)
//            return false;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root.left);
//        queue.offer(root.right);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            if((size & 1) == 1)
//                return false;
//            int[] l = new int[size];
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if(node.left != null){
//                    queue.offer(node.left);
//                    l[i] = node.left.val;
//                }else{
//                    l[i] = -1;
//                }
//                i++;
//                if(node.right != null){
//                    queue.offer(node.right);
//                    l[i] = node.right.val;
//                }else{
//                    l[i] = -1;
//                }
//            }
//            for (int i = 0, index = l.length - 1; i < size; i++) {
//                TreeNode node = queue.poll();
//                if(node.left != null){
//                    queue.offer(node.left);
//                    if(l[index - i] != node.left.val)
//                        return false;
//                }else{
//                    if(l[index - i] != -1)
//                        return false;
//                }
//                i++;
//                if(node.right != null){
//                    queue.offer(node.right);
//                    if(l[index - i] != node.right.val)
//                        return false;
//                }else{
//                    if(l[index - i] != -1)
//                        return false;
//                }
//            }
//        }
//        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了29.42%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了68.19%的用户
         */

        if(root == null || (root.left == null && root.right == null))
            return true;
        if((root.left == null) != (root.right == null) || root.left.val != root.right.val)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            int size = queue.size();
            if((size & 1) == 1)
                return false;
            int[] temp = new int[2 * size];
            for (int i = 0, index = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                temp[index++] = node.left == null ? -1 : node.left.val;
                if(node.right != null)
                    queue.offer(node.right);
                temp[index++] = node.right == null ? -1 : node.right.val;
            }
            if(!isSym(temp))
                return false;
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了29.42%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了97.43%的用户
         */
    }

    private static boolean isSym(int[] temp) {
        int l = 0, r = temp.length - 1;
        while(l <= r){
            if(temp[l++] != temp[r--])
                return false;
        }
        return true;
    }
}
