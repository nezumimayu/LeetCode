package hash_table;

public class No_299_BullsAndCows {
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        String result = getHint(secret, guess);
        System.out.println("result = " + result);
    }

    public static String getHint(String secret, String guess) {
//        int[] arr = new int[10];
//        int[] temp = new int[10];
//        char[] s = secret.toCharArray();
//        char[] g = guess.toCharArray();
//        int A = 0, B = 0;
//        for (int i = 0; i < s.length; i++) {
//            if(s[i] == g[i])
//                A++;
//            else{
//                arr[s[i] - '0']++;
//                temp[g[i] - '0']++;
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            B += Math.min(arr[i], temp[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        return sb.append(A).append("A").append(B).append("B").toString();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了94.32%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了81.05%的用户
         */

        int[] arr = new int[10];
        int[] temp = new int[10];
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        int A = 0, B = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == g[i])
                A++;
            else{
                arr[s[i] - '0']++;
                temp[g[i] - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            B += Math.min(arr[i], temp[i]);
        }
        StringBuffer sb = new StringBuffer();
        return sb.append(A).append("A").append(B).append("B").toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了38.38%的用户
         * 特点：使用StringBuffer()比使用StringBuilder()快 1ms，没有头绪
         */

//        StringBuilder sb = new StringBuilder();
//        int a = 0, b = 0;
//        int[] s = new int[10];
//        int[] g = new int[10];
//        for (int i = 0; i < secret.length(); i++) {
//            s[secret.charAt(i) - '0']++;
//            g[guess.charAt(i) - '0']++;
//            a += secret.charAt(i) == guess.charAt(i) ? 1 : 0;
//        }
//        for (int i = 0; i < s.length; i++)
//            b += Math.min(s[i], g[i]);
//        return sb.append(a).append("A").append(b - a).append("B").toString();
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.5 MB, 在所有 Java 提交中击败了92.97%的用户
         */
    }
}
