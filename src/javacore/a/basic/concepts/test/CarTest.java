package javacore.a.basic.concepts.test;

import javacore.a.basic.concepts.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carTest1 = new Car();

        System.out.println(Car.maxSpeed);
        System.out.println(carTest1.getMaxSpeed());

        System.out.println(carTest1.BUYER);
        carTest1.BUYER.setName("Jhennifer");
        System.out.println(carTest1.BUYER);

        // carTest1.BUYER = new Buyer();
        // it is not possible to change the reference of a final variable
    }
}
