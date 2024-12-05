package DesignPattern.Mediator;

public class Thermostat extends Device {
    private int temperature;

    public void setTemperature(int temp) {
        this.temperature = temp;
        if (temp > 30) { 
            System.out.println("Thermostat: Temperature is high (" + temp + "°C).");
            sendEvent("TemperatureHigh");
        }
    }

    @Override
    public void performAction(String action) {
        System.out.println("Thermostat: No direct action performed.");
    }
}
