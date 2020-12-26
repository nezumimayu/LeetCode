/**
 * @author nezumimayu
 * @since 2020-12-25 10:38
 */
public class No_0102_CheckPermutationLCCI {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acb";
        boolean result = CheckPermutation(s1, s2);
        System.out.println("result = " + result);
    }

    public static boolean CheckPermutation(String s1, String s2) {
        int[] temp = new int[26];
        for(char c : s1.toCharArray()){
            temp[c - 'a']++;
        }
        for(char c : s2.toCharArray()){
            if(--temp[c - 'a'] < 0)
                return false;
        }
        for(int i : temp){
            if(i != 0)
                return false;
        }
        return true;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：36.1 MB, 在所有 Java 提交中击败了77.06%的用户
         */
    }
}
