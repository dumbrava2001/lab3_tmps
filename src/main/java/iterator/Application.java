package iterator;

public class Application {

    private final String name;

    private final String brand;

    private final ApplicationType type;

    public Application(String name, String brand, ApplicationType type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public ApplicationType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                '}';
    }
}
