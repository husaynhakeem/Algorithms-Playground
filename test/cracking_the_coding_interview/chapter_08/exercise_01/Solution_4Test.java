package cracking_the_coding_interview.chapter_08.exercise_01;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Solution_4Test {

    private final Solution_4 solution = new Solution_4();

    @Test
    public void tripleStep_1() throws Exception {
        final int n = 1;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(BigInteger.ONE, result);
    }

    @Test
    public void tripleStep_2() throws Exception {
        final int n = 20;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(new BigInteger("121415"), result);
    }

    @Test
    public void tripleStep_3() throws Exception {
        final int n = 40;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(new BigInteger("23837527729"), result);
    }

    @Test
    public void tripleStep_4() throws Exception {
        final int n = 100;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(new BigInteger("180396380815100901214157639"), result);
    }

    @Test
    public void tripleStep_5() throws Exception {
        final int n = 200;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(new BigInteger("52622583840983769603765180599790256716084480555530641"), result);
    }

    @Test
    public void tripleStep_6() throws Exception {
        final int n = 300;

        final BigInteger result = solution.tripleStep(n);

        assertEquals(new BigInteger("15350287614359738671843506567023635268924281173051801861566524609184461020990367"), result);
    }
}