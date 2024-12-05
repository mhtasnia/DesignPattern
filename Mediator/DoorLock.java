package DesignPattern.Mediator;

public class DoorLock extends Device {
    private boolean isLocked = true;

    public void unlockDoor() {
        if (isLocked) {
            isLocked = false;
            System.out.println("DoorLock: Door is unlocked.");
            sendEvent("DoorUnlocked");
        }
    }

    public void lockDoor() {
        if (!isLocked) {
            isLocked = true;
            System.out.println("DoorLock: Door is locked.");
        }
    }

    @Override
    public void performAction(String action) {
        System.out.println("DoorLock: Waiting for instruction");
    }
}
