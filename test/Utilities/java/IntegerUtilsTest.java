package Utilities.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerUtilsTest {

    @Test
    public void firstPrimeBiggerThan_1() throws Exception {
        final int result = IntegerUtils.firstPrimeBiggerThan(-10);

        assertEquals(2, result);
    }

    @Test
    public void firstPrimeBiggerThan_2() throws Exception {
        final int result = IntegerUtils.firstPrimeBiggerThan(2);

        assertEquals(3, result);
    }

    @Test
    public void firstPrimeBiggerThan_3() throws Exception {
        final int result = IntegerUtils.firstPrimeBiggerThan(102);

        assertEquals(103, result);
    }
}