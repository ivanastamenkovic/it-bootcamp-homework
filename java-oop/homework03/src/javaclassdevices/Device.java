package javaclassdevices;

// Create a class representing a device.
// The device has the number of processors, the amount of RAM memory, and the amount of storage memory.
// It has a toString method implemented as
// "Number of processors: 4, RAM: 16GB, storage: 512GB".

public class Device {
    private int numberOfProcessors;
    private int ram;
    private int storage;

    public Device(int numberOfProcessors, int ram, int storage) {
        this.numberOfProcessors = numberOfProcessors;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Number of processors: " + numberOfProcessors + ", RAM: " + ram + "GB" + " , storage: " + storage + "GB";
    }
}
