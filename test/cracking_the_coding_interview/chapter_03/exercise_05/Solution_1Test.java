package cracking_the_coding_interview.chapter_03.exercise_05;

import org.junit.Test;

import java.util.Stack;

import static Utilities.java.StackUtils.areStacksEqual;
import static Utilities.java.StackUtils.createStackFrom;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sortStack_1() {
        final Stack<Integer> stack = createStackFrom(7, 6, 2, 4, 9, 10, 3);

        final Stack<Integer> result = solution.sortStack(stack);

        final Stack<Integer> expectedResult = createStackFrom(2, 3, 4, 6, 7, 9, 10);
        assertTrue(areStacksEqual(expectedResult, result));
    }

    @Test
    public void sortStack_2() {
        final Stack<Integer> stack = createStackFrom(0, 18, 24, 2, 6);

        final Stack<Integer> result = solution.sortStack(stack);

        final Stack<Integer> expectedResult = createStackFrom(0, 2, 6, 18, 24);
        assertTrue(areStacksEqual(expectedResult, result));
    }

    @Test
    public void sortStack_3() {
        final Stack<Integer> stack = createStackFrom();

        final Stack<Integer> result = solution.sortStack(stack);

        final Stack<Integer> expectedResult = createStackFrom();
        assertTrue(areStacksEqual(expectedResult, result));
    }
}