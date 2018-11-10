package misc;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeSumTest {

    private final PrimeSum solution = new PrimeSum();

    @Test
    public void primeSum_1() throws Exception {
        final int n = 4;

        final List<Integer> result = solution.primeSum(n);

        assertEquals(2, (int) result.get(0));
        assertEquals(2, (int) result.get(1));
    }

    @Test
    public void primeSum_2() throws Exception {
        final int n = 120;

        final List<Integer> result = solution.primeSum(n);

        assertEquals(7, (int) result.get(0));
        assertEquals(113, (int) result.get(1));
    }
}