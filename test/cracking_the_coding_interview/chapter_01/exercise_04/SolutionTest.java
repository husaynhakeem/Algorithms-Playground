package cracking_the_coding_interview.chapter_01.exercise_04;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isPermutationOfPalindrome_1() throws Exception {
        final String input = "Tact Coa";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_2() throws Exception {
        final String input = "Taco cat";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_3() throws Exception {
        final String input = "Atco cta";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_4() throws Exception {
        final String input = "Atco ctt";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertFalse(result);
    }
}