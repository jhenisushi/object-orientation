package javacore.f.other.interfaces.domain;

// private -> default -> protected -> public
public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
    // we never can use void load() {} because default is more restrictive than public
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }
}
