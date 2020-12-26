package hash_table;

import java.util.Arrays;

public class _No_706_DesignHashMap {
    public static void main(String[] args) {
        _No_706_DesignHashMap hashMap = new _No_706_DesignHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));                 // 返回 1
        hashMap.get(3);                 // 返回 -1 (未找到)
        hashMap.put(2, 1);              // 更新已有的值
        hashMap.get(2);                 // 返回 1
        hashMap.remove(2);         // 删除键为2的数据
        hashMap.get(2);                 // 返回 -1 (未找到)

    }

    int[] arr = new int[1000001];

    /** Initialize your data structure here. */
    public _No_706_DesignHashMap() {
//        Arrays.fill(arr, -1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(value == 0)
            arr[key] = -1;
        else
            arr[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(arr[key] == -1)
            return 0;
        else if(arr[key] == 0)
            return -1;
        else return arr[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arr[key] = 0;
    }
    /**
     * 执行用时：40 ms, 在所有 Java 提交中击败了24.35%的用户
     * 内存消耗：46.9 MB, 在所有 Java 提交中击败了28.54%的用户
     */
}
