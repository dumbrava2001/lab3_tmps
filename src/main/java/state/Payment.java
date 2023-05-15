package state;

public class Payment {

    private PaymentState paymentState = new ProcessingState();

    private final Credential credentials;

    private final double sum;

    public Payment(Credential credentials, double sum) {
        this.credentials = credentials;
        this.sum = sum;
    }

    public boolean proceed() {
        return paymentState.next(this);
    }

    public void rollBack() {
        paymentState.previous(this);
    }

    public String getPaymentStatus(){
        return this.paymentState.getStatus();
    }

    public Credential getCredentials() {
        return credentials;
    }

    public double getSum() {
        return sum;
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }
}
