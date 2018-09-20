package cracking_the_coding_interview.chapter_10.exercise_04;

import cracking_the_coding_interview.chapter_10.exercise_04.Solution.Listy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void search_1() throws Exception {
        final int x = 16;
        final Listy list = new Listy();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(19);
        list.add(109);
        list.add(245);

        final int result = solution.search(list, x);

        assertEquals(-1, result);
    }

    @Test
    public void search_2() throws Exception {
        final int x = 109;
        final Listy list = new Listy();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(19);
        list.add(109);
        list.add(245);

        final int result = solution.search(list, x);

        assertEquals(5, result);
    }
}