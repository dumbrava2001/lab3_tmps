package state;

public class Credential {

    private final String name;

    private double totalSum;

    public Credential(String name, double totalSum) {
        this.name = name;
        this.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }
}
