package mit_course_6006.lecture_16.djikstra;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {

    // Assure infinity is represented by Integer.MIN_VALUE
    static final int INFINITY = Integer.MAX_VALUE;

    static class Vertex {
        int data;
        List<Vertex> adjacents;

        Vertex() {
        }
    }

    List<Vertex> djikstra(final List<Vertex> vertices, final Map<Pair<Vertex, Vertex>, Integer> weights, final Vertex startingVertex) {
        final List<Vertex> result = new ArrayList<>();
        final List<Vertex> verticesToProcess = new ArrayList<>();

        for (Vertex v : vertices) {
            v.data = v == startingVertex ? 0 : INFINITY;
            verticesToProcess.add(v);
        }

        while (!verticesToProcess.isEmpty()) {
            final Vertex min = extractMin(verticesToProcess);
            if (!result.contains(min)) {
                result.add(min);
            }

            for (Vertex v : min.adjacents) {
                relax(min, v, weights);
            }
        }

        return result;
    }

    private Vertex extractMin(final List<Vertex> vertices) {
        int minIndex = 0;
        for (int i = 1; i < vertices.size(); i++) {
            if (vertices.get(i).data != INFINITY && vertices.get(i).data < vertices.get(minIndex).data) {
                minIndex = i;
            }
        }
        final Vertex min = vertices.get(minIndex);
        vertices.remove(minIndex);
        return min;
    }

    private void relax(final Vertex u, final Vertex v, final Map<Pair<Vertex, Vertex>, Integer> weights) {
        final int du = u.data;
        final int dv = v.data;
        final int weightUV = weights.get(new Pair<>(u, v));

        if (dv > du + weightUV) {
            v.data = du + weightUV;
        }
    }
}
