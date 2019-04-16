package leetcode.problem_0708;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void insert_1() throws Exception {
        final Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = head;

        final Node result = solution.insert(head, 3);

        assertEquals(3, result.next.next.data);
    }

    @Test
    public void insert_2() throws Exception {
        final Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = head;

        final Node result = solution.insert(head, 6);

        assertEquals(6, result.next.next.next.data);
    }

    @Test
    public void insert_3() throws Exception {
        final Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = head;

        final Node result = solution.insert(head, 0);

        assertEquals(0, result.next.next.next.data);
    }

    @Test
    public void insert_4() throws Exception {
        final Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = head;

        final Node result = solution.insert(head, 3);

        assertEquals(3, result.next.next.next.data);
    }
}