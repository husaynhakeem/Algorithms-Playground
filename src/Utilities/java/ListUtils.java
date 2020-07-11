package Utilities.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {

    public static int[] integerListToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        int index = 0;
        for (Integer i : list) {
            array[index++] = i;
        }
        return array;
    }

    @SafeVarargs
    public static <T> List<T> createList(T... objects) {
        return new ArrayList<>(Arrays.asList(objects));
    }
}
