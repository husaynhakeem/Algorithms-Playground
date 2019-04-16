package leetcode.interview_microsoft_1.problem_2;

import Utilities.java.LinkedListUtils;
import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void addTwoNumbers_1() throws Exception {
        final Node l1 = LinkedListUtils.createLinkedListFrom(3, 9, 9, 9, 9, 9, 9, 9, 9, 9);
        final Node l2 = LinkedListUtils.createLinkedListFrom(7);

        final Node result = solution.addTwoNumbers(l1, l2);

        final Node expectedResult = LinkedListUtils.createLinkedListFrom(4, 0, 0, 0, 0, 0, 0, 0, 0, 6);
        assertTrue(LinkedListUtils.areEqual(expectedResult, result));
    }

    @Test
    public void addTwoNumbers_2() throws Exception {
        final Node l1 = LinkedListUtils.createLinkedListFrom(2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 9);
        final Node l2 = LinkedListUtils.createLinkedListFrom(5, 6, 4, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 2, 4, 3, 9, 9, 9, 9);

        final Node result = solution.addTwoNumbers(l1, l2);

        final Node expectedResult = LinkedListUtils.createLinkedListFrom(8, 0, 7, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 6, 4, 8, 7, 2, 4, 3, 8);
        assertTrue(LinkedListUtils.areEqual(expectedResult, result));
    }

    @Test
    public void addTwoNumbers_3() throws Exception {
        final Node l1 = LinkedListUtils.createLinkedListFrom(5);
        final Node l2 = LinkedListUtils.createLinkedListFrom(5);

        final Node result = solution.addTwoNumbers(l1, l2);

        final Node expectedResult = LinkedListUtils.createLinkedListFrom(1, 0);
        assertTrue(LinkedListUtils.areEqual(expectedResult, result));
    }
}