package tree;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class No_938_RangeSumOfBST {
    public static void main(String[] args) {
        Integer[] trees = {18,9,27,6,15,24,30,3,null,12,null,21};
        TreeNode root = ConstructTree.constructTree(trees);
        int L = 18, R = 24;
        int result = rangeSumBST(root, L, R);
        System.out.println("result = " + result);
        System.out.println(root);
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
//        Stack<TreeNode> stack = new Stack<>();
//        if(root == null)
//            return 0;
//        stack.push(root);
//        int result = 0;
//        while(!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            if(node.val >= L && node.val <= R)
//                result += node.val;
//            if(node.right != null)
//                stack.push(node.right);
//            if(node.left != null)
//                stack.push(node.left);
//        }
//        return result;
        /**
         * 执行用时：14 ms, 在所有 Java 提交中击败了5.59%的用户
         * 内存消耗：47.5 MB, 在所有 Java 提交中击败了81.77%的用户
         * 特点：前序遍历
         */

//        Stack<TreeNode> stack = new Stack<>();
//        if(root == null)
//            return 0;
//        stack.push(root);
//        int result = 0;
//        while(!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            if(node.val < L){
//                if(node.right != null)
//                    stack.push(node.right);
//            }else if(node.val > R){
//                if(node.left != null)
//                    stack.push(node.left);
//            }else{
//                result += node.val;
//                if(node.right != null)
//                    stack.push(node.right);
//                if(node.left != null)
//                    stack.push(node.left);
//            }
//        }
//        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了15.50%的用户
         * 内存消耗：47.8 MB, 在所有 Java 提交中击败了22.81%的用户
         * 特点：栈、迭代
         */

        LinkedList<TreeNode> stack = new LinkedList<>();
        if(root == null)
            return 0;
        stack.push(root);
        int result = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            if(node.val < L){
                if(node.right != null)
                    stack.add(node.right);
            }else if(node.val > R){
                if(node.left != null)
                    stack.add(node.left);
            }else{
                result += node.val;
                if(node.right != null)
                    stack.add(node.right);
                if(node.left != null)
                    stack.add(node.left);
            }
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了19.94%的用户
         * 内存消耗：47 MB, 在所有 Java 提交中击败了98.41%的用户
         * 特点：LinkedList 模拟 Stack，迭代
         */

//        int ans = 0;
//        Stack<TreeNode> stack = new Stack();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            if (node != null) {
//                if (L <= node.val && node.val <= R)
//                    ans += node.val;
//                if (L < node.val)
//                    stack.push(node.left);
//                if (node.val < R)
//                    stack.push(node.right);
//            }
//        }
//        return ans;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了14.43%的用户
         * 内存消耗：47.5 MB, 在所有 Java 提交中击败了78.98%的用户
         */
    }
}
