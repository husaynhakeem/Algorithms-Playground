package leetcode.problem_0346;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void movingAverage() throws Exception {
        final Solution.MovingAverage movingAverage = new Solution.MovingAverage(3);

        final double delta = 0;
        assertEquals((double) 1, movingAverage.next(1), delta);
        assertEquals(((double) 11) / 2, movingAverage.next(10), delta);
        assertEquals(((double) 14) / 3, movingAverage.next(3), delta);
        assertEquals(((double) 18) / 3, movingAverage.next(5), delta);
    }
}