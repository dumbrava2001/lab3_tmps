package mediator;

public class PhonePowerButton {

    private Mediator mediator;

    public void press() {
        mediator.press();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
