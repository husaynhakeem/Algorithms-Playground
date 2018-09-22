package cracking_the_coding_interview.chapter_08.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_4Test {

    private final Solution_4 solution = new Solution_4();

    @Test
    public void recursiveMultiply_1() throws Exception {
        final int a = 10;
        final int b = 76;

        final long result = solution.recursiveMultiply(a, b);

        assertEquals(760, result);
    }

    @Test
    public void recursiveMultiply_2() throws Exception {
        final int a = 1_000_978;
        final int b = 1_134_978;

        final long result = solution.recursiveMultiply(a, b);

        assertEquals(1_136_088_008_484L, result);
    }

    @Test
    public void recursiveMultiply_3() throws Exception {
        final int a = 0;
        final int b = 76;

        final long result = solution.recursiveMultiply(a, b);

        assertEquals(0, result);
    }

    @Test
    public void recursiveMultiply_4() throws Exception {
        final int a = 1_000_973;
        final int b = 1_134_978;

        final long result = solution.recursiveMultiply(a, b);

        assertEquals(1_136_082_333_594L, result);
    }
}