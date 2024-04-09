package cz.upce.fei.zzapr.w06;

public class TV extends Device {
    private int screenSize;
    private int channel;

    public TV(String model, String location, String brand, int screenSize) {
        super(model, location, brand);
        this.screenSize = screenSize;
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Changing channel to " + channel + "...");
    }

    @Override
    public void showInfo() {
        System.out.println("TV: " + this.brand + " " + this.model + " is currently on channel: " + this.channel);
    }
}