package cracking_the_coding_interview.chapter_04.exercise_07;

import Utilities.java.ListUtils;
import kotlin.Pair;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void buildOrder_1() throws Exception {
        final List<Character> projects = ListUtils.createList('a', 'b', 'c', 'd', 'e', 'f');
        final List<Pair<Character, Character>> dependencies = ListUtils.createList(
                new Pair<>('a', 'd'),
                new Pair<>('f', 'b'),
                new Pair<>('b', 'd'),
                new Pair<>('f', 'a'),
                new Pair<>('d', 'c'));

        final List<Character> result = solution.buildOrder(projects, dependencies);

        assertEquals(6, result.size());
        assertEquals('e', (char) result.get(0));
        assertEquals('f', (char) result.get(1));
        assertEquals('a', (char) result.get(2));
        assertEquals('b', (char) result.get(3));
        assertEquals('d', (char) result.get(4));
        assertEquals('c', (char) result.get(5));
    }
}