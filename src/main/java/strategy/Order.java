package strategy;

public class Order {

    private String orderId;

    private double cost;

    private double deliveryCost = 0;

    private double totalCost;

    public Order(String orderId, double cost) {
        this.orderId = orderId;
        this.cost = cost;
    }

    public void placeOrder(DeliveryStrategy deliveryStrategy){
        deliveryCost = deliveryStrategy.calculateDeliveryCost(cost);
        totalCost = cost + deliveryCost;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", cost=" + cost +
                ", deliveryCost=" + deliveryCost +
                ", totalCost=" + totalCost +
                '}';
    }
}
