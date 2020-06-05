package leetcode.problem_0009;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    final Solution solution = new Solution();

    public void test_1() {
        final int x = 121;

        final boolean isPalindrome = solution.isPalindrome(x);
        assertTrue(isPalindrome);
    }

    public void test_2() {
        final int x = -121;

        final boolean isPalindrome = solution.isPalindrome(x);
        assertFalse(isPalindrome);
    }

    public void test_3() {
        final int x = 10;

        final boolean isPalindrome = solution.isPalindrome(x);
        assertFalse(isPalindrome);
    }
}