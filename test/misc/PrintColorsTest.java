package misc;

import org.junit.Test;

public class PrintColorsTest {

    private final PrintColors printColors = new PrintColors();

    @Test
    public void print_1() throws Exception {
        final int n = 1;

        printColors.print(n);
    }

    @Test
    public void print_2() throws Exception {
        final int n = 2;

        printColors.print(n);
    }

    @Test
    public void print_3() throws Exception {
        final int n = 3;

        printColors.print(n);
    }

    @Test
    public void print_4() throws Exception {
        final int n = 4;

        printColors.print(n);
    }

    @Test
    public void print_5() throws Exception {
        final int n = 5;

        printColors.print(n);
    }
}