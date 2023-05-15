package strategy;

public interface DeliveryStrategy {

    void deliver(Order order);

    double calculateDeliveryCost(double cost);
}
