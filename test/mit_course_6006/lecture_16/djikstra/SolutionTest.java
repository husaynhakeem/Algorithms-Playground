package mit_course_6006.lecture_16.djikstra;

import Utilities.java.ListUtils;
import javafx.util.Pair;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void djikstra() throws Exception {
        final Solution.Vertex a = new Solution.Vertex();
        final Solution.Vertex b = new Solution.Vertex();
        final Solution.Vertex c = new Solution.Vertex();
        final Solution.Vertex d = new Solution.Vertex();
        final Solution.Vertex e = new Solution.Vertex();

        a.adjacents = ListUtils.createList(b, c);
        b.adjacents = ListUtils.createList(c, d);
        c.adjacents = ListUtils.createList(b, d, e);
        d.adjacents = ListUtils.createList(e);
        e.adjacents = ListUtils.createList(d);

        final List<Solution.Vertex> vertices = ListUtils.createList(a, b, c, d, e);

        final Map<Pair<Solution.Vertex, Solution.Vertex>, Integer> weights = new HashMap<>();
        weights.put(new Pair<>(a, b), 10);
        weights.put(new Pair<>(a, c), 3);
        weights.put(new Pair<>(b, c), 1);
        weights.put(new Pair<>(b, d), 2);
        weights.put(new Pair<>(c, b), 4);
        weights.put(new Pair<>(c, d), 8);
        weights.put(new Pair<>(c, e), 2);
        weights.put(new Pair<>(d, e), 7);
        weights.put(new Pair<>(e, d), 9);

        final List<Solution.Vertex> result = solution.djikstra(vertices, weights, a);

        assertEquals(5, result.size());

        assertEquals(a, result.get(0));
        assertEquals(0, a.data);

        assertEquals(c, result.get(1));
        assertEquals(3, c.data);

        assertEquals(e, result.get(2));
        assertEquals(5, e.data);

        assertEquals(b, result.get(3));
        assertEquals(7, b.data);

        assertEquals(d, result.get(4));
        assertEquals(9, d.data);
    }
}