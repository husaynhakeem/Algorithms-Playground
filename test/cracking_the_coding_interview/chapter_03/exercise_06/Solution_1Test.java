package cracking_the_coding_interview.chapter_03.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_1Test {

    @Test
    public void testAnimalShelter() throws Exception {
        final Solution_1 solution = new Solution_1();
        solution.enqueue(new Solution_1.Cat("Tony"));
        solution.enqueue(new Solution_1.Cat("Moucha"));
        solution.enqueue(new Solution_1.Dog("Doge"));
        solution.enqueue(new Solution_1.Cat("Stray cat"));
        solution.enqueue(new Solution_1.Dog("Stray dog"));

        assertEquals("Tony", solution.dequeueAny().name);
        assertEquals("Moucha", solution.dequeueCat().name);
        assertEquals("Doge", solution.dequeueAny().name);
        assertEquals("Stray dog", solution.dequeueDog().name);
        assertNull(solution.dequeueDog());
        assertEquals("Stray cat", solution.dequeueAny().name);
        assertNull(solution.dequeueAny());
    }
}