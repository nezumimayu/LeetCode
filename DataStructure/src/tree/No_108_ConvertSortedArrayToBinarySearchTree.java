package tree;

import java.util.Arrays;

public class No_108_ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode result = sortedArrayToBST(nums);
        System.out.println(result.val);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
//        if(nums.length == 0)
//            return null;
//        TreeNode node = new TreeNode(nums[nums.length / 2]);
//        node.left = sortedArrayToBST(ArraySub(nums, 0, nums.length / 2));
//        node.right = sortedArrayToBST(ArraySub(nums, nums.length / 2 + 1, nums.length));
//        return node;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了5.09%的用户
         * 特点：数组没必要
         */

        return dfs(nums, 0, nums.length - 1);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了49.53%的用户
         */
    }

    private static int[] ArraySub(int[] nums, int start, int end) {
        int[] temp = new int[end - start];
        for (int i = start, index = 0; i < end; i++) {
            temp[index++] = nums[i];
        }
        return temp;
    }

    private static TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }

}
