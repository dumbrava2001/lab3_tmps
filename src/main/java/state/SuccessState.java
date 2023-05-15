package state;

public class SuccessState implements PaymentState{

    @Override
    public boolean next(Payment payment) {
        System.out.println("Payment already completed successfully");
        return true;
    }

    @Override
    public void previous(Payment payment) {
        payment.setPaymentState(new CheckoutState());
    }

    @Override
    public String getStatus() {
        return "Success...";
    }
}
