package tree;

public class No_606_Fastest {
    public static void main(String[] args) {
//        Integer[] trees = {1,2,null,3,4};
//        Integer[] trees = {5,2,null,4,3,1};
        Integer[] trees = {1,2,3,null,4};
//        Integer[] trees = {1,2,3,4};
        TreeNode root = ConstructTree.constructTree(trees);
        String result = tree2str(root);
        System.out.println("result = " + result);
    }

    static StringBuilder res = new StringBuilder();

    public static String tree2str(TreeNode t) {
//        if (t == null)
//            return "";
//        if (t.left == null && t.right == null)
//            return t.val + "";
//        if (t.right == null)
//            return t.val + "(" + tree2str(t.left) + ")";
//        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
        /**
         * 执行用时：18 ms, 在所有 Java 提交中击败了54.64%的用户
         * 内存消耗：41.4 MB, 在所有 Java 提交中击败了22.82%的用户
         */

//        return strMethod(t).toString();
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了66.79%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了70.29%的用户
         */

        StringBuilder result = new StringBuilder();
        strMethod2(t, result);
        return result.toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了95.14%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了96.38%的用户
         */
    }

    private static void strMethod2(TreeNode t, StringBuilder result) {
        if (t == null)
            return;
        if (t.left == null && t.right == null){
            result.append(t.val);
            return;
        }
        if (t.right == null){
            result.append(t.val).append("(");
            strMethod2(t.left, result);
            result.append(")");
            return;
        }
        result.append(t.val).append("(");
        strMethod2(t.left, result);
        result.append(")(");
        strMethod2(t.right, result);
        result.append(")");
    }

    private static StringBuilder strMethod(TreeNode t) {
        if (t == null)
            return new StringBuilder();
        if (t.left == null && t.right == null)
            return new StringBuilder().append(t.val);
        if (t.right == null)
            return new StringBuilder().append(t.val).append("(").append(strMethod(t.left)).append(")");
        return new StringBuilder().append(t.val).append("(").append(strMethod(t.left)).append(")(").append(strMethod(t.right)).append(")");
    }

}
