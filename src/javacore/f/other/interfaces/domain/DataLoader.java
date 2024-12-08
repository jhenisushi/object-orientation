package javacore.f.other.interfaces.domain;

// public always is implicit
public interface DataLoader {
    // static final is implicit (constant)
    String TEST = "test in interface";

    // why static? because it independent of any instance of
    // the class and can be called using the interface name.
    static void retrieve() {
        System.out.println("Retrieving data");
    }

    // abstract is implicit
    void load();

    // why default? because it's a new feature in Java 8
    // to add new methods to interfaces without breaking
    // the classes that implement the interface.
    default void checkPermission() {
        System.out.println("Checking permission");
    }
}
