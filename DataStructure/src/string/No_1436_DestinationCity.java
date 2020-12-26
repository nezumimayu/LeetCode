package string;

import linked_list.No_1290_ConvertBinaryNumberInALinkedListToInteger;

import java.util.*;

public class No_1436_DestinationCity {
    public static void main(String[] args) {
        List<List<String>> arr = new LinkedList<>(Arrays.asList(Arrays.asList("London","New York"), Arrays.asList("New York","Lima"), Arrays.asList("Lima","Sao Paulo")));
//        List<List<String>> arr = new ArrayList<>(Arrays.asList(Arrays.asList("B","C"), Arrays.asList("D","B"), Arrays.asList("C","A")));
//        List<List<String>> arr = new ArrayList<>(Arrays.asList(Arrays.asList("A","Z")));
        String result = destCity(arr);
        System.out.println("result = " + result);
    }

    public static String destCity(List<List<String>> paths) {
//        StringBuilder sb = new StringBuilder();
//        for (List<String> path : paths) {
//            sb.append(path.get(0));
//        }
//        for (List<String> path : paths) {
//            if(sb.lastIndexOf(path.get(1)) == -1)
//                return path.get(1);
//        }
//        return "null";
        /**
         * 执行用时：3 ms, 在所有 Java 提交中击败了62.94%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了66.91%的用户
         */

        HashSet<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
        /**
         * 执行用时：2 ms, 在所有 Java 提交中击败了99.97%的用户
         * 内存消耗：39.6 MB, 在所有 Java 提交中击败了30.91%的用户
         */
    }
}
