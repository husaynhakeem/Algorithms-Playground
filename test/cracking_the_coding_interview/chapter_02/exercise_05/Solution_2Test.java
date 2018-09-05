package cracking_the_coding_interview.chapter_02.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void sumLists_1() throws Exception {
        final Solution_2.Node l1 = new Solution_2.Node(1);
        l1.next = new Solution_2.Node(2);

        final Solution_2.Node l2 = new Solution_2.Node(3);
        l2.next = new Solution_2.Node(4);
        l2.next.next = new Solution_2.Node(5);
        l2.next.next.next = new Solution_2.Node(6);

        final Solution_2.Node result = solution.sumLists(l1, l2);

        assertEquals(4, result.val);
        assertEquals(6, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(6, result.next.next.next.val);
    }

    @Test
    public void sumLists_2() throws Exception {
        final Solution_2.Node l1 = new Solution_2.Node(7);
        l1.next = new Solution_2.Node(1);
        l1.next.next = new Solution_2.Node(6);

        final Solution_2.Node l2 = new Solution_2.Node(5);
        l2.next = new Solution_2.Node(9);
        l2.next.next = new Solution_2.Node(3);

        final Solution_2.Node result = solution.sumLists(l1, l2);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }
}