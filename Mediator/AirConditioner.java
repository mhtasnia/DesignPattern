package DesignPattern.Mediator;

public class AirConditioner extends Device {
    private boolean isCooling = false;

    @Override
    public void performAction(String action) {
        if (action.equals("ActivateCooling")) {
            isCooling = true;
            System.out.println("Air Conditioner: Cooling mode activated.");
        } else if (action.equals("DeactivateCooling")) {
            isCooling = false;
            System.out.println("Air Conditioner: Cooling mode deactivated.");
        }
    }
}
