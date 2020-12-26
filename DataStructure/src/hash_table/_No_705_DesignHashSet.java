package hash_table;

public class _No_705_DesignHashSet {
    public static void main(String[] args) {
        _No_705_DesignHashSet hashSet = new _No_705_DesignHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);// returns true
        hashSet.contains(3);// returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);// returns true
        hashSet.remove(2);
        hashSet.contains(2);// returns false (already removed)
    }

    boolean[] arr = new boolean[1000001];
    public _No_705_DesignHashSet() {

    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
    /**
     * 执行用时：15 ms, 在所有 Java 提交中击败了99.35%的用户
     * 内存消耗：48.4 MB, 在所有 Java 提交中击败了21.78%的用户
     */
}
