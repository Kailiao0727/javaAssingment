package cz.upce.fei.zzapr.w07;

import cz.upce.fei.zzapr.w07.exceptions.DeviceExceedsMaxNumber;

import java.util.ArrayList;

public class Person {
    private final String name;
    public final int MAX_DEVICE = 2;
    private ArrayList<Device> devices;

    public Person(String name) {
        this.name = name;
        devices = new ArrayList<Device>();
    }

    public void addDevice(Device device) throws DeviceExceedsMaxNumber {
        if (device != null && devices.size() < MAX_DEVICE) {
            devices.add(device);
            System.out.println(device.getClass().getSimpleName() + " " + device.getModel() + " added successfully to the list.\n");
        } else if (device != null){
            throw new DeviceExceedsMaxNumber("Maximum number of devices reached.\n");
        }
    }

    public void deleteDevice(Device device) {
        if (device != null) {
            devices.remove(device);
            System.out.println(device.getClass().getSimpleName() + " " + device.getModel() + " removed successfully from the list.\n");
        }
    }


    public String toString() {
        String ret = "";
        ret += this.name + " has " + devices.size() + " devices:\n";

        int count = 0;
        for (Device d: devices) {
            ret += ++count + "\n";
            ret += d.toString();
        }
        return ret;
    }
}
