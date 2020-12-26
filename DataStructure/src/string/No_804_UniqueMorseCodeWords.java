package string;

import java.util.HashSet;
import java.util.Set;

public class No_804_UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = uniqueMorseRepresentations(words);
        System.out.println("result = " + result);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 97]);
            }
            set.add(sb.toString());
            System.out.println("sb = " + sb.toString());
        }
        return set.size();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.19%的用户
         * 内存消耗：37.4 MB, 在所有 Java 提交中击败了88.52%的用户
         */
    }
}
