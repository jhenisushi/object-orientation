package javacore.f.other.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file");
    }
}
