package string;

public class _No_345_ReverseVowelsOfAString {
    public static void main(String[] args) {
//        String str = "hello";
        String str = "Aa";
        String result = reverseVowels(str);
        System.out.println("result = " + result);
    }

//    public static String reverseVowels(String s) {
//        char[] temp = s.toCharArray();
//        int lef = 0, rig = temp.length - 1;
//        while(lef < rig){
//            if(isVowel(temp[lef]) && isVowel(temp[rig])){
//                char c = temp[rig];
//                temp[rig--] = temp[lef];
//                temp[lef++] = c;
//            }
//            if(!isVowel(temp[lef])){
//                lef++;
//            }
//            if(!isVowel(temp[rig])){
//                rig--;
//            }
//        }
//        return new String(temp);
//    }
//
//    public static boolean isVowel(char c){
//        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
//    }
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了67.68%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了58.05%的用户
     */

//    public static String reverseVowels(String s) {
//        char[] temp = s.toCharArray();
//        int lef = 0, rig = temp.length - 1;
//        while(lef < rig){
//            while(lef < rig && !isVowel(temp[lef])){
//                lef++;
//            }
//            while(lef < rig && !isVowel(temp[rig])){
//                rig--;
//            }
//            if(lef < rig){
//                char c = temp[rig];
//                temp[rig--] = temp[lef];
//                temp[lef++] = c;
//            }
//        }
//        return new String(temp);
//    }
//
//    public static boolean isVowel(char c){
//        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
//    }
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了67.68%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了58.05%的用户
     */

    public static String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        int lef = 0, rig = temp.length - 1;
        while(lef < rig){
            while(lef < rig && !isVowel(temp[lef])){
                lef++;
            }
            while(rig >= 0 && !isVowel(temp[rig])){         //rig >= 0
                rig--;
            }
            if(lef >= rig)                                  //lef >= rig 则 break
                break;
            char c = temp[rig];
            temp[rig--] = temp[lef];
            temp[lef++] = c;
        }
        return new String(temp);
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了92.60%的用户
     * 内存消耗：40 MB, 在所有 Java 提交中击败了40.92%的用户
     * 特点：修改了while(lef < rig)的内部判定条件
     */
}
