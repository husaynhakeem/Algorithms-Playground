package cracking_the_coding_interview.chapter_03.exercise_03;

import org.junit.Test;
import cracking_the_coding_interview.chapter_03.exercise_03.Solution_2FollowUp.SetOfStacks;

import static org.junit.Assert.*;

public class Solution_2FollowUpTest {

    @Test
    public void setOfStacks_1() {
        final int maxCapacity = 10;
        final SetOfStacks setOfStacks = new SetOfStacks(maxCapacity);

        assertTrue(setOfStacks.isEmpty());

        for (int i = 0; i < maxCapacity; i++) {
            setOfStacks.push(i);
        }
        assertEquals(1, setOfStacks.stacks.size());

        setOfStacks.push(10);
        assertEquals(2, setOfStacks.stacks.size());

        final int pop = setOfStacks.pop();
        assertEquals(10, pop);
        assertEquals(1, setOfStacks.stacks.size());

        for (int i = 0; i < 3 * maxCapacity; i++) {
            setOfStacks.push(i);
        }
        assertEquals(4, setOfStacks.stacks.size());
    }

    @Test
    public void setOfStacks_2() {
        final int maxCapacity = 10;
        final SetOfStacks setOfStacks = new SetOfStacks(maxCapacity);

        for (int i = 0; i < 5 * maxCapacity; i++) {
            setOfStacks.push(i);
        }

        setOfStacks.popAt(1);
        setOfStacks.popAt(1);
        setOfStacks.popAt(1);
        setOfStacks.popAt(1);
        setOfStacks.popAt(1);
        assertEquals(10, setOfStacks.stacks.get(1).size());
        assertEquals(10, setOfStacks.stacks.get(2).size());
        assertEquals(10, setOfStacks.stacks.get(3).size());
        assertEquals(5, setOfStacks.stacks.get(4).size());

        setOfStacks.popAt(2);
        assertEquals(10, setOfStacks.stacks.get(2).size());
        assertEquals(10, setOfStacks.stacks.get(3).size());
        assertEquals(4, setOfStacks.stacks.get(4).size());

        for (int i = 0; i < maxCapacity; i++) {
            setOfStacks.popAt(3);
        }
        assertEquals(4, setOfStacks.stacks.size());
    }
}