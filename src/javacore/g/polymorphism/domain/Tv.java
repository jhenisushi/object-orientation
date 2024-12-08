package javacore.g.polymorphism.domain;

public class Tv extends Product {
    private static final double TAX = 0.16;

    public Tv(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX;
    }
}
