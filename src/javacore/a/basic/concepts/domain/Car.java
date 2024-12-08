package javacore.a.basic.concepts.domain;

// Learning how to use modifiers
public class Car {
    // A primitive type variable

    // with static, I can change the value of maxSpeed for all instances of Car
    public static double maxSpeed = 200;

    // with final, I can't change the value of maxSpeed for any instance of Car
    // private final double MAX_SPEED = 200;

    // with static and final, I can't change the value of maxSpeed for all instances of Car
    private static final double MAX_SPEED = 200;

    // A reference type variable

    // with final, I can't change the reference of BUYER for any instance of Car
    public final Buyer BUYER = new Buyer();
    // Singleton pattern //

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Car() {
    }
}
