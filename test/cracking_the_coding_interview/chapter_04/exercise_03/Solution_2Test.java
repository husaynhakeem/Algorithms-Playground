package cracking_the_coding_interview.chapter_04.exercise_03;

import Utilities.java.TreeUtils;
import org.junit.Test;

import java.util.List;

import static Utilities.java.ListUtils.createList;
import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void listOfDepths() {
        final TreeUtils.Node node1 = new TreeUtils.Node(1);
        TreeUtils.Node node2 = new TreeUtils.Node(2);
        node1.left = node2;
        TreeUtils.Node node3 = new TreeUtils.Node(3);
        node1.right = node3;
        TreeUtils.Node node4 = new TreeUtils.Node(4);
        node1.left.left = node4;
        TreeUtils.Node node5 = new TreeUtils.Node(5);
        node1.left.right = node5;
        TreeUtils.Node node6 = new TreeUtils.Node(6);
        node1.right.left = node6;
        TreeUtils.Node node7 = new TreeUtils.Node(7);
        node1.right.right = node7;

        final List<List<TreeUtils.Node>> result = solution.listOfDepths(node1);

        assertEquals(createList(node1), result.get(0));
        assertEquals(createList(node2, node3), result.get(1));
        assertEquals(createList(node4, node5, node6, node7), result.get(2));
    }
}