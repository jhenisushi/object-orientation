package javacore.g.polymorphism.test;

import javacore.g.polymorphism.domain.Computer;
import javacore.g.polymorphism.domain.Console;
import javacore.g.polymorphism.domain.Product;
import javacore.g.polymorphism.service.CalculatorTax;

public class Test02 {
    public static void main(String[] args) {
        Product product1 = new Computer("Inspiron15", 3000);
        System.out.println(product1);
        CalculatorTax.calculateTaxProduct(product1);

        Product product2 = new Console("PS5", 5000);
        System.out.println(product2);
        CalculatorTax.calculateTaxProduct(product2);
    }
}
