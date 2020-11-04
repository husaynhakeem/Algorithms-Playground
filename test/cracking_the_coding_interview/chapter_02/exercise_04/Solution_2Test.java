package cracking_the_coding_interview.chapter_02.exercise_04;

import org.junit.Test;
import cracking_the_coding_interview.chapter_02.exercise_04.Solution_2.Node;
import static org.junit.Assert.*;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void partition_1() {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        final Node partitioned = solution.partition(head, 3);

        assertEquals(1, partitioned.val);
        assertEquals(2, partitioned.next.val);
        assertEquals(3, partitioned.next.next.val);
        assertEquals(4, partitioned.next.next.next.val);
        assertEquals(5, partitioned.next.next.next.next.val);
    }

    @Test
    public void partition_2() {
        final Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        final Node partitioned = solution.partition(head, 2);

        assertEquals(1, partitioned.val);
        assertEquals(5, partitioned.next.val);
        assertEquals(2, partitioned.next.next.val);
        assertEquals(3, partitioned.next.next.next.val);
        assertEquals(4, partitioned.next.next.next.next.val);
    }

    @Test
    public void partition_3() {
        final Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        final Node partitioned = solution.partition(head, 0);

        assertEquals(5, partitioned.val);
        assertEquals(2, partitioned.next.val);
        assertEquals(3, partitioned.next.next.val);
        assertEquals(4, partitioned.next.next.next.val);
        assertEquals(1, partitioned.next.next.next.next.val);
    }
}