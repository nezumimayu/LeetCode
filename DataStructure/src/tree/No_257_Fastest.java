package tree;

import java.util.*;

public class No_257_Fastest {
    public static void main(String[] args) {
        Integer[] trees = {1,2,3,null,5};
        TreeNode root = ConstructTree.constructTree(trees);
        List<String> result = binaryTreePaths(root);
        for (String s : result) {
            System.out.print(s + " -> ");
        }
    }


    public static List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<String>();
//        if (root == null) {
//            return paths;
//        }
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        Queue<String> pathQueue = new LinkedList<>();
//
//        nodeQueue.offer(root);
//        pathQueue.offer(Integer.toString(root.val));
//
//        while (!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.poll();
//            String path = pathQueue.poll();
//
//            if (node.left == null && node.right == null) {
//                paths.add(path);
//            } else {
//                if (node.left != null) {
//                    nodeQueue.offer(node.left);
//                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
//                }
//
//                if (node.right != null) {
//                    nodeQueue.offer(node.right);
//                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
//                }
//            }
//        }
//        return paths;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了88.57%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了26.92%的用户
         * 特点：层次遍历、双队列
         */

//        List<String> res = new ArrayList<>();
//        if (root == null)
//            return res;
//        //栈中节点和路径都是成对出现的，路径表示的是从根节点到当前节点的路径，如果到达叶子节点，说明找到了一条完整的路径
//        Stack<Object> stack = new Stack<>();
//        //当前节点和路径同时入栈
//        stack.push(root);
//        stack.push(new StringBuilder().append(root.val));
//        while (!stack.isEmpty()) {
//            //节点和路径同时出栈
//            StringBuilder path = (StringBuilder) stack.pop();
//            TreeNode node = (TreeNode) stack.pop();
//            //如果是叶子节点，说明找到了一条完整路径，把它加入到集合中
//            if (node.left == null && node.right == null) {
//                res.add(path.toString());
//            }
//            //右子节点不为空就把右子节点和路径压栈
//            if (node.right != null) {
//                stack.push(node.right);
//                stack.push(new StringBuilder(path).append( "->").append(node.right.val));
//            }
//            //左子节点不为空就把左子节点和路径压栈
//            if (node.left != null) {
//                stack.push(node.left);
//                stack.push(new StringBuilder(path).append("->").append(node.left.val));
//            }
//        }
//        return res;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了58.77%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了82.76%的用户
         * 特点：路径和节点同时入栈
         */

        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        //栈中节点和路径都是成对出现的，路径表示的是从根节点到当前节点的路径，如果到达叶子节点，说明找到了一条完整的路径
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<StringBuilder> pathStack = new Stack<>();
        //当前节点和路径分别入栈
        nodeStack.push(root);
        pathStack.push(new StringBuilder().append(root.val));
        while (!nodeStack.isEmpty()) {
            //节点和路径分别出栈
            StringBuilder path = pathStack.pop();
            TreeNode node = nodeStack.pop();
            //如果是叶子节点，说明找到了一条完整路径，把它加入到集合中
            if (node.left == null && node.right == null) {
                res.add(path.toString());
            }
            //右子节点不为空就把右子节点和路径压栈
            if (node.right != null) {
                nodeStack.push(node.right);
                pathStack.push(new StringBuilder(path).append( "->").append(node.right.val));
            }
            //左子节点不为空就把左子节点和路径压栈
            if (node.left != null) {
                nodeStack.push(node.left);
                pathStack.push(new StringBuilder(path).append("->").append(node.left.val));
            }
        }
        return res;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了58.77%的用户
         * 内存消耗：39.9 MB, 在所有 Java 提交中击败了59.58%的用户
         * 特点：双栈分别保存节点和路径
         */
    }
}
