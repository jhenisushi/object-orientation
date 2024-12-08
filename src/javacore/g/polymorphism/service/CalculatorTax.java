package javacore.g.polymorphism.service;

import javacore.g.polymorphism.domain.Computer;
import javacore.g.polymorphism.domain.Console;
import javacore.g.polymorphism.domain.Product;
import javacore.g.polymorphism.domain.Tomato;

public class CalculatorTax {
    // This method is static because it does not require
    // an instance of the class to be used, as the class
    // no longer contains attributes.

    public static void calculateTaxComputer(Computer computer) {
        double tax = computer.calculateTax();
        System.out.println("Report of taxes for the computer: ");
        System.out.println("Product: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Tax to be paid: " + tax);
    }

    public static void calculateTaxConsole(Console console) {
        double tax = console.calculateTax();
        System.out.println("Report of taxes for the console: ");
        System.out.println("Product: " + console.getName());
        System.out.println("Price: " + console.getPrice());
        System.out.println("Tax to be paid: " + tax);
    }

    // refactor the code to use polymorphism
    public static void calculateTaxProduct(Product product) {
        double tax = product.calculateTax();
        System.out.println("Report of taxes for the product: ");
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax to be paid: " + tax);

        // Cast and instance of
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("Expiration date: " + tomato.getExpirationDate());
            // or System.out.println("Expiration date: " + ((Tomato) product).getExpirationDate());
        }

        /* or
        if (product instanceof Tomato tomato) {
            System.out.println("Expiration date: " + tomato.getExpirationDate());
        } */
    }
}
