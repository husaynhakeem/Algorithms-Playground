package Utilities.java;

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
}
