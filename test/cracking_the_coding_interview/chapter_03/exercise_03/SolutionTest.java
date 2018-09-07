package cracking_the_coding_interview.chapter_03.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void testSetOfStacks() {
        final Solution<Integer> solution = new Solution<>();

        assertTrue(solution.stacks.isEmpty());

        for (int i = 0; i < Solution.MAX_CAPACITY; i++) {
            solution.push(i);
        }

        assertEquals(1, solution.stacks.size());

        solution.push(10);

        assertEquals(2, solution.stacks.size());

        final int pop = solution.pop();
        assertEquals(10, pop);
        assertEquals(1, solution.stacks.size());

        for (int i = 0; i < 3 * Solution.MAX_CAPACITY; i++) {
            solution.push(i);
        }
        assertEquals(4, solution.stacks.size());
    }
}