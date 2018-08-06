package mit_course_6006.lecture_13.breadth_first_search;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Solution {

    static class Vertex {
        String data;
        List<Vertex> adjacents;

        Vertex(String data) {
            this.data = data;
        }
    }

    static class NullVertex extends Vertex {

        NullVertex() {
            super("");
        }
    }

    void bfs(final Vertex v,
             final Hashtable<Vertex, List<Vertex>> adjacents,
             final Hashtable<Vertex, Integer> levels,
             final Hashtable<Vertex, Vertex> parents) {
        List<Vertex> frontier = new ArrayList<>();

        levels.put(v, 0);
        parents.put(v, new NullVertex());
        frontier.add(v);

        int i = 1;

        while (!frontier.isEmpty()) {
            final List<Vertex> next = new ArrayList<>();

            for (Vertex f : frontier) {
                for (Vertex a : adjacents.get(f)) {
                    if (!levels.containsKey(a)) {
                        levels.put(a, i);
                        parents.put(a, f);
                        next.add(a);
                    }
                }
            }

            frontier = next;
            i++;
        }
    }
}
