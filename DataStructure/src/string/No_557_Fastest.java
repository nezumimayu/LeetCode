package string;

public class No_557_Fastest {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String result = reverseWords(str);
        System.out.println("result = " + result);
    }

    public static String reverseWords(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                reverse(str, left, i - 1);
                left = i + 1;
            }
        }
        reverse(str, left, str.length - 1);
        return String.valueOf(str);
    }

    public static void reverse(char[] str, int i, int j) {
        while (i < j) {
            char ch = str[i];
            str[i] = str[j];
            str[j] = ch;
            i++;
            j--;
        }
    }
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.1 MB, 在所有 Java 提交中击败了86.56%的用户
     * 特点：最后一个单词的反转写在循环外
     */
}
