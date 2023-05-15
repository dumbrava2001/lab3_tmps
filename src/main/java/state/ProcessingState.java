package state;

public class ProcessingState implements PaymentState{

    @Override
    public boolean next(Payment payment) {
        if (payment.getCredentials().getName().isEmpty()){
            System.out.println("Invalid credentials");
            return false;
        }
        payment.setPaymentState(new CheckoutState());
        return true;
    }

    @Override
    public void previous(Payment payment) {
        System.out.println("Payment is already in Processing State");
    }

    @Override
    public String getStatus() {
        return "Processing...";
    }

}
