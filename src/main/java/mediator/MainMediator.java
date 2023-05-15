package mediator;

public class MainMediator {

    public static void main(String[] args) {
        PhoneScreen phoneScreen = new PhoneScreen();
        PowerSupply powerSupply = new PowerSupply();
        PhonePowerButton phonePowerButton = new PhonePowerButton();

        Mediator mediator = new Mediator(phoneScreen, phonePowerButton, powerSupply);
        phoneScreen.setMediator(mediator);
        phonePowerButton.setMediator(mediator);

        phonePowerButton.press();
        System.out.println(phoneScreen.isOn());

        phonePowerButton.press();
        System.out.println(phoneScreen.isOn());
    }
}
