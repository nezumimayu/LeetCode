package tree;

import java.util.LinkedList;

public class No_572_SubtreeOfAnotherTree {
    public static void main(String[] args) {
        Integer[] treesS = {4,-9,5,null,-1,null,8,-6,0,7,null,null,-2,null,null,null,null,-3};
//        Integer[] treesS = {3,4,5,1,2};
        Integer[] treesT = {5};
//        Integer[] treesT = {4,1,2};
        TreeNode s = ConstructTree.constructTree(treesS);
        TreeNode t = ConstructTree.constructTree(treesT);
        boolean result = isSubtree(s, t);
        System.out.println("result = " + result);
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.offer(s);
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            if(node.val == t.val && isSame(node, t))
                return true;
            if(node.right != null)
                stack.offer(node.right);
            if(node.left != null)
                stack.offer(node.left);
        }
        return false;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了75.01%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了96.31%的用户
         */
    }

    private static boolean isSame(TreeNode s, TreeNode t) {
//        if((s == null) != (t == null))
//            return false;
//        if(s == null && t == null)
//            return true;
//        if(s.val != t.val)
//            return false;
//        boolean l = false, r = false;
//        if(s.left != null && t.left != null){
//            if(s.left.val != t.left.val)
//                return false;
//            else
//                l = isSame(s.left, t.left);
//        }else if(s.left == null && t.left == null){
//            l = true;
//        }else{
//            return false;
//        }
//        if(s.right != null && t.right != null){
//            if(s.right.val != t.right.val)
//                return false;
//            else
//                r = isSame(s.right, t.right);
//        }else if(s.right == null && t.right == null){
//            r = true;
//        }else{
//            return false;
//        }
//        return l && r;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了75.01%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了96.31%的用户
         */

//        if(s != null && t != null && s.val == t.val){
//            boolean l = false, r = false;
//            if(s.left != null && t.left != null && s.left.val == t.left.val){
//                l = isSame(s.left, t.left);
//            }else{
//                l = s.left == null && t.left == null;
//            }
//            if(s.right != null && t.right != null && s.right.val == t.right.val){
//                r = isSame(s.right, t.right);
//            }else{
//                r = s.right == null && t.right == null;
//            }
//            return l && r;
//        }
//        return s == null && t == null;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了75.01%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了50.75%的用户
         */

        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if(s.val != t.val)
            return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了24.53%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了83.48%的用户
         */
    }
}
