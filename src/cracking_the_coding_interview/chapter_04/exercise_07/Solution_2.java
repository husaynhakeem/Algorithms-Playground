package cracking_the_coding_interview.chapter_04.exercise_07;

import kotlin.Pair;

import java.util.*;

class Solution_2 {

    static class Graph {
        Set<Project> projects = new HashSet<>();
        private Map<Character, Project> map = new HashMap<>();

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
        List<Project> dependants = new ArrayList<>();

        public Project(final Character value) {
            this.value = value;
        }
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
            if (!result.contains(project.value)) {
                buildOrder(project, result);
            }
        }

        Collections.reverse(result);
        return result;
    }

    private void buildOrder(final Project project, final List<Character> result) {
        for (Project dependant : project.dependants) {
            if (!result.contains(dependant.value)) {
                buildOrder(dependant, result);
            }
        }
        result.add(project.value);
    }
}
