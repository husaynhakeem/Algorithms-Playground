package cracking_the_coding_interview.chapter_03.exercise_06;

import cracking_the_coding_interview.chapter_03.exercise_06.Solution_2.Cat;
import cracking_the_coding_interview.chapter_03.exercise_06.Solution_2.Dog;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution_2Test {

    @SuppressWarnings("ConstantConditions")
    @Test
    public void testAnimalShelter() {
        final Solution_2 solution = new Solution_2();
        solution.enqueue(new Cat("Tony", new Date(10)));
        solution.enqueue(new Cat("Moucha", new Date(20)));
        solution.enqueue(new Dog("Doge", new Date(30)));
        solution.enqueue(new Cat("Stray cat", new Date(40)));
        solution.enqueue(new Dog("Stray dog", new Date(50)));

        assertEquals("Tony", solution.dequeueAny().name);
        assertEquals("Moucha", solution.dequeueCat().name);
        assertEquals("Doge", solution.dequeueAny().name);
        assertEquals("Stray dog", solution.dequeueDog().name);
        assertNull(solution.dequeueDog());
        assertEquals("Stray cat", solution.dequeueAny().name);
        assertNull(solution.dequeueAny());
    }
}