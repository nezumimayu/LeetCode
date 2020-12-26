package string;

import java.util.*;

public class _No_1408_StringMatchingInAnArray {
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
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
//                if(words[i].length() < words[j].length() && i != j && words[j].indexOf(words[i]) != -1){
                if(i != j && words[j].indexOf(words[i]) != -1){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了65.25%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了99.43%的用户
         */
    }
}


