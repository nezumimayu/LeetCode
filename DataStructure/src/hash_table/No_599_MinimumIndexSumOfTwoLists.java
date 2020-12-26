package hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class No_599_MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        if(list1.length > list2.length)
            return findRestaurant(list2, list1);
        /**
         * 秒
         * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：40.3 MB, 在所有 Java 提交中击败了65.70%的用户
         */
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int index = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if(i <= index && map.containsKey(list2[i])){
                int temp = map.get(list2[i]);
                if(temp + i < index){
                    list.clear();
                    list.add(list2[i]);
                    index = temp + i;
                }else if(temp + i == index){
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
        /**
         * 执行用时：7 ms, 在所有 Java 提交中击败了98.10%的用户
         * 内存消耗：40.5 MB, 在所有 Java 提交中击败了17.41%的用户
         * 特点：进行 i <= index 判断，减少多余的搜索
         */
    }
}
