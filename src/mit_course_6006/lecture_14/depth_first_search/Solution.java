package mit_course_6006.lecture_14.depth_first_search;


import java.util.Hashtable;
import java.util.List;

class Solution {


    static class Vertex {
        String data;
        List<Vertex> adjacents;

        Vertex(final String data) {
            this.data = data;
        }
    }

    static class NullVertex extends Vertex {

        NullVertex() {
            super("");
        }
    }

    void dfs(final List<Vertex> universe, final Hashtable<Vertex, Vertex> parents) {
        for (Vertex v : universe) {
            if (!parents.containsKey(v)) {
                parents.put(v, new NullVertex());
                dfsVisit(v, v.adjacents, parents);
            }
        }
    }

    private void dfsVisit(final Vertex vertex, final List<Vertex> adjacents, final Hashtable<Vertex, Vertex> parents) {
        for (Vertex v : adjacents) {
            if (!parents.containsKey(v)) {
                parents.put(v, vertex);
                dfsVisit(v, v.adjacents, parents);
            }
        }
    }

    private Hashtable<Vertex, List<Vertex>> adjecentsMapOf(final List<Vertex> universe) {
        final Hashtable<Vertex, List<Vertex>> adjacents = new Hashtable<>();
        for (Vertex v : universe) {
            adjacents.put(v, v.adjacents);
        }
        return adjacents;
    }
}
