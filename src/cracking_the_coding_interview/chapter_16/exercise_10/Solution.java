package cracking_the_coding_interview.chapter_16.exercise_10;

import org.jetbrains.annotations.NotNull;

class Solution {

    static final int BEGIN_YEAR = 1900;
    static final int END_YEAR = 2000;

    static class Person {
        int birth;
        int death;

        Person(int birth, int death) {
            this.birth = birth;
            this.death = death;
        }
    }

    int livingPeople(@NotNull final Person[] people) {
        if (people.length == 0) {
            return -1;
        }

        final int[] years = new int[END_YEAR - BEGIN_YEAR + 1];

        for (Person p : people) {
            add(years, p.birth - BEGIN_YEAR, p.death - BEGIN_YEAR);
        }

        int maxIndex = 0;
        for (int i = 1; i < years.length; i++) {
            if (years[maxIndex] < years[i]) {
                maxIndex = i;
            }
        }

        return maxIndex + BEGIN_YEAR;
    }

    private void add(final int[] array, final int from, final int to) {
        for (int i = from; i <= to; i++) {
            array[i]++;
        }
    }
}
