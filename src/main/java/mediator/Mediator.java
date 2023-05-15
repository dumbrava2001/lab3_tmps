package mediator;

public class Mediator {

    private PhoneScreen phoneScreen;

    private PhonePowerButton phonePowerButton;

    private PowerSupply powerSupply;

    public Mediator(PhoneScreen phoneScreen, PhonePowerButton phonePowerButton, PowerSupply powerSupply) {
        this.phoneScreen = phoneScreen;
        this.phonePowerButton = phonePowerButton;
        this.powerSupply = powerSupply;
    }

    public void press() {
        if (phoneScreen.isOn()) {
            phoneScreen.turnOff();
        } else {
            phoneScreen.turnOn();
        }
    }

    public void start() {
        powerSupply.turnOnScreen();
    }

    public void stop() {
        powerSupply.turnOffScreen();
    }
}
