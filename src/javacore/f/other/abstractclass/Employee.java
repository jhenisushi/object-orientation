package javacore.f.other.abstractclass;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonusSalary();
    }

    public String getName() {
        return name;
    }

    // Only abstract classes can have abstract methods
    public abstract void bonusSalary();

    // Example of a concrete method
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

    // We can implement the abstract method of Person here,
    // or leave it to be implemented by the subclass

    @Override
    public void print() {
        System.out.println("Printing employee data...");
    }
}
