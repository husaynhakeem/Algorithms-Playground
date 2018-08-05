package leetcode.problem_0232;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void myQueue_1() throws Exception {
        Solution.MyQueue queue = new Solution.MyQueue();
        assertTrue(queue.empty());

        queue.push(2);
        assertFalse(queue.empty());

        final int n1 = queue.peek();
        assertFalse(queue.empty());
        assertEquals(2, n1);

        final int n2 = queue.pop();
        assertTrue(queue.empty());
        assertEquals(2, n2);
    }

    @Test
    public void myQueue_2() throws Exception {
        Solution.MyQueue queue = new Solution.MyQueue();
        assertTrue(queue.empty());

        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
    }
}