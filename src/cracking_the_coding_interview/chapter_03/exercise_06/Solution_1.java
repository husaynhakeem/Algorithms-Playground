package cracking_the_coding_interview.chapter_03.exercise_06;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class Solution_1 {

    private final LinkedList<Cat> cats = new LinkedList<>();
    private final LinkedList<Dog> dogs = new LinkedList<>();
    private int order = 0;

    void enqueue(@NotNull final Animal animal) {
        animal.order = order++;
        if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        } else if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        }
    }

    Animal dequeueAny() {
        final Cat cat = cats.isEmpty() ? null : cats.peekFirst();
        final Dog dog = dogs.isEmpty() ? null : dogs.peekFirst();

        if (cat == null) {
            return dogs.pollFirst();
        }

        if (dog == null) {
            return cats.pollFirst();
        }

        return cat.order < dog.order ? cats.removeFirst() : dogs.removeFirst();
    }

    Cat dequeueCat() {
        return cats.pollFirst();
    }

    Dog dequeueDog() {
        return dogs.pollFirst();
    }

    static class Animal {
        int order;
        String name;

        Animal(String name) {
            this.name = name;
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
    }
}
