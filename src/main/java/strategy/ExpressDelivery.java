package strategy;

public class ExpressDelivery implements DeliveryStrategy{

    @Override
    public void deliver(Order order) {
        System.out.println("Delivering order with express delivery:" + order.getOrderId());
    }

    @Override
    public double calculateDeliveryCost(double cost) {
        double deliveryPercent = 0.1;
        return cost * deliveryPercent;
    }
}
