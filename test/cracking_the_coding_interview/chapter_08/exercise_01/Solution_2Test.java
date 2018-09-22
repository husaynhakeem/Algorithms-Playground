package cracking_the_coding_interview.chapter_08.exercise_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void tripleStep_1() throws Exception {
        final int n = 1;

        final int result = solution.tripleStep(n);

        assertEquals(1, result);
    }

    @Test
    public void tripleStep_2() throws Exception {
        final int n = 3;

        final int result = solution.tripleStep(n);

        assertEquals(4, result);
    }

    @Test
    public void tripleStep_3() throws Exception {
        final int n = 5;

        final int result = solution.tripleStep(n);

        assertEquals(13, result);
    }

    @Test
    public void tripleStep_4() throws Exception {
        final int n = 10;

        final int result = solution.tripleStep(n);

        assertEquals(274, result);
    }

    @Test
    public void tripleStep_5() throws Exception {
        final int n = 20;

        final int result = solution.tripleStep(n);

        assertEquals(121415, result);
    }

    @Test
    public void tripleStep_6() throws Exception {
        final int n = 35;

        final int result = solution.tripleStep(n);

        assertEquals(1132436852, result);
    }
}