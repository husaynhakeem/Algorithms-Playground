package cracking_the_coding_interview.chapter_02.exercise_04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void partition_1() {
        final int partition = 5;
        final Solution.Node head = new Solution.Node(3);
        head.next = new Solution.Node(5);
        head.next.next = new Solution.Node(8);
        head.next.next.next = new Solution.Node(5);
        head.next.next.next.next = new Solution.Node(10);
        head.next.next.next.next.next = new Solution.Node(2);
        head.next.next.next.next.next.next = new Solution.Node(1);

        solution.partition(head, partition);

        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertEquals(10, head.next.next.next.next.val);
        assertEquals(5, head.next.next.next.next.next.val);
        assertEquals(8, head.next.next.next.next.next.next.val);
    }

    @Test
    public void partition_2() {
        final int partition = 8;
        final Solution.Node head = new Solution.Node(3);
        head.next = new Solution.Node(5);
        head.next.next = new Solution.Node(8);
        head.next.next.next = new Solution.Node(5);
        head.next.next.next.next = new Solution.Node(10);
        head.next.next.next.next.next = new Solution.Node(2);
        head.next.next.next.next.next.next = new Solution.Node(1);

        solution.partition(head, partition);

        assertEquals(3, head.val);
        assertEquals(5, head.next.val);
        assertEquals(5, head.next.next.val);
        assertEquals(2, head.next.next.next.val);
        assertEquals(1, head.next.next.next.next.val);
        assertEquals(8, head.next.next.next.next.next.val);
        assertEquals(10, head.next.next.next.next.next.next.val);
    }

    @Test
    public void partition_3() {
        final int partition = 11;
        final Solution.Node head = new Solution.Node(3);
        head.next = new Solution.Node(5);
        head.next.next = new Solution.Node(8);
        head.next.next.next = new Solution.Node(5);
        head.next.next.next.next = new Solution.Node(10);
        head.next.next.next.next.next = new Solution.Node(2);
        head.next.next.next.next.next.next = new Solution.Node(1);

        solution.partition(head, partition);

        assertEquals(3, head.val);
        assertEquals(5, head.next.val);
        assertEquals(8, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertEquals(10, head.next.next.next.next.val);
        assertEquals(2, head.next.next.next.next.next.val);
        assertEquals(1, head.next.next.next.next.next.next.val);
    }

    @Test
    public void partition_4() {
        final int partition = 0;
        final Solution.Node head = new Solution.Node(3);
        head.next = new Solution.Node(5);
        head.next.next = new Solution.Node(8);
        head.next.next.next = new Solution.Node(5);
        head.next.next.next.next = new Solution.Node(10);
        head.next.next.next.next.next = new Solution.Node(2);
        head.next.next.next.next.next.next = new Solution.Node(1);

        solution.partition(head, partition);

        assertEquals(3, head.val);
        assertEquals(5, head.next.val);
        assertEquals(8, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertEquals(10, head.next.next.next.next.val);
        assertEquals(2, head.next.next.next.next.next.val);
        assertEquals(1, head.next.next.next.next.next.next.val);
    }
}