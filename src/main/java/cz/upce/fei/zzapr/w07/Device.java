package cz.upce.fei.zzapr.w07;

public class Device {
    private String model;
    private String location;
    private String brand;

    public Device(String model, String location, String brand) {
        this.model = model;
        this.location = location;
        this.brand = brand;
    }

    public String toString(){
        String ret = "";
        ret += brand + " " + model + ".\n";

        return ret;
    }

    public String getModel() {
        return this.model;
    }
}
