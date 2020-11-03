package cracking_the_coding_interview.chapter_02.exercise_01;

import cracking_the_coding_interview.chapter_02.exercise_01.SolutionFollowUp_2.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionFollowUp_2Test {

    private final SolutionFollowUp_2 solution = new SolutionFollowUp_2();

    @Test
    public void removeDuplicates_1() {
        final Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(2);

        solution.removeDuplicates(head);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(5, head.next.next.val);
        assertEquals(7, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void removeDuplicates_2() {
        final Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(1);

        solution.removeDuplicates(head);

        assertEquals(1, head.val);
        assertNull(head.next);
    }
}