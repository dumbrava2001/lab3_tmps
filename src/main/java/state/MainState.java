package state;

import java.util.UUID;

public class MainState {

    public static void main(String[] args) {
        Credential credential = new Credential(UUID.randomUUID().toString(), 2400);
        Payment payment = new Payment(credential, 1500);

        System.out.println(payment.getPaymentStatus());
        payment.proceed();
        System.out.println(payment.getPaymentStatus());
        payment.proceed();
        System.out.println(payment.getPaymentStatus());
        payment.proceed();
        System.out.println(payment.getPaymentStatus());
        System.out.println("Remaining funds:"+payment.getCredentials().getTotalSum());

        System.out.println("New payment with not enough funds:");
        Payment payment2 = new Payment(credential, 2000);

        System.out.println(payment2.getPaymentStatus());
        payment2.proceed();
        System.out.println(payment2.getPaymentStatus());
        payment2.proceed();

    }
}
