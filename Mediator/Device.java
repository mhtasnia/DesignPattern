package DesignPattern.Mediator;

public abstract class Device {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    
    public void sendEvent(String event) {
        if (mediator != null) {
            mediator.notifyDevice(this, event);
        }
    }

    
    public abstract void performAction(String action);
}
