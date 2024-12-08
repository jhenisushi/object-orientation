package javacore.g.polymorphism.domain;

public class Computer extends Product {
    public static final double TAX = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
