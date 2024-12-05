package DesignPattern.Mediator;

public class Light extends Device {
    private boolean isOn = false;

    @Override
    public void performAction(String action) {
        if (action.equals("TurnOn")) {
            isOn = true;
            System.out.println("Light: Entryway light is turned ON.");
        } else if (action.equals("TurnOff")) {
            isOn = false;
            System.out.println("Light: Entryway light is turned OFF.");
        }
    }
}
