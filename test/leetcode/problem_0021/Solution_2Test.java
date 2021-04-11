package leetcode.problem_0021;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final Node l1 = null;
        final Node l2 = null;

        final Node result = solution.mergeTwoLists(l1, l2);

        assertNull(result);
    }

    @Test
    public void test_2() {
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
    public void test_3() {
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