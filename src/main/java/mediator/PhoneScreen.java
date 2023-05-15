package mediator;

public class PhoneScreen {

    private Mediator mediator;

    private boolean isOn = false;

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
