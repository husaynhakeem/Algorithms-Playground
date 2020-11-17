package cracking_the_coding_interview.chapter_03.exercise_06;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.LinkedList;

public class Solution_2 {

    private final LinkedList<Cat> cats = new LinkedList<>();
    private final LinkedList<Dog> dogs = new LinkedList<>();

    void enqueue(@NotNull final Animal animal) {
        if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else {
            throw new IllegalArgumentException("Shelter only accepts cats and dogs. Cannot take in " + animal);
        }
    }

    @Nullable
    Animal dequeueAny() {
        final Cat cat = cats.peek();
        final Dog dog = dogs.peek();

        if (cat == null) {
            return dogs.poll();
        }

        if (dog == null) {
            return cats.poll();
        }

        return cat.arrivalDate.before(dog.arrivalDate) ? cats.poll() : dogs.poll();
    }

    @Nullable
    Cat dequeueCat() {
        return cats.poll();
    }

    @Nullable
    Dog dequeueDog() {
        return dogs.poll();
    }

    static class Animal {
        Date arrivalDate;
        String name;

        Animal(@NotNull final String name, @NotNull final Date arrivalDate) {
            this.name = name;
            this.arrivalDate = arrivalDate;
        }
    }

    static class Cat extends Animal {
        Cat(@NotNull final String name, @NotNull final Date arrivalDate) {
            super(name, arrivalDate);
        }
    }

    static class Dog extends Animal {
        Dog(@NotNull final String name, @NotNull final Date arrivalDate) {
            super(name, arrivalDate);
        }
    }
}
