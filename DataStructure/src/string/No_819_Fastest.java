package string;

import java.util.*;

public class No_819_Fastest {
    public static void main(String[] args) {
//        String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String str = "Bob. hIt, baLl";
        String[] ban = new String[]{"bob", "hit"};
        String result = mostCommonWord(str, ban);
        System.out.println("result = " + result);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
//        Set<String> banset = new HashSet<>(Arrays.asList(banned));
//        Map<String, Integer> count = new HashMap<>();
//        char[] p = paragraph.toCharArray();
//        int pre = 0, cur = 0, max = 0;
//        String res = "";
//        while (cur < p.length) {
//            if (!Character.isLetter(p[cur])) {
//                cur++;
//                pre++;
//            }
//            while (cur < p.length && Character.isLetter(p[cur]))
//                cur++;
//            String s = paragraph.substring(pre, cur).toLowerCase();
//            if (!banset.contains(s)) {
//                int i = count.getOrDefault(s, 0);
//                count.put(s, i + 1);
//                if (count.get(s) > max) {
//                    max = count.get(s);
//                    res = s;
//                }
//            }
//            cur++;
//            pre = cur;
//        }
//        return res;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了97.25%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了91.26%的用户
         */

        Set<String> set = new HashSet(Arrays.asList(banned));
        char[] chars = paragraph.toCharArray();
        int left = -1;
        Map<String, Integer> map = new HashMap();
        int max = 0;
        String ans = null;
        int last = chars.length - 1;
        boolean has = false;
        for (int right = 0; right < chars.length; right++) {
            char ch = chars[right];
            if (ch >= 'A' && ch <= 'Z') {
                has = true;
                chars[right] = (char)(ch + 32);
                if (right < last) continue;
                right++;
            } else if (ch >= 'a' && ch <= 'z') {
                has = true;
                if (right < last) continue;
                right++;
            }
            if (has) {
                int len = right - left - 1;
                String s = new String(chars, left + 1, len);
                if (!set.contains(s)) {
                    int count = map.getOrDefault(s, 0) + 1;     //当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
                    map.put(s, count);
                    if (count > max) {
                        max = count;
                        ans = s;
                    }
                }
                has = false;
            }
            left = right;
        }

        return ans;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了99.08%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了96.96%的用户
         * 特点：
         * if (!set.contains(s)) {
         *     int count = map.getOrDefault(s, 0) + 1;
         *     map.put(s, count);
         *     if (count > max) {
         *         max = count;
         *         ans = s;
         *     }
         * }
         */


    }
}
