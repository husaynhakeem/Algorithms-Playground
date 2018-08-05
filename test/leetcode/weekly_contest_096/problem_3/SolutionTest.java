package leetcode.weekly_contest_096.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void decodeAtIndex_1() throws Exception {
        final String s = "leet2code3";
        final int k = 10;

        final String result = solution.decodeAtIndex(s, k);

        assertEquals("o", result);
    }

    @Test
    public void decodeAtIndex_2() throws Exception {
        final String s = "ha22";
        final int k = 5;

        final String result = solution.decodeAtIndex(s, k);

        assertEquals("h", result);
    }

    @Test
    public void decodeAtIndex_3() throws Exception {
        final String s = "a2345678999999999999999";
        final int k = 1;

        final String result = solution.decodeAtIndex(s, k);

        assertEquals("a", result);
    }

    @Test
    public void decodeAtIndex_4() throws Exception {
        final String s = "abc";
        final int k = 3;

        final String result = solution.decodeAtIndex(s, k);

        assertEquals("c", result);
    }

    @Test
    public void decodeAtIndex_5() throws Exception {
        final String s = "y959q969u3hb22odq595";
        final int k = 222280369;

        final String result = solution.decodeAtIndex(s, k);

        assertEquals("y", result);
    }
}