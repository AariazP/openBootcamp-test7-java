package org.example.model;

public class Smartphone extends SmartDevice{

    private String processor;
    private String gpu;
    private String camera;
    private String frontCamera;
    private String batteryType;


    public Smartphone(String operatingSystem, String manufacturer, String model, String color, int storage, int ram,
            int batteryCapacity, int screenSize, int screenResolution, int screenRefreshRate, String processor, String gpu,
            String camera, String frontCamera, String batteryType) {
        super(operatingSystem, manufacturer, model, color, storage, ram, batteryCapacity, screenSize, screenResolution,
                screenRefreshRate);
        this.processor = processor;
        this.gpu = gpu;
        this.camera = camera;
        this.frontCamera = frontCamera;
        this.batteryType = batteryType;
    }

    public Smartphone() {}


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() +
                "processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                ", camera='" + camera + '\'' +
                ", frontCamera='" + frontCamera + '\'' +
                ", batteryType='" + batteryType + '\'' +
                '}';
    }
}
