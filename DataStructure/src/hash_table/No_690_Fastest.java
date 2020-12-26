package hash_table;

import java.util.*;

public class No_690_Fastest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1, 5, Arrays.asList(2, 3)), new Employee(2, 3, Arrays.asList()), new Employee(3, 3, Arrays.asList())));
        int id = 1;
        No_690_Fastest main = new No_690_Fastest();
        int result = main.getImportance(employees, id);
        System.out.println("result = " + result);
    }

//    public static int getImportance(List<Employee> employees, int id) {
//        Map<Integer, Employee> map = new HashMap<>();
//        for (int i = 0; i < employees.size(); i++) {
//            Employee employee = employees.get(i);
//            map.put(employee.id, employee);
//        }
//        return dfs(map, id);
//
//    }
//
//    public static int dfs(Map<Integer, Employee> map, int id) {
//        int ret = map.get(id).importance;
//        for (Integer subordinate : map.get(id).subordinates) {
//            ret += dfs(map, subordinate);
//        }
//        return ret;
//    }
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了98.63%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了79.66%的用户
     * 特点：把Employee放入Map中
     */

    private Employee[] employees = new Employee[2001];
    private int importance;

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            this.employees[employee.id] = employee;
        }
        recursion(this.employees[id]);

        return importance;
    }

    private void recursion(Employee employee) {
        importance += employee.importance;
        for (int sub : employee.subordinates) {
            recursion(this.employees[sub]);
        }
    }
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了99.92%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了40.30%的用户
     */
}


