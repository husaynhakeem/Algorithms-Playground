package cracking_the_coding_interview.chapter3_exercise6.java;

import java.util.LinkedList;

public class Solution_1 {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue(new Cat("Tony"));
        animalShelter.enqueue(new Cat("Moucha"));
        animalShelter.enqueue(new Dog("Doge"));
        animalShelter.enqueue(new Cat("Stray cat"));
        animalShelter.enqueue(new Dog("Stray dog"));

        System.out.println(animalShelter.dequeueAny());
        System.out.println(animalShelter.dequeueDog());
        System.out.println(animalShelter.dequeueAny());
        System.out.println(animalShelter.dequeueDog());
        System.out.println(animalShelter.dequeueCat());
    }

    private static class AnimalShelter {
        private LinkedList<Cat> cats = new LinkedList<>();
        private LinkedList<Dog> dogs = new LinkedList<>();
        private int order = 0;

        public void enqueue(Animal animal) {
            animal.order = order++;
            if (animal instanceof Cat) {
                cats.addLast((Cat) animal);
            } else if (animal instanceof Dog) {
                dogs.addLast((Dog) animal);
            }
        }

        public Animal dequeueAny() {
            Cat cat = cats.peekFirst();
            Dog dog = dogs.peekFirst();

            if (cat.isOlderThan(dog))
                return dequeueCat();
            return dequeueDog();
        }

        public Cat dequeueCat() {
            if (cats.isEmpty())
                return null;
            return cats.pollFirst();
        }

        public Dog dequeueDog() {
            if (dogs.isEmpty())
                return null;
            return dogs.pollFirst();
        }
    }

    private static class Animal {
        public int order;
        public String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public boolean isOlderThan(Animal a) {
            return this.order < a.order;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    private static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }
}
