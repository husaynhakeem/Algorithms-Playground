package leetcode.problem_1019;

import Utilities.java.LinkedListUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void nextLargerNodes_1() {
        final LinkedListUtils.Node head = new LinkedListUtils.Node(2);
        head.next = new LinkedListUtils.Node(1);
        head.next.next = new LinkedListUtils.Node(5);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{5, 5, 0}, result);
    }

    @Test
    public void nextLargerNodes_2() {
        final LinkedListUtils.Node head = new LinkedListUtils.Node(2);
        head.next = new LinkedListUtils.Node(7);
        head.next.next = new LinkedListUtils.Node(4);
        head.next.next.next = new LinkedListUtils.Node(3);
        head.next.next.next.next = new LinkedListUtils.Node(5);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{7, 0, 5, 5, 0}, result);
    }

    @Test
    public void nextLargerNodes_3() {
        final LinkedListUtils.Node head = new LinkedListUtils.Node(1);
        head.next = new LinkedListUtils.Node(7);
        head.next.next = new LinkedListUtils.Node(5);
        head.next.next.next = new LinkedListUtils.Node(1);
        head.next.next.next.next = new LinkedListUtils.Node(9);
        head.next.next.next.next.next = new LinkedListUtils.Node(2);
        head.next.next.next.next.next.next = new LinkedListUtils.Node(5);
        head.next.next.next.next.next.next.next = new LinkedListUtils.Node(1);

        final int[] result = solution.nextLargerNodes(head);

        assertArrayEquals(new int[]{7, 9, 9, 9, 0, 5, 0, 0}, result);
    }

}