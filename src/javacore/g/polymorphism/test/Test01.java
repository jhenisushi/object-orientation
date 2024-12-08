package javacore.g.polymorphism.test;


import javacore.g.polymorphism.domain.Computer;
import javacore.g.polymorphism.domain.Console;
import javacore.g.polymorphism.domain.Tv;
import javacore.g.polymorphism.service.CalculatorTax;

public class Test01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Inspiron15", 3000);
        CalculatorTax.calculateTaxComputer(computer);
        CalculatorTax.calculateTaxProduct(computer);
        System.out.println("---------------------");

        Console console = new Console("PS5", 5000);
        CalculatorTax.calculateTaxConsole(console);
        CalculatorTax.calculateTaxProduct(console);
        System.out.println("---------------------");

        Tv tv = new Tv("Samsung 50\"", 4000);
        CalculatorTax.calculateTaxProduct(tv);
        System.out.println("---------------------");
    }
}
