package cracking_the_coding_interview.chapter_01.exercise_04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_2Test {

    final Solution_2 solution = new Solution_2();

    @Test
    public void isPermutationOfPalindrome_1() {
        final String input = "Tact Coa";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_2() {
        final String input = "Taco cat";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_3() {
        final String input = "Atco cta";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void isPermutationOfPalindrome_4() {
        final String input = "Atco ctt";

        final boolean result = solution.isPermutationOfPalindrome(input);

        assertFalse(result);
    }
}