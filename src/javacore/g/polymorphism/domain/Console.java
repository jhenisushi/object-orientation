package javacore.g.polymorphism.domain;

public class Console extends Product {
    public static final double TAX = 0.2;

    public Console(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX;
    }

    @Override
    public String toString() {
        return "Console{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
