package org.example.model;

public class Smartwatch extends SmartDevice{

    private String processor;
    private String gpu;
    private String material;
    private String correa;


    public Smartwatch(String operatingSystem, String manufacturer, String model, String color, int storage, int ram,
            int batteryCapacity, int screenSize, int screenResolution, int screenRefreshRate, String processor, String gpu,
            String material, String correa) {
        super(operatingSystem, manufacturer, model, color, storage, ram, batteryCapacity, screenSize, screenResolution,
                screenRefreshRate);
        this.processor = processor;
        this.gpu = gpu;
        this.material = material;
        this.correa = correa;
    }

    public Smartwatch() {}


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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCorrea() {
        return correa;
    }

    public void setCorrea(String correa) {
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "Smartwatch{" + super.toString() +
                "processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                ", material='" + material + '\'' +
                ", correa='" + correa + '\'' +
                '}';
    }
}
