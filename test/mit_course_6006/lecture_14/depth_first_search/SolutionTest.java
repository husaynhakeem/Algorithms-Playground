package mit_course_6006.lecture_14.depth_first_search;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void dfs() throws Exception {
        final Solution.Vertex a = new Solution.Vertex("a");
        final Solution.Vertex b = new Solution.Vertex("b");
        final Solution.Vertex c = new Solution.Vertex("c");
        final Solution.Vertex d = new Solution.Vertex("d");
        final Solution.Vertex e = new Solution.Vertex("e");
        final Solution.Vertex f = new Solution.Vertex("f");

        a.adjacents = ListUtils.createList(b, d);
        b.adjacents = ListUtils.createList(e);
        c.adjacents = ListUtils.createList(e, f);
        d.adjacents = ListUtils.createList(b);
        e.adjacents = ListUtils.createList(d);
        f.adjacents = ListUtils.createList(f);

        final Hashtable<Solution.Vertex, Solution.Vertex> parents = new Hashtable<>();

        solution.dfs(ListUtils.createList(a, b, c, d, e, f), parents);

        assertFalse(parents.isEmpty());
        assertEquals(Solution.NullVertex.class, parents.get(a).getClass());
        assertEquals(a, parents.get(b));
        assertEquals(Solution.NullVertex.class, parents.get(c).getClass());
        assertEquals(e, parents.get(d));
        assertEquals(b, parents.get(e));
        assertEquals(c, parents.get(f));
    }
}