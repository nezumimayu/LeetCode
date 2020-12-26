package stack;

public class No_20_Fastest {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] data = s.toCharArray();
        char[] ss = new char[data.length + 1];
        int index = 0;
        for (char c : data) {
            if (c == ']') {
                if ('[' != ss[index]) {
                    return false;
                }
                index--;
                continue;
            }
            if (c == ')') {
                if ('(' != ss[index]) {
                    return false;
                }
                index--;
                continue;
            }
            if (c == '}') {
                if ('{' != ss[index]) {
                    return false;
                }
                index--;
                continue;
            }
            index++;
            ss[index] = c;
        }
        if (index != 0) {
            return false;
        }
        return true;
    }
}
