package hash_table;

import java.util.*;

public class No_884_UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] result = uncommonFromSentences(A, B);
        System.out.println(Arrays.toString(result));
    }

    public static String[] uncommonFromSentences(String A, String B) {
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String s : A.split(" ")) {
//            map.put(s, map.getOrDefault(s, 0) + 1);
//        }
//        for (String s : B.split(" ")) {
//            map.put(s, map.getOrDefault(s, 0) + 1);
//        }
//        List<String> list = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() == 1)
//                list.add(entry.getKey());
//        }
//        return list.toArray(new String[list.size()]);
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了60.98%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了75.77%的用户
         */

//        HashMap<String, Integer> map = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        sb.append(A).append(" ").append(B).append(" ");
//        char[] chars = sb.toString().toCharArray();
//        int lef = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == ' '){
//                String s = new String(chars, lef, i - lef);
//                int times = map.getOrDefault(s, 0);
//                if(times < 2)
//                    map.put(s, times + 1);
//                lef = i + 1;
//            }
//        }
//        List<String> list = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() == 1)
//                list.add(entry.getKey());
//        }
//        return list.toArray(new String[list.size()]);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.86%的用户
         * 内存消耗：38.3 MB, 在所有 Java 提交中击败了77.31%的用户
         */

        HashMap<String, Integer> map = new HashMap<>();
        for (String e : A.split(" ")) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (String e : B.split(" ")) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        List<String> ans = new ArrayList<>();
        for (String e : map.keySet()) {
            if (map.get(e) == 1) {
                ans.add(e);
            }
        }
        return ans.toArray(new String[ans.size()]);
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.86%的用户
         * 内存消耗：38.4 MB, 在所有 Java 提交中击败了69.62%的用户
         * 特点：map.keySet()遍历速度比map.entrySet()快
         */
    }
}
