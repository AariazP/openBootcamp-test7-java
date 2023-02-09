package org.example.model;

public class SmartDevice {

    private String operatingSystem;
    private String manufacturer;
    private String model;
    private String color;
    private int storage;
    private int ram;
    private int batteryCapacity;
    private int screenSize;
    private int screenResolution;
    private int screenRefreshRate;


    public SmartDevice(String operatingSystem, String manufacturer, String model, String color, int storage, int ram,
            int batteryCapacity, int screenSize, int screenResolution, int screenRefreshRate) {
        this.operatingSystem = operatingSystem;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.ram = ram;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.screenRefreshRate = screenRefreshRate;
    }

    public SmartDevice() {}

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public void setScreenRefreshRate(int screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", screenResolution=" + screenResolution +
                ", screenRefreshRate=" + screenRefreshRate +
                '}';
    }
}
