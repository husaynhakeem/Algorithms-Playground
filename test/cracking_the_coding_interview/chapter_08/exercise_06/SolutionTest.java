package cracking_the_coding_interview.chapter_08.exercise_06;

import Utilities.java.ListUtils;
import cracking_the_coding_interview.chapter_08.exercise_06.Solution.Tower;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void towersOfHanoi() throws Exception {
        final Tower origin = new Tower();
        final Tower destination = new Tower();
        final Tower buffer = new Tower();
        final List<Integer> list = ListUtils.createList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        origin.populate(list);

        solution.towersOfHanoi(origin, destination, buffer, list.size());

        assertTrue(origin.disks.isEmpty());
        assertTrue(buffer.disks.isEmpty());
        assertEquals(list.size(), destination.disks.size());
        assertEquals(1, (int) destination.disks.pop());
        assertEquals(2, (int) destination.disks.pop());
        assertEquals(3, (int) destination.disks.pop());
        assertEquals(4, (int) destination.disks.pop());
        assertEquals(5, (int) destination.disks.pop());
        assertEquals(6, (int) destination.disks.pop());
        assertEquals(7, (int) destination.disks.pop());
        assertEquals(8, (int) destination.disks.pop());
        assertEquals(9, (int) destination.disks.pop());
        assertEquals(10, (int) destination.disks.pop());
    }
}