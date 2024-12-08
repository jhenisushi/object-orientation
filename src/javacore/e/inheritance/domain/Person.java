package java.core.e.inheritance.domain;

public class Person { // extends Object
    private String name;
    private long cpf;
    private Address address;

    public Person(String name, long cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Person(String name, long cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    // we can override the toString method from Object
    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + address.getStreet() +
                ", " + address.getCity() +
                ", " + address.getState() +
                " - " + address.getCep());
    }

    @Override
    public String toString() {
        return ("Nome: " + name + "\n" +
                "CPF: " + cpf + "\n" +
                "Endereço: " + address.getStreet() +
                ", " + address.getCity() +
                ", " + address.getState() +
                " - " + address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
