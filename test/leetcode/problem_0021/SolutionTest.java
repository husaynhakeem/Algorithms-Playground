package leetcode.problem_0021;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void mergeTwoLists_1() throws Exception {
        final Node l1 = null;
        final Node l2 = null;

        final Node result = solution.mergeTwoLists(l1, l2);

        assertNull(result);
    }

    @Test
    public void mergeTwoLists_2() throws Exception {
        final Node l1 = new Node(1);
        final Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = new Node(3);

        final Node result = solution.mergeTwoLists(l1, l2);

        assertEquals(1, result.data);
        assertEquals(1, result.next.data);
        assertEquals(2, result.next.next.data);
        assertEquals(3, result.next.next.next.data);
    }

    @Test
    public void mergeTwoLists_3() throws Exception {
        final Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(4);
        final Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = new Node(3);

        final Node result = solution.mergeTwoLists(l1, l2);

        assertEquals(1, result.data);
        assertEquals(1, result.next.data);
        assertEquals(2, result.next.next.data);
        assertEquals(3, result.next.next.next.data);
        assertEquals(3, result.next.next.next.next.data);
        assertEquals(4, result.next.next.next.next.next.data);
    }
}