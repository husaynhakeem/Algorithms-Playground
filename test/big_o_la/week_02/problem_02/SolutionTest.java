package big_o_la.week_02.problem_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void editDistance_1() throws Exception {
        final String a = "FLOMAX";
        final String b = "VOLMAX";

        final int result = solution.editDistance(a, b);

        assertEquals(3, result);
    }

    @Test
    public void editDistance_2() throws Exception {
        final String a = "GILY";
        final String b = "GEELY";

        final int result = solution.editDistance(a, b);

        assertEquals(2, result);
    }

    @Test
    public void editDistance_3() throws Exception {
        final String a = "HONDA";
        final String b = "HYUNDAI";

        final int result = solution.editDistance(a, b);

        assertEquals(3, result);
    }
}