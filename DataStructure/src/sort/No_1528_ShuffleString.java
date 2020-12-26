package sort;

public class No_1528_ShuffleString {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        String result = restoreString(s, indices);
        System.out.println("result = " + result);
    }

    public static String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        int index = 0;
        for (int i : indices)
            str[i] = s.charAt(index++);
        return new String(str);
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.8 MB, 在所有 Java 提交中击败了79.70%的用户
         */
    }
}
