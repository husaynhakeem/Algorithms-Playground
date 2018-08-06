package mit_course_6006.lecture_13.breadth_first_search;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.Hashtable;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void bfs() throws Exception {
        final Solution.Vertex s = new Solution.Vertex("s");
        final Solution.Vertex a = new Solution.Vertex("a");
        final Solution.Vertex x = new Solution.Vertex("x");
        final Solution.Vertex z = new Solution.Vertex("z");
        final Solution.Vertex d = new Solution.Vertex("d");
        final Solution.Vertex c = new Solution.Vertex("c");
        final Solution.Vertex f = new Solution.Vertex("f");
        final Solution.Vertex v = new Solution.Vertex("v");

        s.adjacents = ListUtils.createList(a, x);
        a.adjacents = ListUtils.createList(s, z);
        x.adjacents = ListUtils.createList(s, d, c);
        z.adjacents = ListUtils.createList(a);
        d.adjacents = ListUtils.createList(x, f, c);
        c.adjacents = ListUtils.createList(x, d, f, v);
        f.adjacents = ListUtils.createList(d, c, v);
        v.adjacents = ListUtils.createList(c, f);

        final Hashtable<Solution.Vertex, List<Solution.Vertex>> adjacents = new Hashtable<>();
        adjacents.put(s, s.adjacents);
        adjacents.put(a, a.adjacents);
        adjacents.put(x, x.adjacents);
        adjacents.put(z, z.adjacents);
        adjacents.put(d, d.adjacents);
        adjacents.put(c, c.adjacents);
        adjacents.put(f, f.adjacents);
        adjacents.put(v, v.adjacents);

        final Hashtable<Solution.Vertex, Integer> levels = new Hashtable<>();
        final Hashtable<Solution.Vertex, Solution.Vertex> parents = new Hashtable<>();

        solution.bfs(s, adjacents, levels, parents);

        assertFalse(levels.isEmpty());
        assertEquals(0, (int) levels.get(s));
        assertEquals(1, (int) levels.get(a));
        assertEquals(1, (int) levels.get(x));
        assertEquals(2, (int) levels.get(z));
        assertEquals(2, (int) levels.get(d));
        assertEquals(2, (int) levels.get(c));
        assertEquals(3, (int) levels.get(f));
        assertEquals(3, (int) levels.get(v));

        assertFalse(parents.isEmpty());
        assertTrue(parents.get(s).getClass() == Solution.NullVertex.class);
        assertEquals(s, parents.get(a));
        assertEquals(s, parents.get(x));
        assertEquals(a, parents.get(z));
        assertEquals(x, parents.get(d));
        assertEquals(x, parents.get(c));
        assertEquals(d, parents.get(f));
        assertEquals(c, parents.get(v));
    }
}