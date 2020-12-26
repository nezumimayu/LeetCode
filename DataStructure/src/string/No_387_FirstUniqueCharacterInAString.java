package string;

public class No_387_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String str = "loveleetcode";
        int result = firstUniqChar(str);
        System.out.println("result = " + result);
    }

    public static int firstUniqChar(String s) {
//        char[] temp = s.toCharArray();
//        for (int i = 0; i < temp.length; i++) {
//            if(s.lastIndexOf(temp[i]) == i && s.indexOf(temp[i]) == i){
//                return i;
//            }
//        }
//        return -1;
        /**
         * 执行用时：19 ms, 在所有 Java 提交中击败了61.13%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了72.10%的用户
         */
        int[] temp = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            temp[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if(temp[chars[i] - 'a'] == 1)
                return i;
        }
        return -1;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了96.83%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了49.88%的用户
         */

//        int[] temp = new int[26];
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int index = s.indexOf(chars[i], i + 1);
//            if(index == -1 && temp[chars[i] - 'a'] == 0)
//                return i;
//            temp[chars[i] - 'a'] = i + 1;
//        }
//        return -1;
        /**
         * 执行用时：18 ms, 在所有 Java 提交中击败了61.47%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了91.94%的用户
         */

    }
}
