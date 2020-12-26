package string;

public class No_859_BuddyStrings {
    public static void main(String[] args) {
        String A = "aba";
        String B = "aba";
        boolean result = buddyStrings(A, B);
        System.out.println("result = " + result);
    }

    public static boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())
            return false;
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        if(A.equals(B)){
            int[] res = new int[26];
            for (char c : a) {
                if(++res[c - 'a'] == 2)
                    return true;
            }
            return false;
        }else{
            int[] temp = new int[a.length];
            int index = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i] != b[i]){
                    temp[index++] = i;
                }
            }
            if(index == 2){
                return a[temp[0]] == b[temp[1]] && b[temp[0]] == a[temp[1]];
            }
            return false;
        }
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.92%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了92.88%的用户
         */
    }
}
