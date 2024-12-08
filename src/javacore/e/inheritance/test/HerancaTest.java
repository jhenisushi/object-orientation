package javacore.e.inheritance.test;

import javacore.e.inheritance.domain.Person;
import javacore.e.inheritance.domain.Address;
import javacore.e.inheritance.domain.Employee;

public class HerancaTest {
    // 0 - Static initialization block of super class is executed when JVM loads superclass
    // 1 - Static initialization block of subclass is executed when JVM loads subclass
    // 2 - Allocated memory space for superclass object
    // 3 - Each superclass attribute is created and initialized with default values or whatever is passed
    // 4 - Superclass initialization block is executed in the order it appears
    // 5 - Constructor is executed from superclass
    // 6 - Allocated memory space for subclass object
    // 7 - Each subclass attribute is created and initialized with default values or whatever is passed
    // 8 - Subclass initialization block is executed in the order it appears
    // 9 - Constructor is executed from subclass

    public static void main(String[] args) {
        Address address = new Address("Rua 1", "Cidade 1", "Estado 1", "12345-678");
        Person person = new Person("Fulano", 123456789, address);
        Employee employee = new Employee(person.getName(), person.getCpf(), person.getAddress(), "Gerente", 10000.0);
        // employee.showInfo();
        System.out.println(employee);
    }
}
