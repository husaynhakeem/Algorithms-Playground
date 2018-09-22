package cracking_the_coding_interview.chapter_08.exercise_04;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    List<List<Integer>> powerSet(@NotNull final List<Integer> list) {
        List<List<Integer>> level = new ArrayList<>();
        level.add(new ArrayList<>());

        for (Integer n : list) {
            level = addToPreviousLevel(n, level);
        }

        return level;
    }

    private List<List<Integer>> addToPreviousLevel(final int n, final List<List<Integer>> subsets) {
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(subsets);

        for (List<Integer> subset : subsets) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(subset);
            temp.add(n);
            result.add(temp);
        }

        return result;
    }
}
