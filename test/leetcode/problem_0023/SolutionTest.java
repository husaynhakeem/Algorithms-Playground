package leetcode.problem_0023;

import Utilities.java.LinkedListUtils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void mergeKLists() throws Exception {
        final Node list1 = new Node(1);
        list1.next = new Node(4);
        list1.next.next = new Node(5);

        final Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        final Node list3 = new Node(2);
        list3.next = new Node(6);

        final Node[] lists = {list1, list2, list3};

        final Node result = solution.mergeKLists(lists);

        assertEquals(1, result.data);
        assertEquals(1, result.next.data);
        assertEquals(2, result.next.next.data);
        assertEquals(3, result.next.next.next.data);
        assertEquals(4, result.next.next.next.next.data);
        assertEquals(4, result.next.next.next.next.next.data);
        assertEquals(5, result.next.next.next.next.next.next.data);
        assertEquals(6, result.next.next.next.next.next.next.next.data);
    }
}