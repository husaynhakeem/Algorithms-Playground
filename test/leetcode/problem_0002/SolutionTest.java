package leetcode.problem_0002;

import Utilities.java.LinkedListUtils.Node;
import junit.framework.TestCase;

import static Utilities.java.LinkedListUtils.areEqual;
import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final Node l1 = createLinkedListFrom(0);
        final Node l2 = createLinkedListFrom(0);
        final Node expected = createLinkedListFrom(0);
        assertTrue(areEqual(expected, solution.addTwoNumbers(l1, l2)));
    }

    public void test_2() {
        final Node l1 = createLinkedListFrom(9);
        final Node l2 = createLinkedListFrom(1, 9, 9, 9, 9, 9, 9, 9, 9, 9);
        final Node expected = createLinkedListFrom(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(areEqual(expected, solution.addTwoNumbers(l1, l2)));
    }

    public void test_3() {
        final Node l1 = createLinkedListFrom(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
        final Node l2 = createLinkedListFrom(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
        final Node expected = createLinkedListFrom(8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1);
        assertTrue(areEqual(expected, solution.addTwoNumbers(l1, l2)));
    }
}