package leetcode.problem_0690;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void getImportance_1() throws Exception {
        final List<Solution.Employee> employees = ListUtils.createList(
                new Solution.Employee(1, 5, ListUtils.createList(2, 3)),
                new Solution.Employee(2, 3, ListUtils.createList()),
                new Solution.Employee(3, 3, ListUtils.createList())
        );
        final int id = 1;

        final int result = solution.getImportance(employees, id);

        assertEquals(11, result);
    }

    @Test
    public void getImportance_2() throws Exception {
        final List<Solution.Employee> employees = ListUtils.createList(
                new Solution.Employee(1, 5, ListUtils.createList(2, 3)),
                new Solution.Employee(2, 3, ListUtils.createList()),
                new Solution.Employee(3, 3, ListUtils.createList())
        );
        final int id = 2;

        final int result = solution.getImportance(employees, id);

        assertEquals(3, result);
    }

    @Test
    public void getImportance_3() throws Exception {
        final List<Solution.Employee> employees = ListUtils.createList(
                new Solution.Employee(1, 5, ListUtils.createList(2, 3)),
                new Solution.Employee(2, 3, ListUtils.createList()),
                new Solution.Employee(3, 3, ListUtils.createList(4)),
                new Solution.Employee(4, 3, ListUtils.createList())
        );
        final int id = 1;

        final int result = solution.getImportance(employees, id);

        assertEquals(14, result);
    }
}