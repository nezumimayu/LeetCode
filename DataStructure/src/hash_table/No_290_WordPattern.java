package hash_table;

import java.util.HashMap;

public class No_290_WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog dog dog dog";
//        String pattern = "abba";
//        String str = "dog cat cat dog";
        boolean result = wordPattern(pattern, str);
        System.out.println("result = " + result);
    }

    public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        char[] chars = pattern.toCharArray();
        if(s.length != chars.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> _map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                if(!s[i].equals(map.get(chars[i])))
                    return false;
            }else{
                map.put(chars[i], s[i]);
            }
            if(_map.containsKey(s[i])){
                if(chars[i] != _map.get(s[i]))
                    return false;
            }else{
                _map.put(s[i], chars[i]);
            }
        }
        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了98.73%的用户
         * 内存消耗：37.7 MB, 在所有 Java 提交中击败了40.82%的用户
         */
    }
}
