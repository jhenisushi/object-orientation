package javacore.g.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX = 0.2;
    private String expirationDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    public Tomato(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
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

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}