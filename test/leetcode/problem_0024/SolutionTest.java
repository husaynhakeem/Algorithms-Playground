package leetcode.problem_0024;

import Utilities.java.LinkedListUtils;
import Utilities.java.LinkedListUtils.Node;
import junit.framework.TestCase;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class SolutionTest extends TestCase {

    final Solution solution = new Solution();

    public void test_1() {
        final Node head = createLinkedListFrom(1, 2, 3, 4);

        final Node result = solution.swapPairs(head);

        final Node expected = createLinkedListFrom(2, 1, 4, 3);
        assertTrue(LinkedListUtils.areEqual(expected, result));
    }

    public void test_2() {
        final Node head = createLinkedListFrom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Node result = solution.swapPairs(head);

        final Node expected = createLinkedListFrom(2, 1, 4, 3, 6, 5, 8, 7, 10, 9);
        assertTrue(LinkedListUtils.areEqual(expected, result));
    }

    public void test_3() {
        final Node head = createLinkedListFrom(1, 2, 3);

        final Node result = solution.swapPairs(head);

        final Node expected = createLinkedListFrom(2, 1, 3);
        assertTrue(LinkedListUtils.areEqual(expected, result));
    }
}