package leetcode.problem_0050;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    private final double x;
    private final int n;
    private final double power;

    public SolutionTest(double x, int n, double power) {
        this.x = x;
        this.n = n;
        this.power = power;
    }

    @Parameterized.Parameters(name = "pow({0}, {1})")
    public static Collection<Object[]> arguments() {
        return Arrays.asList(new Object[][]{
                {2.0, 10, 1024.0},
                {2.1, 3, 9.261},
                {2.0, -2, 0.25},
                {-1.0, -2147483648, 1.0},
                {1.0, 2147483647, 1.0},
                {0.0, 2147483647, 0.0},
        });
    }

    @Test
    public void computePower() {
        final Solution solution = new Solution();
        final double result = solution.myPow(x, n);
        assertEquals(power, result, 0.01);
    }
}