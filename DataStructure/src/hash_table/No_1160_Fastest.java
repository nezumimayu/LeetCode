package hash_table;

import java.util.Arrays;

public class No_1160_Fastest {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int result = countCharacters(words, chars);
        System.out.println("result = " + result);
    }

    public static int countCharacters(String[] words, String chars) {
//        int[] hash = new int[26];
//        for (int i = 0; i < chars.length(); i++) {
//            ++hash[chars.charAt(i) - 'a'];
//        }
//
//        int[] clone = null;
//        int result = 0;
//
//        for (String word : words) {
//            clone = Arrays.copyOf(hash, hash.length);
//            boolean isMaster = true;
//            for (int i = 0; i < word.length(); i++) {
//                int index = word.charAt(i) - 'a';
//                if (clone[index]-- <= 0) {
//                    isMaster = false;
//                    break;
//                }
//            }
//            if (isMaster) {
//                result += word.length();
//            }
//        }
//        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了95.88%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了53.54%的用户
         * 特点：Arrays.copyOf()速度远快于clone()
         */

        int[] arr = new int[26];
        char[] table = chars.toCharArray();
        for (char c : table)
            arr[c - 'a']++;
        int result = 0;
        a : for (String word : words) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (char c : word.toCharArray()) {
                if(--temp[c - 'a'] < 0){
                    continue a;
                }
            }
            result += word.length();
        }
        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了95.88%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了90.51%的用户
         * 特点：continue a;
         */
    }


}
