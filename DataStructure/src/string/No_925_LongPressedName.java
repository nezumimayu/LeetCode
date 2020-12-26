package string;

public class No_925_LongPressedName {
    public static void main(String[] args) {
        String name = "dfuyalc";
        String typed = "adfuyalc";
        boolean result = isLongPressedName(name, typed);
        System.out.println("result = " + result);
    }

    public static boolean isLongPressedName(String name, String typed) {
        char[] nameChars = name.toCharArray();
        int index = 0;
        for (char t : typed.toCharArray()) {
            if(index < nameChars.length && t == nameChars[index])
                index++;
            else if(index == 0 || t != nameChars[index - 1])
                return false;
        }
        return index == name.length();
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了37.75%的用户
         */
    }
}
