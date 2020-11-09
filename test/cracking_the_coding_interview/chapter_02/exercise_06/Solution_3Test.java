package cracking_the_coding_interview.chapter_02.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cracking_the_coding_interview.chapter_02.exercise_06.Solution_3.Node;

public class Solution_3Test {

    private final Solution_3 solution = new Solution_3();

    @Test
    public void isPalindrome_1() {
        final Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        final boolean result = solution.isPalindrome(head);

        assertTrue(result);
    }

    @Test
    public void isPalindrome_2() {
        final Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);

        final boolean result = solution.isPalindrome(head);

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

        final boolean result = solution.isPalindrome(head);

        assertFalse(result);
    }
}