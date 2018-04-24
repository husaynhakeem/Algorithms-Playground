package cracking_the_coding_interview.chapter8_exercise4.java;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    public static void main(String[] args) {
        List<Integer> zeroElements = new ArrayList<>();
        System.out.println(getAllSubsets(zeroElements));

        List<Integer> oneElement = new ArrayList<>();
        oneElement.add(1);
        System.out.println(getAllSubsets(oneElement));

        List<Integer> twoElements = new ArrayList<>();
        twoElements.add(1);
        twoElements.add(2);
        System.out.println(getAllSubsets(twoElements));

        List<Integer> threeElements = new ArrayList<>();
        threeElements.add(1);
        threeElements.add(2);
        threeElements.add(3);
        System.out.println(getAllSubsets(threeElements));

        List<Integer> fourElements = new ArrayList<>();
        fourElements.add(1);
        fourElements.add(2);
        fourElements.add(3);
        fourElements.add(4);
        System.out.println(getAllSubsets(fourElements));

        List<Integer> fiveElements = new ArrayList<>();
        fiveElements.add(1);
        fiveElements.add(2);
        fiveElements.add(3);
        fiveElements.add(4);
        fiveElements.add(5);
        System.out.println(getAllSubsets(fiveElements));
    }

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
