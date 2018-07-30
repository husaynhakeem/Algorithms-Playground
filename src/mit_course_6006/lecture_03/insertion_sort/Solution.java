package mit_course_6006.lecture_03.insertion_sort;

public class Solution {

    void sort(int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int first = i - 1;
            int second = i;
            while (first >= 0) {
                if (array[first] > array[second]) {
                    int temp = array[first];
                    array[first] = array[second];
                    array[second] = temp;
                    first--;
                    second--;
                } else {
                    break;
                }
            }
        }
    }
}
