package cracking_the_coding_interview.chapter_04.exercise_07;

import kotlin.Pair;

import java.util.*;

class Solution_2 {

    static class Graph {
        Set<Project> projects = new HashSet<>();
        private final Map<Character, Project> map = new HashMap<>();

        void addProject(final Character projectName) {
            final Project project = new Project(projectName);
            projects.add(project);
            map.put(projectName, project);
        }

        void addDependency(final Character start, final Character end) {
            map.get(start).dependants.add(map.get(end));
        }
    }

    static class Project {
        char value;
        State state = State.BLANK;
        List<Project> dependants = new ArrayList<>();

        public Project(final char value) {
            this.value = value;
        }
    }

    private enum State {
        BLANK, PARTIAL, COMPLETE
    }

    private Graph buildGraph(final List<Character> projects, final List<Pair<Character, Character>> dependencies) {
        final Graph graph = new Graph();

        for (Character project : projects) {
            graph.addProject(project);
        }

        for (Pair<Character, Character> dependency : dependencies) {
            graph.addDependency(dependency.getFirst(), dependency.getSecond());
        }

        return graph;
    }

    List<Character> buildOrder(final List<Character> projects, final List<Pair<Character, Character>> dependencies) {
        final List<Character> result = new ArrayList<>();

        final Graph graph = buildGraph(projects, dependencies);
        for (Project project : graph.projects) {
            if (!buildOrder(project, result)) {
                return null;
            }
        }

        Collections.reverse(result);
        return result;
    }

    private boolean buildOrder(final Project project, final List<Character> result) {
        switch (project.state) {
            case COMPLETE:
                return true;
            case PARTIAL:
                return false;
            case BLANK:
            default:
                project.state = State.PARTIAL;
                for (Project dependant : project.dependants) {
                    if (!buildOrder(dependant, result)) {
                        return false;
                    }
                }
                project.state = State.COMPLETE;
                result.add(project.value);
                return true;
        }
    }
}
