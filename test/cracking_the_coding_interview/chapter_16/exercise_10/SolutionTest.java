package cracking_the_coding_interview.chapter_16.exercise_10;

import cracking_the_coding_interview.chapter_16.exercise_10.Solution.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void livingPeople_1() throws Exception {
        final Person[] people = {};

        final int result = solution.livingPeople(people);

        assertEquals(-1, result);
    }

    @Test
    public void livingPeople_2() throws Exception {
        final Person[] people = {
                new Person(1908, 1909)
        };

        final int result = solution.livingPeople(people);

        assertEquals(1908, result);
    }

    @Test
    public void livingPeople_3() throws Exception {
        final Person[] people = {
                new Person(1908, 1909),
                new Person(1908, 1990),
                new Person(1928, 1989),
                new Person(1938, 1979),
                new Person(1928, 1969),
                new Person(1910, 1959),
                new Person(1907, 1949),
                new Person(1908, 1939),
                new Person(1918, 1929),
        };

        final int result = solution.livingPeople(people);

        assertEquals(1928, result);
    }
}