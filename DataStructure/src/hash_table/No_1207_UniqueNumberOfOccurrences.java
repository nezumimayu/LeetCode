package hash_table;

import java.util.*;

public class No_1207_UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2};
        boolean result = uniqueOccurrences(arr);
        System.out.println("result = " + result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
//        int[] temp = new int[2001];
//        for (int i : arr) {
//            temp[i + 1000]++;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : temp) {
//            if(i != 0){
//                if(set.contains(i))
//                    return false;
//                set.add(i);
//            }
//        }
//        return true;
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了90.98%的用户
         * 内存消耗：39.3 MB, 在所有 Java 提交中击败了6.42%的用户
         */

        Map<Integer, Integer> counter = new HashMap<>();
        for (int elem : arr)
            counter.put(elem, counter.getOrDefault(elem, 0) + 1);
        return counter.size() == new HashSet<Integer>(counter.values()).size();
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了90.98%的用户
         * 内存消耗：37.9 MB, 在所有 Java 提交中击败了46.96%的用户
         * 特点：count的size()与count的values()组成的Set比较数量
         */

//        HashSet<Integer> set = new HashSet<>();
//        Arrays.sort(arr);
//        int index = 0;
//        while (index < arr.length) {
//            int start = index;
//            while (index < arr.length && arr[index] == arr[start])
//                index++;
//            if (set.contains(index - start))
//                return false;
//            set.add(index - start);
//        }
//        return true;
        /**
         * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：37.8 MB, 在所有 Java 提交中击败了64.53%的用户
         */
    }
}
