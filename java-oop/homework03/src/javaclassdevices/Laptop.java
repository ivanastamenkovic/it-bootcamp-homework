package javaclassdevices;

// Create a class Laptop that inherits from class Device and has additional field for screen size
// and an enum for the keyboard type (international or US).
// Implement the toString method similarly, but add screen size and keyboard type as follows:
// "Number of processors: 4, RAM: 16GB, storage: 512GB, screen: 15.6 inches, keyboard: INTERNATIONAL".

public class Laptop extends Device {
    private double screenSize;
    private KeyboardType keyboardType;

    public Laptop(int numberOfProcessors, int ram, int storage, double screenSize, KeyboardType keyboardType) {
        super(numberOfProcessors, ram, storage);
        this.screenSize = screenSize;
        this.keyboardType = keyboardType;
    }

    @Override
    public String toString() {
        return super.toString() + ", screen: " + screenSize + " inches, keyboard: " + keyboardType;
    }
}
