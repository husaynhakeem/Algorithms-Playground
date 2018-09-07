package cracking_the_coding_interview.chapter_03.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    @Test
    public void testMinStack() {
        final Solution solution = new Solution();

        final Integer min = solution.min();
        assertNull(min);

        solution.push(1);
        final Integer min0 = solution.min();
        assertEquals(1, (int) min0);

        solution.push(2);
        final Integer min1 = solution.min();
        assertEquals(1, (int) min1);

        solution.push(0);
        final Integer min2 = solution.min();
        assertEquals(0, (int) min2);

        solution.pop();
        final Integer min3 = solution.min();
        assertEquals(1, (int) min3);

        solution.pop();
        final Integer min4 = solution.min();
        assertEquals(1, (int) min4);

        solution.pop();
        final Integer min5 = solution.min();
        assertNull(min5);
    }
}