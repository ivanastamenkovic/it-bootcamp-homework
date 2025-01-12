package javaclassdevices;

// In the main method, create a list of devices, iterate through a loop,
// and print the class to which each object belongs (whether it's a laptop or mobile).

import java.util.ArrayList;

public class TaskDevice {
    public static void main(String[] args) {

    ArrayList<Device> devices = new ArrayList<>();
        devices.add(new Laptop(4, 16, 512, 15.6, KeyboardType.INTERNATIONAL));
        devices.add(new MobilePhone(8, 6, 128, 32, NetworkType._5G));


        for (Device device : devices) {
        if (device instanceof Laptop) {
            System.out.println("This is a Laptop");
        } else if (device instanceof MobilePhone) {
            System.out.println("This is a Mobile Phone");
        } else {
            System.out.println("This is a Computer");
        }
        }
    }
}
