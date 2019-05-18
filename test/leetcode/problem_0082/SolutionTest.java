package leetcode.problem_0082;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void deleteDuplicates_1() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        final Node result = solution.deleteDuplicates(head);

        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(5, result.next.next.data);
    }

    @Test
    public void deleteDuplicates_2() throws Exception {
        final Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);

        final Node result = solution.deleteDuplicates(head);

        assertEquals(2, result.data);
        assertEquals(3, result.next.data);
    }
}