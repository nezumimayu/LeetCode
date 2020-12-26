package string;

public class No_58_LengthOfLastWord {
    public static void main(String[] args) {
        String str = "a ";
//        String str = "Hello World";
        int result = lengthOfLastWord(str);
        System.out.println("result = " + result);
    }

    public static int lengthOfLastWord(String s) {
//        char[] chars = s.toCharArray();
//        int lef = 0, last = 0;
//        for (int i = 0; i <= chars.length; i++) {
//            if(i == chars.length || chars[i] == ' '){
//                if(i - lef > 0){
//                    last = i - lef;
//                }
//                lef = i + 1;
//            }
//        }
//        return last;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了41.21%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了10.75%的用户
         * 特点：正序
         */
//        char[] chars = s.toCharArray();
//        int rig = chars.length - 1;
//        for (int i = chars.length - 1; i >= -1; i--) {
//            if(i == -1 || chars[i] == ' '){
//                if(rig - i > 0){
//                    return rig - i;
//                }
//                rig = i - 1;
//            }
//        }
//        return 0;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了65.37%的用户
         * 特点：逆序
         */

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了76.57%的用户
         */

//        if(s == null || s.length() == 0)
//            return 0;
//        int count = 0;
//        for(int i = s.length()-1; i >= 0; i--){
//            if(s.charAt(i) == ' '){
//                if(count == 0)
//                    continue;
//                break;
//            }
//            count++;
//        }
//        return count;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了57.81%的用户
         */
    }
}
