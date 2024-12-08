package javacore.a.basic.concepts.domain;

public class Buyer {
    private String name;

    public Buyer() {
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
