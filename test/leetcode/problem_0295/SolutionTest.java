package leetcode.problem_0295;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void medianFinder() throws Exception {
        final Solution.MedianFinder medianFinder = new Solution.MedianFinder();

        medianFinder.addNum(6);
        assertEquals(6, medianFinder.findMedian(), 0);

        medianFinder.addNum(10);
        assertEquals(8, medianFinder.findMedian(), 0);

        medianFinder.addNum(2);
        assertEquals(6, medianFinder.findMedian(), 0);

        medianFinder.addNum(6);
        assertEquals(6, medianFinder.findMedian(), 0);

        medianFinder.addNum(5);
        assertEquals(6, medianFinder.findMedian(), 0);

        medianFinder.addNum(0);
        assertEquals(5.5, medianFinder.findMedian(), 0);

        medianFinder.addNum(6);
        assertEquals(6, medianFinder.findMedian(), 0);

        medianFinder.addNum(3);
        assertEquals(5.5, medianFinder.findMedian(), 0);

        medianFinder.addNum(1);
        assertEquals(5, medianFinder.findMedian(), 0);

        medianFinder.addNum(0);
        assertEquals(4, medianFinder.findMedian(), 0);

        medianFinder.addNum(0);
        assertEquals(3, medianFinder.findMedian(), 0);
    }

}