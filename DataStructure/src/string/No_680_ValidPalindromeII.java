package string;

public class No_680_ValidPalindromeII {
    public static void main(String[] args) {
//        String str = "lcupuuuupucul";
//        String str = "abca";
        String str = "edaeadeasbccbaedaeadep";
        boolean result = validPalindrome(str);
        System.out.println("result = " + result);
    }

    public static boolean validPalindrome(String s) {
//        char[] chars = s.toCharArray();
//        int lef = 0, rig = chars.length - 1;
//        int fail = 0;
//        while(lef < rig){
//            if(fail > 1)
//                return false;
//            if(chars[lef] == chars[rig]){
//                lef++;
//                rig--;
//            }else{
//                if(chars[lef + 1] == chars[rig] && (lef + 1 == rig || chars[lef + 2] == chars[rig - 1])){
//                    fail++;
//                    lef++;
//                }else if(chars[lef] == chars[rig - 1] && (lef == rig - 1 || chars[lef + 1] == chars[rig - 2])){
//                    fail++;
//                    rig--;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return true;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了74.66%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了75.34%的用户
         */

        char[] chars = s.toCharArray();
        int lef = 0, rig = chars.length - 1;
        int count = 0;
        for (; lef < rig; lef++, rig--) {
            if(chars[lef] != chars[rig]){
                if(chars[lef + 1] == chars[rig] && (lef + 1 == rig || chars[lef + 2] == chars[rig - 1])){
                    count++;
                    lef++;
                    if(count > 1)
                        return false;
                }else if(chars[lef] == chars[rig - 1] && (lef == rig - 1 || chars[lef + 1] == chars[rig - 2])){
                    count++;
                    rig--;
                    if(count > 1)
                        return false;
                }else{
                    return false;
                }
            }
        }
        return true;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了93.70%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了49.63%的用户
         */
    }
}
