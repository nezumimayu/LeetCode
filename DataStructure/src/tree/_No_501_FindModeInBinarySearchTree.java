package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _No_501_FindModeInBinarySearchTree {
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

    public static int[] findMode(TreeNode root) {
//        if(root == null)
//            return new int[]{};
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
//        int[] temp = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            temp[i] = list.get(i);
//        }
//        if(temp.length == 1)
//            return new int[]{temp[0]};
//        ArrayList<Integer> res = new ArrayList<>();
//        int max = 0, prv = 0;
//        for (int i = 1; i < temp.length; i++) {
//            if(temp[i] != temp[prv]){
//                if(i - prv > max){
//                    res.clear();
//                    res.add(temp[i - 1]);
//                    max = i - prv;
//                }else if(i - prv == max){
//                    res.add(temp[i - 1]);
//                }
//                prv = i;
//            }
//        }
//        if(temp.length - prv > max){
//            res.clear();
//            res.add(temp[temp.length - 1]);
//        }else if(temp.length - prv == max){
//            res.add(temp[temp.length - 1]);
//        }
//        int[] arr = new int[res.size()];
//        int index = 0;
//        for (Integer i : res)
//            arr[index++] = i;
//        return arr;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了30.56%的用户
         * 内存消耗：41.7 MB, 在所有 Java 提交中击败了11.45%的用户
         */

        if (root == null)
            return new int[]{};
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        TreeNode prv = root;
        int len = 0, max = 0, last = 0;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.offer(curr);
                curr = curr.left;
            }
            curr = stack.pollLast();
            if (curr.val != prv.val) {
                if (len > max) {
                    list.clear();
                    list.add(prv.val);
                    max = len;
                } else if (len == max) {
                    list.add(prv.val);
                }
                prv = curr;
                len = 1;
            } else {
                len++;
            }
            last = curr.val;
            curr = curr.right;
        }
        if (len > max) {
            return new int[]{last};
        } else if (len == max) {
            list.add(last);
        }
//        int[] arr = new int[list.size()];
//        int index = 0;
//        for (Integer i : list)
//            arr[index++] = i;
//        return arr;
        return list.stream().mapToInt(Integer::valueOf).toArray();
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了34.37%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了40.07%的用户
         */
    }
}
