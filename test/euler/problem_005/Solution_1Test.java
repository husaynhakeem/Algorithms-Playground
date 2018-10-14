package euler.problem_005;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void extractPrimeNumbersFromRange() throws Exception {
        final int min = 1;
        final int max = 10;

        final int[] result = solution.extractPrimeNumbersFromRange(min, max);

        final int[] expectedResult = {2, 3, 5, 7};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, result));
    }
}