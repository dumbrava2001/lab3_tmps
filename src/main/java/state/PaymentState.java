package state;

public interface PaymentState {

    boolean next(Payment payment);

    void previous(Payment payment);

    String getStatus();
}
