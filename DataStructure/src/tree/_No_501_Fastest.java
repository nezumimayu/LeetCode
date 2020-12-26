package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _No_501_Fastest {
    public static void main(String[] args) {
//        Integer[] trees = {2147483647};
//        Integer[] trees = {1,null,2};
//        Integer[] trees = {1,1,2,null,null,2};
        Integer[] trees = {6,2,8,0,4,7,9,null,null,2,6};
//        Integer[] trees = {3,2,3,null,null,3,4,null,null,4,5,null,null,5,6};
//        Integer[] trees = {1,null,2,2};
        TreeNode root = ConstructTree.constructTree(trees);
        int[] result = findMode(root);
        System.out.println(Arrays.toString(result));
    }

    static int maxTimes = 0;

    static int thisTimes = 0;

    static List<Integer> res = new LinkedList<Integer>();

    static TreeNode pre = null;

    public static int[] findMode(TreeNode root) {
        inOrder(root);
        int length = res.size();
        int[] rr = new int[length];
        for(int i = 0; i < length; i++) {
            rr[i] = res.get(i);
        }
        return rr;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了62.47%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了51.04%的用户
         */
    }
    public static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(pre != null && pre.val == root.val) {
            thisTimes++;
        } else {
            thisTimes = 1;
        }
        if(thisTimes == maxTimes) {
            res.add(root.val);
        } else if(thisTimes > maxTimes) {
            maxTimes = thisTimes;
            res.clear();
            res.add(root.val);
        }
        pre = root;
        inOrder(root.right);
    }
}
