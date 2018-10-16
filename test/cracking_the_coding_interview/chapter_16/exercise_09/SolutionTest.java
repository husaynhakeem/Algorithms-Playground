package cracking_the_coding_interview.chapter_16.exercise_09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void subtract_1() throws Exception {
        final int a = 0;
        final int b = 3;

        final int result = solution.subtract(a, b);

        assertEquals(-3, result);
    }

    @Test
    public void subtract_2() throws Exception {
        final int a = 244;
        final int b = -56;

        final int result = solution.subtract(a, b);

        assertEquals(300, result);
    }

    @Test
    public void subtract_3() throws Exception {
        final int a = -56;
        final int b = -44;

        final int result = solution.subtract(a, b);

        assertEquals(-12, result);
    }

    @Test
    public void multiply_1() throws Exception {
        final int a = -10;
        final int b = 256;

        final int result = solution.multiply(a, b);

        assertEquals(-2560, result);
    }

    @Test
    public void multiply_2() throws Exception {
        final int a = 0;
        final int b = 256;

        final int result = solution.multiply(a, b);

        assertEquals(0, result);
    }

    @Test
    public void multiply_3() throws Exception {
        final int a = 10;
        final int b = 256;

        final int result = solution.multiply(a, b);

        assertEquals(2560, result);
    }

    @Test
    public void multiply_4() throws Exception {
        final int a = -10;
        final int b = -256;

        final int result = solution.multiply(a, b);

        assertEquals(2560, result);
    }

    @Test
    public void divide_1() throws Exception {
        final int a = -10;
        final int b = 0;

        final int result = solution.divide(a, b);

        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void divide_2() throws Exception {
        final int a = 234;
        final int b = 9;

        final int result = solution.divide(a, b);

        assertEquals(26, result);
    }

    @Test
    public void divide_3() throws Exception {
        final int a = -234;
        final int b = 9;

        final int result = solution.divide(a, b);

        assertEquals(-26, result);
    }

    @Test
    public void divide_4() throws Exception {
        final int a = -234;
        final int b = -9;

        final int result = solution.divide(a, b);

        assertEquals(26, result);
    }
}