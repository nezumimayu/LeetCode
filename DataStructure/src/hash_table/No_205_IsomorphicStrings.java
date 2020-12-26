package hash_table;

import java.util.HashMap;

public class No_205_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "ab";
        String t = "ac";
        boolean result = isIsomorphic(s, t);
        System.out.println("result = " + result);
    }

    public static boolean isIsomorphic(String s, String t) {
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//
//        char[] map = new char[256];
//        char[] bemap = new char[256];
//
//        for (int i = 0; i < sc.length; i++) {
//            if (map[sc[i]] == 0) {
//                if (bemap[tc[i]] != 0)
//                    return false;
//                map[sc[i]] = tc[i];
//                bemap[tc[i]] = sc[i];
//            } else {
//                if (map[sc[i]] != tc[i])
//                    return false;
//            }
//        }
//        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.95%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了94.06%的用户
         */

        return isMethod(s, t) && isMethod(t, s);
    }

    private static boolean isMethod(String t, String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        char[] S = s.toCharArray();
//        char[] T = t.toCharArray();
//        for (int i = 0; i < S.length; i++) {
//            map.put(S[i], i);
//        }
//        for (int i = 0; i < S.length; i++) {
//            int target = map.get(S[i]);
//            if(T[i] != T[target])
//                return false;
//        }
//        return true;
        /**
         * 执行用时：9 ms, 在所有 Java 提交中击败了70.35%的用户
         * 内存消耗：40.1 MB, 在所有 Java 提交中击败了21.59%的用户
         */

        int[] arr = new int[127];
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        for (int i = 0; i < S.length; i++) {
            if(arr[S[i]] != 0){
                int target = arr[S[i]];
                if(T[i] != T[target])
                    return false;
            }else{
                arr[S[i]] = i;
            }
        }
        for (int i = 0; i < S.length; i++) {

        }
        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.95%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了86.09%的用户
         */
    }

}
