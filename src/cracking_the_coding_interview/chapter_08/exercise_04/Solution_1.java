package cracking_the_coding_interview.chapter_08.exercise_04;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    private static List<List<Integer>> getAllSubsets(List<Integer> set) {

        List<List<Integer>> level = new ArrayList<>();
        level.add(new ArrayList<>());

        for (Integer n : set) {
            level = addToPreviousLevel(n, level);
        }

        return level;
    }

    private static List<List<Integer>> addToPreviousLevel(int n, List<List<Integer>> subsets) {
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
