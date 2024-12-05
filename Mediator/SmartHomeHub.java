package DesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements Mediator {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
        device.setMediator(this);
    }

    @Override
    public void notifyDevice(Device sender, String event) {
        switch (event) {
            case "DoorUnlocked":
                System.out.println("SmartHomeHub: Reacting to DoorUnlocked event.");
                for (Device device : devices) {
                    if (device instanceof Light) {
                        device.performAction("TurnOn");
                    }
                }
                break;

            case "TemperatureHigh":
                System.out.println("SmartHomeHub: Reacting to TemperatureHigh event.");
                for (Device device : devices) {
                    if (device instanceof AirConditioner) {
                        device.performAction("ActivateCooling");
                    }
                }
                break;

            default:
                System.out.println("SmartHomeHub: Unknown event received.");
        }
    }
}
