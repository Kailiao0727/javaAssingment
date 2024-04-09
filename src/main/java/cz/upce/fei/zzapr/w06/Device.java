package cz.upce.fei.zzapr.w06;

public class Device {
    protected String model;
    protected String location;
    protected String brand;
    protected boolean isPoweredOn;

    public Device(String model, String location, String brand) {
        this.model = model;
        this.location = location;
        this.brand = brand;
        this.isPoweredOn = false;
    }

    public void showInfo(){
        System.out.println(brand + " " + model + ".");
    }
}
