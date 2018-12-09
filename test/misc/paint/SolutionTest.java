package misc.paint;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void paint() throws Exception {
        final int painters = 2;
        final int timePerUnit = 5;
        final ArrayList<Integer> boardLengths = (ArrayList<Integer>) ListUtils.createList(1, 10);

        final int result = solution.paint(painters, timePerUnit, boardLengths);

        assertEquals(50, result);
    }
}