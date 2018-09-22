package cracking_the_coding_interview.chapter_08.exercise_02;

import cracking_the_coding_interview.chapter_08.exercise_02.Solution_2.Coordinates;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void robotInGrid_1() throws Exception {
        final Coordinates coordinates00 = new Coordinates(0, 0);
        final Coordinates[][] grid = {
                {coordinates00}
        };

        final List<Coordinates> result = solution.robotInGrid(grid);

        assertEquals(1, result.size());
        assertEquals(coordinates00, result.get(0));
    }

    @Test
    public void robotInGrid_2() throws Exception {
        final Coordinates coordinates00 = new Coordinates(0, 0);
        final Coordinates coordinates01 = new Coordinates(0, 1, true);
        final Coordinates coordinates10 = new Coordinates(1, 0);
        final Coordinates coordinates11 = new Coordinates(1, 1);
        final Coordinates[][] grid = {
                {coordinates00, coordinates01},
                {coordinates10, coordinates11}
        };

        final List<Coordinates> result = solution.robotInGrid(grid);

        assertEquals(3, result.size());
        assertEquals(coordinates00, result.get(0));
        assertEquals(coordinates10, result.get(1));
        assertEquals(coordinates11, result.get(2));
    }

    @Test
    public void robotInGrid_3() throws Exception {
        final Coordinates coordinates00 = new Coordinates(0, 0);
        final Coordinates coordinates01 = new Coordinates(0, 1);
        final Coordinates coordinates02 = new Coordinates(0, 2);
        final Coordinates coordinates10 = new Coordinates(1, 0, true);
        final Coordinates coordinates11 = new Coordinates(1, 1);
        final Coordinates coordinates12 = new Coordinates(1, 2, true);
        final Coordinates coordinates20 = new Coordinates(2, 0);
        final Coordinates coordinates21 = new Coordinates(2, 1);
        final Coordinates coordinates22 = new Coordinates(2, 2);
        final Coordinates[][] grid = {
                {coordinates00, coordinates01, coordinates02},
                {coordinates10, coordinates11, coordinates12},
                {coordinates20, coordinates21, coordinates22}
        };

        final List<Coordinates> result = solution.robotInGrid(grid);

        assertEquals(5, result.size());
        assertEquals(coordinates00, result.get(0));
        assertEquals(coordinates01, result.get(1));
        assertEquals(coordinates11, result.get(2));
        assertEquals(coordinates21, result.get(3));
        assertEquals(coordinates22, result.get(4));
    }
}