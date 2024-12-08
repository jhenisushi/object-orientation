package javacore.g.polymorphism.service;

import javacore.g.polymorphism.reporitory.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving to memory");
    }
}
