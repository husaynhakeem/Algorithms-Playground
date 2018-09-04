package cracking_the_coding_interview.chapter_02.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findKthToLast_1() throws Exception {
        final Solution.Node head = new Solution.Node(2);
        head.next = new Solution.Node(1);
        head.next.next = new Solution.Node(5);
        head.next.next.next = new Solution.Node(7);
        head.next.next.next.next = new Solution.Node(3);

        final Integer result = solution.findKthToLast(head, 1);

        assertEquals(3, (int) result);
    }

    @Test
    public void findKthToLast_2() throws Exception {
        final Solution.Node head = new Solution.Node(2);
        head.next = new Solution.Node(1);
        head.next.next = new Solution.Node(5);
        head.next.next.next = new Solution.Node(7);
        head.next.next.next.next = new Solution.Node(3);

        final Integer result = solution.findKthToLast(head, 8);

        assertNull(result);
    }

    @Test
    public void findKthToLast_3() throws Exception {
        final Solution.Node head = new Solution.Node(2);
        head.next = new Solution.Node(1);
        head.next.next = new Solution.Node(5);
        head.next.next.next = new Solution.Node(7);
        head.next.next.next.next = new Solution.Node(3);

        final Integer result = solution.findKthToLast(head, 4);

        assertEquals(1, (int) result);
    }

    @Test
    public void findKthToLast_4() throws Exception {
        final Solution.Node head = new Solution.Node(2);
        head.next = new Solution.Node(1);
        head.next.next = new Solution.Node(5);
        head.next.next.next = new Solution.Node(7);
        head.next.next.next.next = new Solution.Node(3);

        final Integer result = solution.findKthToLast(head, 5);

        assertEquals(2, (int) result);
    }
}