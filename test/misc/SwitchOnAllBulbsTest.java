package misc;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SwitchOnAllBulbsTest {

    private final SwitchOnAllBulbs solution = new SwitchOnAllBulbs();

    @Test
    public void bulbs_1() throws Exception {
        final List<Integer> input = ListUtils.createList(0, 1, 0, 1);

        final int result = solution.bulbs(input);

        assertEquals(4, result);
    }

    @Test
    public void bulbs_2() throws Exception {
        final List<Integer> input = ListUtils.createList(0, 1, 0, 1, 1, 1, 1);

        final int result = solution.bulbs(input);

        assertEquals(4, result);
    }
}