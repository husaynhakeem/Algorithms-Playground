package cracking_the_coding_interview.chapter_02.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void deleteMiddleNode_1() throws Exception {
        final Solution.Node head = new Solution.Node(1);
        head.next = new Solution.Node(2);
        head.next.next = new Solution.Node(3);
        head.next.next.next = new Solution.Node(4);
        head.next.next.next.next = new Solution.Node(5);

        solution.deleteMiddleNode(head.next.next.next);

        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
    }

    @Test
    public void deleteMiddleNode_2() throws Exception {
        final Solution.Node head = new Solution.Node(1);
        head.next = new Solution.Node(2);
        head.next.next = new Solution.Node(3);
        head.next.next.next = new Solution.Node(4);
        head.next.next.next.next = new Solution.Node(5);

        solution.deleteMiddleNode(head.next);

        assertEquals(1, head.val);
        assertEquals(3, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
    }
}