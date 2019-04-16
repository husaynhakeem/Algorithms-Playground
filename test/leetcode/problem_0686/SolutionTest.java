package leetcode.problem_0686;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void repeatedStringMatch_1() throws Exception {
        final String A = "abcd";
        final String B = "cdabcdab";

        final int result = solution.repeatedStringMatch(A, B);

        assertEquals(3, result);
    }

    @Test
    public void repeatedStringMatch_2() throws Exception {
        final String A = "abcd";
        final String B = "abcdabcd";

        final int result = solution.repeatedStringMatch(A, B);

        assertEquals(2, result);
    }

    @Test
    public void repeatedStringMatch_3() throws Exception {
        final String A = "abcd";
        final String B = "jfezpfkezpfez";

        final int result = solution.repeatedStringMatch(A, B);

        assertEquals(-1, result);
    }
}