package hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_1078_OccurrencesAfterBigram {
    public static void main(String[] args) {
//        String text = "alice is a good girl she is a good student";
//        String first = "a";
//        String second = "good";
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        String[] result = findOcurrences(text, first, second);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        String[] str = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i + 2 < str.length; i++) {
            if(str[i].equals(first) && str[i + 1].equals(second)){
                list.add(str[i + 2]);
                i++;
            }
        }
        return list.toArray(new String[list.size()]);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了52.94%的用户
         */

//        StringBuilder sb = new StringBuilder();
//        String target = sb.append(first).append(" ").append(second).toString();
//        int len = target.length();
//        List<String> list = new ArrayList<>();
//        int val = text.indexOf(target);
//        while(val != -1){
//            int end = val + len + 1;
//            while(end < text.length() && text.charAt(end) != ' '){
//                end++;
//            }
//            list.add(text.substring(val + len + 1, end));
//            text = text.substring(val + len + 1);
//            val = text.indexOf(target);
//        }
//        return list.toArray(new String[list.size()]);
    }
}
