package cracking_the_coding_interview.chapter_03.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionFollowUpTest {

    @Test
    public void testSetOfStacks() {
        final SolutionFollowUp<Integer> solution = new SolutionFollowUp<>();

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

    @Test
    public void testPopAtMethod() {
        final SolutionFollowUp<Integer> solution = new SolutionFollowUp<>();

        for (int i = 0; i < 5 * Solution.MAX_CAPACITY; i++) {
            solution.push(i);
        }

        solution.popAt(1);
        solution.popAt(1);
        solution.popAt(1);
        solution.popAt(1);
        solution.popAt(1);
        assertEquals(5, solution.stacks.get(1).size());

        solution.popAt(2);
        assertEquals(9, solution.stacks.get(2).size());

        for (int i = 0; i < SolutionFollowUp.MAX_CAPACITY; i++) {
            solution.popAt(3);
        }
        assertEquals(4, solution.stacks.size());
    }
}