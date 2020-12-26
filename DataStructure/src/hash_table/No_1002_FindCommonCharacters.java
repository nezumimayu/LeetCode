package hash_table;

import java.util.*;

public class No_1002_FindCommonCharacters {
    public static void main(String[] args) {
        String[] A = {"cool","lock","cook"};
//        String[] A = {"bella","label","roller"};
        List<String> result = commonChars(A);
        for (String s : result) {
            System.out.print(s + " -> ");
        }
    }

    public static List<String> commonChars(String[] A) {
        int[] arr = new int[26];
        for (char c : A[0].toCharArray()) {
            arr[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (char c : A[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > temp[j])
                    arr[j] = temp[j];
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                for (int j = 0; j < arr[i]; j++) {
                    list.add(String.valueOf((char)(i + 'a')));
                }
            }
        }
        return list;
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了97.65%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了88.38%的用户
         */
    }
}
