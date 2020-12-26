package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_811_SubdomainVisitCount {
    public static void main(String[] args) {
        String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = subdomainVisits(str);
        for (String s : result) {
            System.out.print(s + " -> ");
        }
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
//        ArrayList<String> list = new ArrayList<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String cpdomain : cpdomains) {
//            String[] temp = cpdomain.split(" ");
//            int times = Integer.valueOf(temp[0]);
//            map.put(temp[1], map.getOrDefault(temp[1], 0) + times);
//            char[] chars = temp[1].toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if(chars[i] == '.'){
//                    String s = new String(chars, i + 1, chars.length - i - 1);
//                    map.put(s, map.getOrDefault(s, 0) + times);
//                }
//            }
//        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            StringBuilder sb = new StringBuilder();
//            list.add(sb.append(entry.getValue()).append(" ").append(entry.getKey()).toString());
//        }
//        return list;
        /**
         * 执行用时：13 ms, 在所有 Java 提交中击败了97.84%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了95.30%的用户
         */

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int times = 0;
        for (String cpdomain : cpdomains) {
            char[] chars = cpdomain.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == '.'){
                    String s = new String(chars, i + 1, chars.length - i - 1);
                    map.put(s, map.getOrDefault(s, 0) + times);
                }else if(chars[i] == ' '){
                    times = Integer.valueOf(new String(chars, 0, i));
                    String s = new String(chars, i + 1, chars.length - i - 1);
                    map.put(s, map.getOrDefault(s, 0) + times);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            list.add(sb.append(entry.getValue()).append(" ").append(entry.getKey()).toString());
        }
        return list;
        /**
         * 执行用时：10 ms, 在所有 Java 提交中击败了98.92%的用户
         * 内存消耗：40.6 MB, 在所有 Java 提交中击败了69.80%的用户
         */
    }
}
