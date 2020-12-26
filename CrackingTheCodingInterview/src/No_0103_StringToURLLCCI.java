/**
 * @author nezumimayu
 * @since 2020-12-26 9:50
 */
public class No_0103_StringToURLLCCI {
    public static void main(String[] args) {
        String S = "               ";
        int lenth = 5;
        String result = replaceSpaces(S, lenth);
        System.out.println("result = " + result);
    }

    public static String replaceSpaces(String S, int length) {
//        char[] chars = S.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < length; i++){
//            if(chars[i] == ' ')
//                sb.append("%20");
//            else
//                sb.append(chars[i]);
//        }
//        return sb.toString();
        /**
         * 执行用时：18 ms, 在所有 Java 提交中击败了50.85%的用户
         * 内存消耗：47.5 MB, 在所有 Java 提交中击败了7.93%的用户
         */

//        return S.substring(0, length).replace(" ", "%20");
        /**
         * 执行用时：11 ms, 在所有 Java 提交中击败了86.63%的用户
         * 内存消耗：46.7 MB, 在所有 Java 提交中击败了67.35%的用户
         */

//        int l = 0, r = 0;
//        StringBuilder sb = new StringBuilder();
//        while(r < length){
//            if(S.charAt(r) == ' '){
//                sb.append(S.substring(l, r)).append("%20");
//                r++;
//                l = r;
//            }else{
//                r++;
//            }
//        }
//        return sb.append(S.substring(l, r)).toString();
        /**
         * 执行用时：29 ms, 在所有 Java 提交中击败了17.81%的用户
         * 内存消耗：46.2 MB, 在所有 Java 提交中击败了88.14%的用户
         */

        char[] chars = new char[S.length()];
        int index = 0;
        char temp;
        for(int i = 0; i < length; i++){
            temp = S.charAt(i);
            if(temp == ' '){
                chars[index++] = '%';
                chars[index++] = '2';
                chars[index++] = '0';
            }else{
                chars[index++] = temp;
            }
        }
        return new String(chars, 0, index);
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了96.03%的用户
         * 内存消耗：45.5 MB, 在所有 Java 提交中击败了99.52%的用户
         */
    }
}
