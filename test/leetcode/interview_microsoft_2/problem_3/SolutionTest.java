package leetcode.interview_microsoft_2.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void multiply_1() throws Exception {
        final String num1 = "2";
        final String num2 = "3";

        final String result = solution.multiply(num1, num2);

        assertEquals("6", result);
    }

    @Test
    public void multiply_2() throws Exception {
        final String num1 = "123";
        final String num2 = "456";

        final String result = solution.multiply(num1, num2);

        assertEquals("56088", result);
    }

    @Test
    public void multiply_3() throws Exception {
        final String num1 = "27308732728083";
        final String num2 = "3809289282792872";

        final String result = solution.multiply(num1, num2);

        assertEquals("104026862907741521841986624376", result);
    }
}