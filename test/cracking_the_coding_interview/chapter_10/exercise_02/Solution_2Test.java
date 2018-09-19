package cracking_the_coding_interview.chapter_10.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void groupAnagrams() throws Exception {
        final String[] array = {"care", "school", "univinu", "madam", "race", "soolhc", "acre"};

        solution.groupAnagrams(array);

        assertEquals(7, array.length);
        assertEquals("madam", array[0]);
        assertEquals("care", array[1]);
        assertEquals("race", array[2]);
        assertEquals("acre", array[3]);
        assertEquals("school", array[4]);
        assertEquals("soolhc", array[5]);
        assertEquals("univinu", array[6]);
    }
}