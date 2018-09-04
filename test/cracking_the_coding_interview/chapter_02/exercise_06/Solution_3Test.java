package cracking_the_coding_interview.chapter_02.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_3Test {

    private final Solution_3 solution = new Solution_3();

    @Test
    public void isPalindrome_1() throws Exception {
        final Solution_3.Node head = new Solution_3.Node(1);
        head.next = new Solution_3.Node(2);
        head.next.next = new Solution_3.Node(3);
        head.next.next.next = new Solution_3.Node(4);
        head.next.next.next.next = new Solution_3.Node(3);
        head.next.next.next.next.next = new Solution_3.Node(2);
        head.next.next.next.next.next.next = new Solution_3.Node(1);

        final boolean result = solution.isPalindrome(head, 7);

        assertTrue(result);
    }

    @Test
    public void isPalindrome_2() throws Exception {
        final Solution_3.Node head = new Solution_3.Node(3);
        head.next = new Solution_3.Node(4);
        head.next.next = new Solution_3.Node(5);
        head.next.next.next = new Solution_3.Node(6);

        final boolean result = solution.isPalindrome(head, 4);

        assertFalse(result);
    }
}