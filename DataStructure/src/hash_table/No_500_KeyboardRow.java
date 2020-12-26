package hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_500_KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findWords(String[] words) {
        if(words.length == 0)
            return new String[]{};
        ArrayList<String> list = new ArrayList<>();
        int[] line = new int[]{2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        for (String word : words) {
            char[] temp = word.toLowerCase().toCharArray();
            int l = line[temp[0] - 'a'];
            boolean flag = true;
            for (char c : temp) {
                if(line[c - 'a'] != l)
                    flag = false;
            }
            if(flag)
                list.add(word);
        }
        return list.toArray(new String[list.size()]);
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.6 MB, 在所有 Java 提交中击败了51.68%的用户
         * 特点：ArrayList<String>转为字符串数组
         */
    }
}
