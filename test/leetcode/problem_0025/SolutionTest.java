package leetcode.problem_0025;

import Utilities.java.LinkedListUtils.Node;
import junit.framework.TestCase;

import static Utilities.java.LinkedListUtils.areEqual;
import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class SolutionTest extends TestCase {

    final Solution solution = new Solution();

    public void test_1() {
        final Node head = createLinkedListFrom(1, 2, 3, 4, 5);
        final int k = 1;

        final Node result = solution.reverseKGroup(head, k);

        final Node expected = createLinkedListFrom(1, 2, 3, 4, 5);
        assertTrue(areEqual(expected, result));
    }

    public void test_2() {
        final Node head = createLinkedListFrom(1, 2, 3, 4, 5);
        final int k = 2;

        final Node result = solution.reverseKGroup(head, k);

        final Node expected = createLinkedListFrom(2, 1, 4, 3, 5);
        assertTrue(areEqual(expected, result));
    }

    public void test_3() {
        final Node head = createLinkedListFrom(1, 2, 3, 4, 5);
        final int k = 3;

        final Node result = solution.reverseKGroup(head, k);

        final Node expected = createLinkedListFrom(3, 2, 1, 4, 5);
        assertTrue(areEqual(expected, result));
    }

    public void test_4() {
        final Node head = createLinkedListFrom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int k = 3;

        final Node result = solution.reverseKGroup(head, k);

        final Node expected = createLinkedListFrom(3, 2, 1, 6, 5, 4, 9, 8, 7, 10);
        assertTrue(areEqual(expected, result));
    }
}