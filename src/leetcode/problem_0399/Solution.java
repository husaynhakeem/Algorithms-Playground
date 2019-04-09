package leetcode.problem_0399;

import java.util.*;

public class Solution {

    double[] calcEquation(final String[][] equations, final double[] values, final String[][] queries) {
        final Map<String, List<Pair>> map = buildMap(equations, values);
        final double[] results = new double[queries.length];
        for (int i = 0; i < queries.length; i++) {
            final Double result = calculate(queries[i][0], queries[i][1], map, new HashSet<>());
            results[i] = result == null ? -1 : result;
        }
        return results;
    }

    private Map<String, List<Pair>> buildMap(final String[][] equations, final double[] values) {
        final Map<String, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < equations.length; i++) {
            final List<Pair> list = map.getOrDefault(equations[i][0], new ArrayList<>());
            list.add(new Pair(equations[i][1], values[i]));
            map.put(equations[i][0], list);

            final List<Pair> other = map.getOrDefault(equations[i][1], new ArrayList<>());
            other.add(new Pair(equations[i][0], invert(values[i])));
            map.put(equations[i][1], other);
        }
        return map;
    }

    private double invert(final double n) {
        return n == 0 ? 0 : 1 / n;
    }

    private Double calculate(final String start, final String end, final Map<String, List<Pair>> map, final Set<String> seen) {
        if (seen.contains(start) || !map.keySet().contains(start) || !map.keySet().contains(end)) {
            return null;
        }
        if (start.equals(end)) {
            return 1.0;
        }

        Double result = null;
        seen.add(start);
        for (final Pair pair : map.get(start)) {
            final Double temp = calculate(pair.destination, end, map, seen);
            if (temp != null) {
                result = pair.weight * temp;
                break;
            }
        }
        seen.remove(start);
        return result;
    }

    class Pair {
        final String destination;
        final double weight;

        Pair(final String destination, final double weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
}
