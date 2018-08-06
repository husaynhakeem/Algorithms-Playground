package Utilities.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {

    public static <T> void printList(List<T> list) {
        if (list == null)
            return;

        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0)
                sb.append(", ");
            sb.append(list.get(i));
        }
        sb.append("}");

        System.out.println(sb.toString());
    }

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
        final List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(objects));
        return list;
    }

    public static <T> boolean areEqual(List<T> list1, List<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
