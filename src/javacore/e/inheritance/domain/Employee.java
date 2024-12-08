package java.core.e.inheritance.domain;

public class Employee extends Person {
    private String role;
    private double salary;

    public Employee(String name, long cpf, String role, double salary) {
        super(name, cpf);
        this.role = role;
        this.salary = salary;
    }

    public Employee(String name, long cpf, Address address, String role, double salary) {
        super(name, cpf, address);
        this.role = role;
        this.salary = salary;
    }

    // we can override the toString method from Person
    public void showInfo() {
        super.showInfo();
        System.out.println("Cargo: " + role);
        System.out.println("Salário: " + salary);
    }

    @Override
    public String toString() {
        return (super.toString() + "\n" +
                "Cargo: " + role + "\n" +
                "Salário: " + salary);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
