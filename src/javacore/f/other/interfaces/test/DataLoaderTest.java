package javacore.f.other.interfaces.test;

import javacore.f.other.interfaces.domain.DataLoader;
import javacore.f.other.interfaces.domain.DatabaseLoader;
import javacore.f.other.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

        DataLoader.retrieve();
    }
}
