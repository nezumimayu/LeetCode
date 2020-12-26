package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _No_1408_Fastest {
    public static void main(String[] args) {
//        String[] strs = {"mass","as","hero","superhero"};
        String[] strs = {"leetcoder","leetcode","od","hamlet","am"};
//        String[] strs = {"leetcode","et","code"};
        List<String> result = stringMatching(strs);
        for (String s : result) {
            System.out.print(s + " -> ");
        }
    }

    public static List<String> stringMatching(String[] words) {
//        List<String> res = new ArrayList<>();
//        Arrays.sort(words, (String x, String y) -> x.length() - y.length());
//        for(int i = 0; i < words.length; i++){
//            for(int j = i + 1; j < words.length; j++){
//                if(words[j].contains(words[i])){
//                    res.add(words[i]);
//                    break;
//                }
//            }
//        }
//        return res;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了82.27%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了92.53%的用户
         * 特点：先对数组按长度进行排序
         *      Arrays.sort(words, (String x, String y) -> x.length() - y.length());
         */

        StringBuilder text = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (String word:words) {
            text.append(word).append(",");
        }
        String textStr = text.toString();
        for (String word:words) {
            if (textStr.indexOf(word)!=textStr.lastIndexOf(word)) {
                res.add(word);
            }
        }
        return res;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40 MB, 在所有 Java 提交中击败了38.51%的用户
         */
    }
}


