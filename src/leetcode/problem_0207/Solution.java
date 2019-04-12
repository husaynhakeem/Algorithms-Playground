package leetcode.problem_0207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    boolean canFinish(int numCourses, int[][] prerequisites) {
        final Set<Integer> seen = new HashSet<>();
        final Map<Integer, Set<Integer>> map = coursesMap(prerequisites);
        for (int course = 0; course < numCourses; course++) {
            final boolean result = goThroughCoursePrerequisites(course, map, seen);
            if (!result) {
                return false;
            }
        }
        return true;
    }

    private Map<Integer, Set<Integer>> coursesMap(final int[][] prerequisites) {
        final Map<Integer, Set<Integer>> map = new HashMap<>();
        for (final int[] p : prerequisites) {
            final Set<Integer> coursePrerequisites = map.getOrDefault(p[0], new HashSet<>());
            coursePrerequisites.add(p[1]);
            map.put(p[0], coursePrerequisites);
        }
        return map;
    }

    private boolean goThroughCoursePrerequisites(final int course, final Map<Integer, Set<Integer>> map, final Set<Integer> seen) {
        if (seen.contains(course)) {
            return false;
        }
        seen.add(course);

        final Set<Integer> prerequisites = map.get(course);
        if (prerequisites != null) {
            for (final int prerequisite : prerequisites) {
                final boolean result = goThroughCoursePrerequisites(prerequisite, map, seen);
                if (!result) {
                    return false;
                }
            }
        }

        seen.remove(course);
        return true;
    }
}
