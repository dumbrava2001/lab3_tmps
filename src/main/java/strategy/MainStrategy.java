package strategy;

import java.util.UUID;

public class MainStrategy {

    public static void main(String[] args) {
        DeliveryStrategy standard = new StandardDelivery();
        ExpressDelivery express = new ExpressDelivery();

        System.out.println("Standard delivery:");
        Order order = new Order(UUID.randomUUID().toString(), 2500);
        order.placeOrder(standard);
        System.out.println(order);
        standard.deliver(order);

        System.out.println("Express delivery:");
        Order fastOrder = new Order(UUID.randomUUID().toString(), 1500.95);
        fastOrder.placeOrder(express);
        System.out.println(fastOrder);
        express.deliver(fastOrder);

    }
}
