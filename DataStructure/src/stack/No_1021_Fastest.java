package stack;

public class No_1021_Fastest {
    public static void main(String[] args) {

        String S = "(()())(())";

        long startTime = System.currentTimeMillis();

        String result = removeOuterParentheses(S);
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");

    }

    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') --level;
            if (level >= 1) sb.append(c);
            if (c == '(') ++level;
        }
        return sb.toString();
    }
}
