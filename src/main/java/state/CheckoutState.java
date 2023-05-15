package state;

public class CheckoutState implements PaymentState {

    @Override
    public boolean next(Payment payment) {
        if (payment.getCredentials().getTotalSum() < payment.getSum()) {
            System.out.println("Not enough funds...");
            previous(payment);
            return false;
        }
        payment.getCredentials().setTotalSum(payment.getCredentials().getTotalSum() - payment.getSum());
        payment.setPaymentState(new SuccessState());
        return true;
    }

    @Override
    public void previous(Payment payment) {
        payment.setPaymentState(new ProcessingState());
    }

    @Override
    public String getStatus() {
        return "Checkout...";
    }
}
