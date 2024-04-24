package cz.upce.fei.zzapr.w07;

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
    public String toString() {
        String ret = super.toString();
        ret = "Smartphone: " + ret + "Phone number: " + this.phoneNumber + "\n";

        return ret;
    }
}
