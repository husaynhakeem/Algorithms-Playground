package cracking_the_coding_interview.chapter_02.exercise_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionFollowUpTest {

    private final SolutionFollowUp solution = new SolutionFollowUp();

    @Test
    public void removeDuplicates_1() throws Exception {
        final SolutionFollowUp.Node head = new SolutionFollowUp.Node(2);
        head.next = new SolutionFollowUp.Node(1);
        head.next.next = new SolutionFollowUp.Node(5);
        head.next.next.next = new SolutionFollowUp.Node(1);
        head.next.next.next.next = new SolutionFollowUp.Node(7);
        head.next.next.next.next.next = new SolutionFollowUp.Node(2);

        solution.removeDuplicates(head);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(5, head.next.next.val);
        assertEquals(7, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void removeDuplicates_2() throws Exception {
        final SolutionFollowUp.Node head = new SolutionFollowUp.Node(1);
        head.next = new SolutionFollowUp.Node(1);
        head.next.next = new SolutionFollowUp.Node(1);
        head.next.next.next = new SolutionFollowUp.Node(1);
        head.next.next.next.next = new SolutionFollowUp.Node(1);

        solution.removeDuplicates(head);

        assertEquals(1, head.val);
        assertNull(head.next);
    }
}