package javaclassdevices;

// Create a class Mobile phone that inherits from a class Device
// and has additional field for camera resolution in megapixels
// and an enum for the supported network type (3G, 4G, 5G).
// Implement the toString method to print:
// "Number of processors: 8, RAM: 6GB, storage: 128GB, camera: 32 Megapixels, network: 5G".

public class MobilePhone extends Device {
    private int cameraResolution;
    private NetworkType networkType;

    public MobilePhone(int numberOfProcessors, int ram, int storage, int cameraResolution, NetworkType networkType) {
        super(numberOfProcessors, ram, storage);
        this.cameraResolution = cameraResolution;
        this.networkType = networkType;
    }

    @Override
    public String toString() {
        return super.toString() + ", camera: " + cameraResolution + " Megapixels, network: " + networkType;
    }
}
