package DesignPattern.Mediator;

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        
        Light entryLight = new Light();
        AirConditioner airConditioner = new AirConditioner();
        DoorLock doorLock = new DoorLock();
        Thermostat thermostat = new Thermostat();

        
        hub.addDevice(entryLight);
        hub.addDevice(airConditioner);
        hub.addDevice(doorLock);
        hub.addDevice(thermostat);

        
        doorLock.unlockDoor(); 
        thermostat.setTemperature(32); 
    }
}
