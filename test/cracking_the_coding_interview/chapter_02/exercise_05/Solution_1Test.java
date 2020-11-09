package cracking_the_coding_interview.chapter_02.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sumLists_1() {
        final Solution_1.Node l1 = new Solution_1.Node(1);
        l1.next = new Solution_1.Node(2);

        final Solution_1.Node l2 = new Solution_1.Node(3);
        l2.next = new Solution_1.Node(4);
        l2.next.next = new Solution_1.Node(5);
        l2.next.next.next = new Solution_1.Node(6);

        final Solution_1.Node result = solution.sumLists(l1, l2, true);

        assertEquals(4, result.val);
        assertEquals(6, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(6, result.next.next.next.val);
    }

    @Test
    public void sumLists_2() {
        final Solution_1.Node l1 = new Solution_1.Node(7);
        l1.next = new Solution_1.Node(1);
        l1.next.next = new Solution_1.Node(6);

        final Solution_1.Node l2 = new Solution_1.Node(5);
        l2.next = new Solution_1.Node(9);
        l2.next.next = new Solution_1.Node(3);

        final Solution_1.Node result = solution.sumLists(l1, l2, true);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }
}