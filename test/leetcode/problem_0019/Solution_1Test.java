package leetcode.problem_0019;

import leetcode.problem_0019.Solution_1.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void removeNthFromEnd_1() throws Exception {
        final Node head = new Node(1);
        final int n = 1;

        final Node result = solution.removeNthFromEnd(head, n);

        assertNull(result);
    }

    @Test
    public void removeNthFromEnd_2() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        final int n = 2;

        final Node result = solution.removeNthFromEnd(head, n);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void removeNthFromEnd_3() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        final int n = 1;

        final Node result = solution.removeNthFromEnd(head, n);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void removeNthFromEnd_5() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        final int n = 5;

        final Node result = solution.removeNthFromEnd(head, n);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }

    @Test
    public void removeNthFromEnd_6() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(2);
        final int n = 1;

        final Node result = solution.removeNthFromEnd(head, n);

        assertEquals(1, result.val);
    }
}