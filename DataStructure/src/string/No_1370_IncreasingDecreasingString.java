package string;

public class No_1370_IncreasingDecreasingString {
    public static void main(String[] args) {
        String str = "leetcode";
        String result = sortString(str);
        System.out.println("result = " + result);
//        System.out.println("result = " + (char)('b' + 1));
    }

    public static String sortString(String s) {
//        int[] temp = new int[26];
//        int count = s.toCharArray().length;
//        for (char c : s.toCharArray()) {
//            temp[c - 'a']++;
//        }
//        StringBuilder sb = new StringBuilder();
//        while(count > 0){
//            for (int i = 0; i < temp.length; i++) {
//                if(temp[i] != 0){
//                    sb.append((char) ('a' + i));
//                    count--;
//                    temp[i]--;
//                }
//            }
//            for (int i = temp.length - 1; i >= 0; i--) {
//                if(temp[i] != 0){
//                    sb.append((char) ('a' + i));
//                    count--;
//                    temp[i]--;
//                }
//            }
//            System.out.println("sb.toString() = " + sb.toString());
//        }
//        return sb.toString();
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了97.83%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了22.47%的用户
         */

        int n = s.length();
        char[] ans = new char[n];
        int[] nums = new int[26];
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 97;
            nums[index]++;
        }
        int pos = 0;
        while (pos < n) {
            for (int i = 0; i < 26; i++) {
                if (nums[i] != 0) {
                    ans[pos++] = (char) (i + 97);
                    nums[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (nums[i] != 0) {
                    ans[pos++] = (char) (i + 97);
                    nums[i]--;
                }
            }
        }
        return new String(ans);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了77.53%的用户
         * 特点：用数组代替StringBuilder
         */

    }
}
