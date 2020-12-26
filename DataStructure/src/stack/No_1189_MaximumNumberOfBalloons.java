package stack;

public class No_1189_MaximumNumberOfBalloons {
    public static void main(String[] args) {
//        String str = "nlaebolko";
        String str = "loonbalxballpoon";
        int result = maxNumberOfBalloons(str);
        System.out.println("result = " + result);
    }

    public static int maxNumberOfBalloons(String text) {
//        int[] temp = new int[26];
//        for (char c : text.toCharArray()) {
//            temp[c - 'a']++;
//        }
//        int result = 0;
//        char[] list = new char[]{'b', 'a', 'l', 'l', 'o', 'o', 'n'};
//        while(true){
//            for (char c : list) {
//                if(temp[c - 'a']-- == 0){
//                    return result;
//                }
//            }
//            result++;
//        }
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了83.03%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了45.82%的用户
         */

//        int[] temp = new int[26];
//        for (char c : text.toCharArray()) {
//            temp[c - 'a']++;
//        }
//        int result = 0;
//        char[] list = new char[]{'b', 'a', 'l', 'l', 'o', 'o', 'n'};
//        while(true){
//            if(temp['b' - 'a'] >= 1 && temp['a' - 'a'] >= 1 && temp['l' - 'a'] >= 2 && temp['o' - 'a'] >= 2 && temp['n' - 'a'] >= 1){
//                temp['b' - 'a']--;
//                temp['a' - 'a']--;
//                temp['l' - 'a'] -= 2;
//                temp['o' - 'a'] -= 2;
//                temp['n' - 'a']--;
//                result++;
//            }else
//                return result;
//        }
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了36.12%的用户
         */

        int[] charCount = new int[26];
        char[] chars = text.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            charCount[(int) chars[i] - 'a']++;
        }

        int count = Math.min(charCount[(int) 'b' - 'a'], charCount[(int) 'a' - 'a']);
        count = Math.min(count, charCount[(int) 'n' - 'a']);
        count = Math.min(count, charCount[(int) 'l' - 'a'] / 2);
        count = Math.min(count, charCount[(int) 'o' - 'a'] / 2);
        return count;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了33.04%的用户
         */
    }
}
