package string;

public class No_434_NumberOfSegmentsInAString {
    public static void main(String[] args) {
//        String str = "Hello, my name is John";
        String str = "  a   ";
        int result = countSegments(str);
        System.out.println("result = " + result);
    }

    public static int countSegments(String s) {
//        return "".equals(s.replace(" ", "")) ? 0 : s.trim().split("\\s+").length;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了29.27%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了43.79%的用户
         */
//        int lef = 0, result = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == ' '){
//                if(i - lef > 0){
//                    result++;
//                }
//                lef = i + 1;
//            }
//        }
//        if(chars.length - lef > 0)
//            result++;
//        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.5 MB, 在所有 Java 提交中击败了39.16%的用户
         */

        int lef = 0, result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length; i++) {
            if(i == chars.length || chars[i] == ' '){
                if(i - lef > 0){
                    result++;
                }
                lef = i + 1;
            }
        }
        return result;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了30.53%的用户
         */
    }
}
