package cracking_the_coding_interview.chapter_16.exercise_24;

import kotlin.Pair;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void pairsWithSum_1() throws Exception {
        final int[] array = {1, 3, 7, 3, 5};
        final int k = 6;

        final Set<Pair<Integer, Integer>> result = solution.pairsWithSum(array, k);

        assertEquals(2, result.size());
        assertTrue(result.contains(new Pair<>(1, 5)) || result.contains(new Pair<>(5, 1)));
        assertTrue(result.contains(new Pair<>(3, 3)));
    }

    @Test
    public void pairsWithSum_2() throws Exception {
        final int[] array = {3, 3, 3, 3, 3, 3, 3, 3, 3};
        final int k = 6;

        final Set<Pair<Integer, Integer>> result = solution.pairsWithSum(array, k);

        assertEquals(1, result.size());
        assertTrue(result.contains(new Pair<>(3, 3)));
    }

    @Test
    public void pairsWithSum_3() throws Exception {
        final int[] array = {1, 3, 7, 3, 5};
        final int k = 9;

        final Set<Pair<Integer, Integer>> result = solution.pairsWithSum(array, k);

        assertTrue(result.isEmpty());
    }
}