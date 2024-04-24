package cz.upce.fei.zzapr.w07;

import cz.upce.fei.zzapr.w07.exceptions.DeviceExceedsMaxNumber;

public class Main {
//    public static void main(String[] args) {
//        Smartphone myPhone = new Smartphone("iphone13", "Home", "Apple", "#!23%a67A69", "123456789");
//
//        System.out.println(myPhone.toString());
//
//        TV tv = new TV("S20223s", "Home", "Samsung", 50);
//        tv.switchChannel(5);
//        System.out.println(tv.toString());
//    }
    public static void main(String[] args) {
        TV tv1 = new TV("Model1", "Living room", "Brand1", 42);
        Smartphone phone1 = new Smartphone("iphone13", "Home", "Apple", "#!23%a67A69", "123456789");
        TV tv2 = new TV("Model2", "Bedroom", "Brand2", 55);

        Person person = new Person("John");

        try {
            person.addDevice(tv1);
        } catch (DeviceExceedsMaxNumber e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            person.addDevice(phone1);
        } catch (DeviceExceedsMaxNumber e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            person.addDevice(tv2);
        } catch (DeviceExceedsMaxNumber e) {
            System.out.println("Error: " + e.getMessage());
        }

        person.deleteDevice(tv1);

        try {
            person.addDevice(tv2);
        } catch (DeviceExceedsMaxNumber e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(person.toString());
    }

}
