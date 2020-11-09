package cracking_the_coding_interview.chapter_02.exercise_06;

import cracking_the_coding_interview.chapter_02.exercise_06.Solution_2.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void isPalindrome_1() {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        final boolean result = solution.isPalindrome(head, 7);

        assertTrue(result);
    }

    @Test
    public void isPalindrome_2() {
        final Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        final boolean result = solution.isPalindrome(head, 4);

        assertFalse(result);
    }

    @Test
    public void isPalindrome_3() {
        final Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next.next = new Node(4);

        final boolean result = solution.isPalindrome(head, 8);

        assertFalse(result);
    }
}