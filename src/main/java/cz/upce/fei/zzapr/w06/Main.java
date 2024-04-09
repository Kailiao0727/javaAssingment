package cz.upce.fei.zzapr.w06;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("iphone13", "Home", "Apple", "#!23%a67A69", "123456789");

        myPhone.showInfo();
        myPhone.makeCall("987654321");

        TV tv = new TV("S20223s", "Home", "Samsung", 50);
        tv.showInfo();
    }
}
