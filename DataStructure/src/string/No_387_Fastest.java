package string;

public class No_387_Fastest {
    public static void main(String[] args) {
        String str = "loveleetcode";
        int result = firstUniqChar(str);
        System.out.println("result = " + result);
    }

    public static int firstUniqChar(String s) {
        //只遍历26个字母，使用indexOf函数检查字符索引
        int result = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; ++c) {
            int pre = s.indexOf(c);
            // s包含该字符并且只出现一次
            if (pre != -1 && pre == s.lastIndexOf(c)) {
                // 取最前面的位置
                result = Math.min(pre, result);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了78.17%的用户
         */

    }
}
