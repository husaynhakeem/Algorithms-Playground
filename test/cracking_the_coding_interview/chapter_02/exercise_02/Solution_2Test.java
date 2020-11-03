package cracking_the_coding_interview.chapter_02.exercise_02;

import cracking_the_coding_interview.chapter_02.exercise_02.Solution_2.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void findKthToLast_1() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        final Integer result = solution.findKthToLast(head, 1);

        assertEquals(3, (int) result);
    }

    @Test
    public void findKthToLast_2() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        final Integer result = solution.findKthToLast(head, 8);

        assertNull(result);
    }

    @Test
    public void findKthToLast_3() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        final Integer result = solution.findKthToLast(head, 4);

        assertEquals(1, (int) result);
    }

    @Test
    public void findKthToLast_4() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        final Integer result = solution.findKthToLast(head, 5);

        assertEquals(2, (int) result);
    }
}