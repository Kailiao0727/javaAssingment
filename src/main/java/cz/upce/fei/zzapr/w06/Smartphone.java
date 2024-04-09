package cz.upce.fei.zzapr.w06;

public class Smartphone extends Device {
    private String password;
    private String phoneNumber;

    public Smartphone(String model, String location, String brand, String password, String phoneNumber) {
        super(model, location, brand);
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public void makeCall(String number) {
        System.out.println("Dialing " + number + "...");
    }

    @Override
    public void showInfo() {
        System.out.println("Smartphone: " + this.brand + " " + this.model + " with phone number: " + this.phoneNumber);
    }
}
