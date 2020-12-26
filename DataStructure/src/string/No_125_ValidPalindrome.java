package string;

public class No_125_ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(str);
        System.out.println("result = " + result);
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int lef = 0, rig = chars.length - 1;
        while(lef < rig){
            while(lef < rig && !isTarget(chars[lef])){
                lef++;
            }
            while(rig >= 0 && !isTarget(chars[rig])){
                rig--;
            }
            if(lef >= rig)
                return true;
            if(chars[lef++] != chars[rig--]){
                return false;
            }
        }
        return true;
    }

    public static boolean isTarget(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了92.69%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了52.99%的用户
     */


}
