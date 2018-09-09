package cracking_the_coding_interview.chapter_03.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    @Test
    public void testAnimalShelter() throws Exception {
        final Solution solution = new Solution();
        solution.enqueue(new Solution.Cat("Tony"));
        solution.enqueue(new Solution.Cat("Moucha"));
        solution.enqueue(new Solution.Dog("Doge"));
        solution.enqueue(new Solution.Cat("Stray cat"));
        solution.enqueue(new Solution.Dog("Stray dog"));

        assertEquals("Tony", solution.dequeueAny().name);
        assertEquals("Moucha", solution.dequeueCat().name);
        assertEquals("Doge", solution.dequeueAny().name);
        assertEquals("Stray dog", solution.dequeueDog().name);
        assertNull(solution.dequeueDog());
        assertEquals("Stray cat", solution.dequeueAny().name);
        assertNull(solution.dequeueAny());
    }
}