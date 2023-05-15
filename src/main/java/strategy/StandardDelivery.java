package strategy;

public class StandardDelivery implements DeliveryStrategy {

    @Override
    public void deliver(Order order) {
        System.out.println("Delivering order with standard delivery:" + order.getOrderId());
    }

    @Override
    public double calculateDeliveryCost(double cost) {
        double deliveryPercent = 0.07;
        return cost * deliveryPercent;
    }
}
