package cracking_the_coding_interview.chapter_10.exercise_08;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findDuplicates_1() throws Exception {
        final int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        array[1] = 1;
        array[100] = 32;
        array[89] = 45;
        array[34] = 189;
        array[278] = 290;

        solution.findDuplicates(array);
    }

    @Test
    public void findDuplicates_2() throws Exception {
        final int[] array = new int[32_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        solution.findDuplicates(array);
    }
}