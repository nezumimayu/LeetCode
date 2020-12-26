package tree;

import java.util.LinkedList;
import java.util.Queue;

public class No_559_MaximumDepthOfN_aryTree {
    public static void main(String[] args) {

    }

    public static int maxDepth(Node root) {
//        if(root == null)
//            return 0;
//        int result = 1;
//        for (Node child : root.children)
//            result = Math.max(result, maxDepth(child) + 1);
//        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了5.58%的用户
         */

        if(root == null)
            return 0;
        int result = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            result++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
//                for (Node child : node.children) {
//                    queue.add(child);
//                }
                if(node.children.size() != 0)
                    queue.addAll(node.children);
            }
        }
        return result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了36.28%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了5.19%的用户
         * 特点：层次遍历、addAll() 代替迭代添加
         */
    }
}
