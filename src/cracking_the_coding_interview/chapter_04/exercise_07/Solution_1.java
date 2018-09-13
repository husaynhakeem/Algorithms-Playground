package cracking_the_coding_interview.chapter_04.exercise_07;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution_1 {

    List<Character> buildOrder(@NotNull List<Character> projects, @NotNull List<Pair<Character, Character>> dependencies) {
        final List<Character> builtProjects = new ArrayList<>();

        while (!projects.isEmpty()) {
            final int size = projects.size();

            final Iterator<Character> projectsIterator = projects.iterator();
            while (projectsIterator.hasNext()) {
                final char project = projectsIterator.next();
                boolean shouldBuild = true;
                for (Pair<Character, Character> dependency : dependencies) {
                    if (dependency.getSecond() == project && !builtProjects.contains(dependency.getFirst())) {
                        shouldBuild = false;
                        break;
                    }
                }
                if (shouldBuild) {
                    builtProjects.add(project);
                    projectsIterator.remove();
                }
            }

            if (projects.size() == size) {
                return null;
            }
        }

        return builtProjects;
    }
}
