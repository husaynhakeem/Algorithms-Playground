package leetcode.problem_0855;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void examRoom_1() throws Exception {
        final Solution.ExamRoom examRoom = new Solution.ExamRoom(10);
        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());
        examRoom.leave(4);
        assertEquals(5, examRoom.seat());
    }

    @Test
    public void examRoom_2() throws Exception {
        final Solution.ExamRoom examRoom = new Solution.ExamRoom(8);
        assertEquals(0, examRoom.seat());
        assertEquals(7, examRoom.seat());
        assertEquals(3, examRoom.seat());
        examRoom.leave(0);
        examRoom.leave(7);
        assertEquals(7, examRoom.seat());
        assertEquals(0, examRoom.seat());
        assertEquals(5, examRoom.seat());
        assertEquals(1, examRoom.seat());
        assertEquals(2, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(6, examRoom.seat());
    }

}