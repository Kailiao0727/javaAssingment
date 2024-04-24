package cz.upce.fei.zzapr.w07;

public class TV extends Device {
    private int screenSize;
    private int channel;

    public TV(String model, String location, String brand, int screenSize) {
        super(model, location, brand);
        this.screenSize = screenSize;
    }

    public void switchChannel(int channel) {
        this.channel = channel;
        System.out.println("Changing channel to " + channel + "...");
    }

    @Override
    public String toString() {
        String ret = super.toString();
        ret = "TV: " + ret + "Currently on channel: " + this.channel + "\n";

        return ret;
    }
}