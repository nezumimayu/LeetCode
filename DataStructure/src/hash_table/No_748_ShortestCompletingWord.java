package hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No_748_ShortestCompletingWord {
    public static void main(String[] args) {
//        String str = "1s3 PSt";
//        String[] words = new String[]{"step", "steps", "stripe", "stepple"};
        String str = "1s3 456";
        String[] words = new String[]{"looks", "pest", "stew", "show"};
        String result = shortestCompletingWord(str, words);
        System.out.println("result = " + result);
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
//        String result = "zzzzzzzzzzzzzzzzzzzz";
//        boolean flag = false;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : licensePlate.toCharArray()) {
//            if(c >= 'A' && c <= 'Z'){
//                map.put((char)(c + 32), map.getOrDefault((char)(c + 32), 0) + 1);
//            }else if(c >= 'a' && c <= 'z'){
//                map.put(c, map.getOrDefault(c, 0) + 1);
//            }
//        }
//        a : for (int i = 0; i < words.length; i++) {
//            if(flag && words[i].length() >= result.length())
//                continue a;
//            int[] temp = new int[26];
//            for (char c : words[i].toCharArray())
//                temp[c - 'a']++;
//            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                if(entry.getValue() > temp[entry.getKey() - 'a'])
//                    continue a;
//            }
//            if(words[i].length() <= result.length())
//                result = words[i];
//            flag = true;
//
//        }
//        return result;
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了29.65%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了10.06%的用户
         */

        String result = "zzzzzzzzzzzzzzzz";
        int[] arr = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if(c >= 'A' && c <= 'Z'){
                arr[c - 'A']++;
            }else if(c >= 'a' && c <= 'z'){
                arr[c - 'a']++;
            }
        }
        a : for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= result.length())
                continue;
            int[] temp = new int[26];
            for (char c : words[i].toCharArray())
                temp[c - 'a']++;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > temp[j])
                    continue a;
            }
            result = words[i];
        }
        return result;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了94.81%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了76.73%的用户
         */

    }
}
