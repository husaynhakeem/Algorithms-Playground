package cracking_the_coding_interview.chapter_10.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void groupAnagrams() throws Exception {
        final String[] array = {"care", "school", "univinu", "madam", "race", "soolhc", "acre"};

        solution.groupAnagrams(array);

        assertEquals(7, array.length);
        assertEquals("madam", array[0]);
        assertEquals("school", array[1]);
        assertEquals("soolhc", array[2]);
        assertEquals("care", array[3]);
        assertEquals("race", array[4]);
        assertEquals("acre", array[5]);
        assertEquals("univinu", array[6]);
    }
}