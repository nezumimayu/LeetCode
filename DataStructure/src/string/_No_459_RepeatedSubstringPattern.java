package string;

public class _No_459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        String str = "abcabcabcabc";
//        String str = "babbbbaabb";
//        String str = "aa";
//        String str = "abacababacab";
//        String str = "aba";
//        String str = "abab";
        boolean result = repeatedSubstringPattern(str);
        System.out.println("result = " + result);
    }

    public static boolean repeatedSubstringPattern(String s) {
//        char[] temp = s.toCharArray();
//        for (int i = 0; i < temp.length / 2; i++) {
//            if(temp.length % (i + 1) == 0){
//                String src = new String(temp, 0, i + 1);
//                StringBuilder sb = new StringBuilder();
//                int len = temp.length / (i + 1);
//                for (int j = 0; j < len; j++) {
//                    sb.append(src);
//                }
//                if(s.equals(sb.toString()))
//                    return true;
//            }
//        }
//        return false;
        /**
         * 执行用时：58 ms, 在所有 Java 提交中击败了70.56%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了5.49%的用户
         */

//        char[] temp = s.toCharArray();
//        if((temp.length & 1) != 1 ){
//            String half = new String(temp, 0, temp.length / 2);
//            String other = new String(temp, temp.length / 2, temp.length / 2);
//            if(half.equals(other))
//                return true;
//        }
//        for (int i = 0; i < temp.length / 2; i++) {
//            if(temp.length % (i + 1) == 0){
//                String src = new String(temp, 0, i + 1);
//                StringBuilder sb = new StringBuilder();
//                int len = temp.length / (i + 1);
//                for (int j = 0; j < len; j++) {
//                    sb.append(src);
//                }
//                if(s.equals(sb.toString()))
//                    return true;
//            }
//        }
//        return false;
        /**
         * 执行用时：24 ms, 在所有 Java 提交中击败了79.79%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了57.23%的用户
         */

        if(s.length() == 2)
            return s.charAt(0) == s.charAt(1);
        char[] temp = s.toCharArray();
        char c = s.charAt(0);
        int len = -1, log = 0;
        for (int i = 1; i < temp.length; i++) {
            if(len == -1){
                if(i < temp.length - 1 && temp[i] == c && temp.length % i == 0) {
                    len = i;
                    log = i;
                }
            }else{
                if(temp[i] == c)
                    log = i;
                if(temp[i] != temp[i - len]){
                    if(log == len)
                        i = len + 1;
                    else
                        i = log - 1;
                    len = -1;
                }
            }
        }
        return len != -1;

        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了97.46%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了8.67%的用户
         */
    }
}
