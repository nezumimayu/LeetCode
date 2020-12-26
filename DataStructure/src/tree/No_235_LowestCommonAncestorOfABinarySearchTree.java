package tree;

public class No_235_LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
//        Integer[] trees = {2,1};
        Integer[] trees = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = ConstructTree.constructTree(trees);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println("result = " + result.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(p.val > q.val){
//            TreeNode temp = q;
//            q = p;
//            p = temp;
//        }
//        if(root.val > q.val)
//            return lowestCommonAncestor(root.left, p, q);
//        if(root.val < p.val)
//            return lowestCommonAncestor(root.right, p, q);
//        return root;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了99.76%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了73.75%的用户
         * 特点：LeetCode上无法识别位运算交换
         */

//        //1.p或者q是公共祖先，直接返回root
//        if (root == p || root == q) {
//            return root;
//        }
//        //2.p,q同时在root左子树;在root左子树继续找
//        if (root.val > p.val && root.val > q.val) {
//            return lowestCommonAncestor(root.left, p, q);
//        }
//        //3.p,q同时在root右子树;在root右子树继续找
//        if (root.val < p.val && root.val < q.val) {
//            return lowestCommonAncestor(root.right, p, q);
//        }
//        //4.其他情况(p,q一个在左子数，一个在右子树，公共祖先必定是root)
//        return root;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了99.76%的用户
         * 内存消耗：40.7 MB, 在所有 Java 提交中击败了20.47%的用户
         */

        TreeNode curr = root;
        while(curr != null){
            if(curr.val > p.val && curr.val > q.val)
                curr = curr.left;
            else if(curr.val < p.val && curr.val < q.val)
                curr = curr.right;
            else
                return curr;
        }
        return null;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了99.76%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了71.46%的用户
         * 特点：迭代
         */
    }
}
