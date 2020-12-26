package hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_1160_FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int result = countCharacters(words, chars);
        System.out.println("result = " + result);
    }

    public static int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        char[] table = chars.toCharArray();
        for (char c : table)
            arr[c - 'a']++;

        int result = 0;

        for (String word : words) {
            int[] temp = arr.clone();
//            int[] temp = Arrays.copyOf(arr, arr.length);
            boolean flag = true;
            char[] w  = word.toCharArray();
            for (char c : w) {
                if(--temp[c - 'a'] < 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                result += word.length();
        }
        return result;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了60.85%的用户
         * 内存消耗：40.2 MB, 在所有 Java 提交中击败了54.79%的用户
         */

//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : chars.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        int result = 0;
//        for (String word : words) {
//            HashMap<Character, Integer> temp = new HashMap<>();
//            for (char c : word.toCharArray()) {
//                temp.put(c, temp.getOrDefault(c, 0) + 1);
//            }
//            boolean flag = true;
//            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
//                Character key = entry.getKey();
//                if(!map.containsKey(key) || entry.getValue() > map.get(key)){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag)
//                result += word.length();
//        }
//        return result;
        /**
         * 执行用时：65 ms, 在所有 Java 提交中击败了18.35%的用户
         * 内存消耗：40.4 MB, 在所有 Java 提交中击败了32.93%的用户
         */

//        int[] arr = new int[26];
//        char[] table = chars.toCharArray();
//        for (char c : table)
//            arr[c - 'a']++;
//        int result = 0;
//        for (String word : words) {
//            int[] temp = new int[26];
//            boolean flag = true;
//            char[] w  = word.toCharArray();
//            for (char c : w) {
//                temp[c - 'a']++;
//            }
//            for (int i = 0; i < 26; i++) {
//                if(temp[i] != 0 && temp[i] > arr[i]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag)
//                result += word.length();
//        }
//        return result;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了91.17%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了79.60%的用户
         */
    }
}
