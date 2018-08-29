package leetcode.problem_0690;

import java.util.HashMap;
import java.util.List;

class Solution {

    int getImportance(List<Employee> employees, int id) {
        final HashMap<Integer, Employee> employeesDictionary = new HashMap<>();
        for (Employee e : employees) {
            employeesDictionary.put(e.id, e);
        }
        return getImportance(employeesDictionary.get(id), employeesDictionary);
    }

    private int getImportance(final Employee employee, final HashMap<Integer, Employee> employeesDictionary) {
        int importance = employee.importance;
        for (Integer id : employee.subordinates) {
            importance += getImportance(employeesDictionary.get(id), employeesDictionary);
        }
        return importance;
    }

    static class Employee {
        int id;
        int importance;
        List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
