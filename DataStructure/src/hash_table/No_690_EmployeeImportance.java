package hash_table;

import java.util.*;

public class No_690_EmployeeImportance {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1, 5, Arrays.asList(2, 3)), new Employee(2, 3, Arrays.asList()), new Employee(3, 3, Arrays.asList())));
        int id = 1;
        int result = getImportance(employees, id);
        System.out.println("result = " + result);
    }

//    public static int getImportance(List<Employee> employees, int id) {
//        int[] temp = new int[2001];
//        int result = 0;
//        HashMap<Integer, List<Integer>> map = new HashMap<>();
//        for (Employee employee : employees) {
//            temp[employee.id] = employee.importance;
//            map.put(employee.id, employee.subordinates);
//        }
//        result += temp[id];
//        HashSet<Integer> set = new HashSet<>();
//
//        addMap(map, set, id);
//
//        for (Integer integer : set) {
//            result += temp[integer];
//        }
//        return result;
//    }
//
//    public static void addMap(Map<Integer, List<Integer>> map, HashSet<Integer> set, int id){
//        for (Integer integer : map.get(id)) {
//            set.add(integer);
//            addMap(map, set, integer);
//        }
//    }
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了67.50%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了76.86%的用户
     */

    public static int getImportance(List<Employee> employees, int id) {
        int[] temp = new int[2001];
        int result = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (Employee employee : employees) {
            temp[employee.id] = employee.importance;
            map.put(employee.id, employee.subordinates);
        }
        result += temp[id];
        result += addMap(map, id, temp);
        return result;
    }

    public static int addMap(Map<Integer, List<Integer>> map, int id, int[] temp){
        int val = 0;
        for (Integer integer : map.get(id)) {
            val += temp[integer] + addMap(map, integer, temp);
        }
        return val;
    }
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了98.63%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了52.98%的用户
     */
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
