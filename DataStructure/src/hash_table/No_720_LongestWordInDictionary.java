package hash_table;

import java.util.Arrays;
import java.util.HashSet;

public class No_720_LongestWordInDictionary {
    public static void main(String[] args) {
//        String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String result = longestWord(words);
        System.out.println("result = " + result);
    }

    public static String longestWord(String[] words) {
//        HashSet<String> set = new HashSet<>(Arrays.asList(words));
//        Arrays.sort(words, (String x, String y) -> x.length() - y.length());
//        System.out.println(Arrays.toString(words));
//        String result = "~";
//        for (int i = words.length - 1; i >= 0; i--) {
//            if(words[i].length() >= result.length() && result.compareTo(words[i]) > 0){
//                char[] chars = words[i].toCharArray();
//                int len  = chars.length;
//                while(len > 0 && set.contains(new String(chars, 0, len))){
//                    len--;
//                }
//                if(len == 0)
//                    result = words[i];
//            }
//        }
//        return result;
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了76.57%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了92.24%的用户
         */

        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(Arrays.toString(words));
        String result = "~";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > result.length() || (words[i].length() == result.length() && result.compareTo(words[i]) > 0)){
                char[] chars = words[i].toCharArray();
                int len  = chars.length;
                while(len > 0 && set.contains(new String(chars, 0, len))){
                    len--;
                }
                if(len == 0)
                    result = words[i];
            }
        }
        return result;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了95.60%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了64.66%的用户
         */
    }
}
