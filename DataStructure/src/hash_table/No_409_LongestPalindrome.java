package hash_table;

public class No_409_LongestPalindrome {
    public static void main(String[] args) {
        String str = "abccccdd";
        int result = longestPalindrome(str);
        System.out.println("result = " + result);
    }

    public static int longestPalindrome(String s) {
        int[] temp = new int[123];
        for (char c : s.toCharArray()) {
            temp[c]++;
        }
        boolean flag = false;
        int result = 0;
        for (int i = 65; i < temp.length; i++) {
            if((temp[i] & 1) != 1){
                result += temp[i];
            }else{
                result += (temp[i] - 1);
                flag = true;
            }
        }
        return flag ? result + 1 : result;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了49.42%的用户
         */

//        int[] cnt = new int[58];
//        for (char c : s.toCharArray()) {
//            cnt[c - 'A'] += 1;
//        }
//
//        int ans = 0;
//        for (int x: cnt) {
//            // 字符出现的次数最多用偶数次。
//            ans += x - (x & 1);
//        }
//        // 如果最终的长度小于原字符串的长度，说明里面某个字符出现了奇数次，那么那个字符可以放在回文串的中间，所以额外再加一。
//        return ans < s.length() ? ans + 1 : ans;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：38.1 MB, 在所有 Java 提交中击败了30.80%的用户
         */
    }
}
