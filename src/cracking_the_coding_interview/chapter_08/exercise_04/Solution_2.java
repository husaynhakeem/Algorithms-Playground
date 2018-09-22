package cracking_the_coding_interview.chapter_08.exercise_04;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Solution_2 {

    List<List<Integer>> powerSet(@NotNull final List<Integer> list) {
        final List<List<Integer>> result = new ArrayList<>();
        powerSet(list, list.size() - 1, result);
        return result;
    }

    private void powerSet(final List<Integer> list, final int index, final List<List<Integer>> result) {
        if (index == -1) {
            result.add(new ArrayList<>());
            return;
        }
        powerSet(list, index - 1, result);

        List<List<Integer>> tempSubList = new ArrayList<>();
        for (List<Integer> subList : result) {
            final List<Integer> temp = new ArrayList<>();
            temp.addAll(subList);
            temp.add(list.get(index));
            tempSubList.add(temp);
        }
        result.addAll(tempSubList);
    }
}
