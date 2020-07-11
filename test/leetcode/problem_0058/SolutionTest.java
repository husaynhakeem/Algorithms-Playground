package leetcode.problem_0058;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final String s = "Hello world";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(5, result);
    }

    public void test_2() {
        final String s = "Helloworld";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(10, result);
    }

    public void test_3() {
        final String s = "   Helloworld";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(10, result);
    }

    public void test_4() {
        final String s = "Helloworld     ";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(10, result);
    }

    public void test_5() {
        final String s = "     Helloworld     ";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(10, result);
    }

    public void test_6() {
        final String s = "     hello Hello world     ";

        final int result = solution.lengthOfLastWord(s);

        assertEquals(5, result);
    }
}