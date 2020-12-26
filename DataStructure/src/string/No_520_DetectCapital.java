package string;

public class No_520_DetectCapital {
    public static void main(String[] args) {
        String str = "uSA";
//        String str = "Flag";
        boolean result = detectCapitalUse(str);
        System.out.println("result = " + result);
    }

    public static boolean detectCapitalUse(String word) {
//        return word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了31.48%的用户
         * 内存消耗：38 MB, 在所有 Java 提交中击败了71.07%的用户
         */

        if(word.length() == 1)
            return true;
        char[] temp = word.toCharArray();
        if(temp[1] <= 'Z'){
            for (int i = 2; i < temp.length; i++) {
                if(temp[i] > 90)
                    return false;
            }
            return temp[0] <= 'Z';
        }else{
            for (int i = 2; i < temp.length; i++) {
                if(temp[i] <= 90)
                    return false;
            }
            return true;
        }
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.2 MB, 在所有 Java 提交中击败了31.18%的用户
         */
    }
}
