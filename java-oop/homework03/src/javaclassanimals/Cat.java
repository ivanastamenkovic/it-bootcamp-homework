package javaclassanimals;

// Create a class Cat that inherits from class Animal.
// Cat has an attribute for weight
// and a method that prints "I’m a chonk" or "I’m not a chonk" depending on whether the weight is over 5kg or not.
// Implement toString, where the name and nickname are printed, as well as whether it is a "chonk" or not (by calling the specific method).
// Implement a method for the sound that the animal makes - for a cat, it returns the string "meow".
// Add a call to this method in toString.

public class Cat extends Animal {
    private double weight;

    public Cat(String name, String nickname, double weight) {
        super(name, nickname);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        String chonkStatus;
        if (weight > 5) {
            chonkStatus = "I'm a chonk";
        } else {
            chonkStatus = "I'm not a chonk";
        }
        return super.toString() + ", " + chonkStatus + ", Sound: " + makeSound();
    }
}
