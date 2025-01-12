package javaclassanimals;

// Create a class Dog that inherits from class Animal.
// Dog has an additional attribute called goodBoy.
// Implement a method that prints "I am a good boy" or "I am a bad boy"
// depending on whether the goodBoy variable is true or false.
// Implement toString, where the name and nickname are printed,
// as well as whether it is a good boy or not (by calling the specific method).
// Implement a method for the sound that the animal makes - for a dog, it returns the string "woof".
// Add a call to this method in toString.

public class Dog extends Animal {

    private boolean goodBoy;

    public Dog(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String toString() {
        String goodBoyStatus = isGoodBoy() ? "I am a good boy" : "I am a bad boy";
        return super.toString() + ", " + goodBoyStatus + ", Sound: " + makeSound();
    }
}
