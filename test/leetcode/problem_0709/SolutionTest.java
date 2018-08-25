package leetcode.problem_0709;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void toLowerCase_1() throws Exception {
        final String str = "Hello";

        final String result = solution.toLowerCase(str);

        assertEquals("hello", result);
    }

    @Test
    public void toLowerCase_2() throws Exception {
        final String str = "here";

        final String result = solution.toLowerCase(str);

        assertEquals("here", result);
    }

    @Test
    public void toLowerCase_3() throws Exception {
        final String str = "LOVELY";

        final String result = solution.toLowerCase(str);

        assertEquals("lovely", result);
    }

    @Test
    public void toLowerCase_4() throws Exception {
        final String str = "al&phaBET";

        final String result = solution.toLowerCase(str);

        assertEquals("al&phabet", result);
    }
}