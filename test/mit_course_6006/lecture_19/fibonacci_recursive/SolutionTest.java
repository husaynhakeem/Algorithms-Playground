package mit_course_6006.lecture_19.fibonacci_recursive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void fib_1() throws Exception {
        final int n = 1;

        final int result = solution.fib(n);

        assertEquals(1, result);
    }

    @Test
    public void fib_2() throws Exception {
        final int n = 2;

        final int result = solution.fib(n);

        assertEquals(1, result);
    }

    @Test
    public void fib_3() throws Exception {
        final int n = 10;

        final int result = solution.fib(n);

        assertEquals(55, result);
    }

    @Test
    public void fib_4() throws Exception {
        final int n = 30;

        final int result = solution.fib(n);

        assertEquals(832040, result);
    }
}