package javaclassanimals;

// In the main method, create several cats and dogs.
// Put them in a list and iterate through all elements.
// For dogs, print "dog: " and append the result of toString from the dog.
// For cats, print "cat: " and append the result of toString from the cat.
// Use instanceof for this.

import java.util.ArrayList;

public class TaskAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers", "Whisky", 4.5);
        Cat cat2 = new Cat("Socks", "Socky", 5.8);
        Dog dog1 = new Dog("Buddy", "Bud", true);
        Dog dog2 = new Dog("Max", "Maxie", false);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.print("Dog: ");
            } else if (animal instanceof Cat) {
                System.out.print("Cat: ");
            }
            System.out.println(animal.toString());
        }
    }
}
