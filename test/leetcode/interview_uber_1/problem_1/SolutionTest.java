package leetcode.interview_uber_1.problem_1;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void nextLargerNodes_1() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{5, 5, 0}, result);
    }

    @Test
    public void nextLargerNodes_2() {
        final Node head = new Node(2);
        head.next = new Node(7);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{7, 0, 5, 5, 0}, result);
    }

    @Test
    public void nextLargerNodes_3() {
        final Node head = new Node(1);
        head.next = new Node(7);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(1);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{7, 9, 9, 9, 0, 5, 0, 0}, result);
    }
}