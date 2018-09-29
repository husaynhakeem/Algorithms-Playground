package cracking_the_coding_interview.chapter_08.exercise_11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void makeChange_1() throws Exception {
        final int n = 0;

        final int result = solution.makeChange(n);

        assertEquals(0, result);
    }

    @Test
    public void makeChange_2() throws Exception {
        final int n = 1;

        final int result = solution.makeChange(n);

        assertEquals(1, result);
    }

    @Test
    public void makeChange_3() throws Exception {
        final int n = 5;

        final int result = solution.makeChange(n);

        assertEquals(2, result);
    }

    @Test
    public void makeChange_4() throws Exception {
        final int n = 10;

        final int result = solution.makeChange(n);

        assertEquals(4, result);
    }

    @Test
    public void makeChange_5() throws Exception {
        final int n = 100;

        final int result = solution.makeChange(n);

        assertEquals(242, result);
    }
}