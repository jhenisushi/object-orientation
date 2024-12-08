package javacore.g.polymorphism.test;

import javacore.g.polymorphism.reporitory.Repository;
import javacore.g.polymorphism.service.DatabaseRepository;
import javacore.g.polymorphism.service.FileRepository;
import javacore.g.polymorphism.service.MemoryRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        repository.save();

        repository = new MemoryRepository();
        repository.save();

        repository = new FileRepository();
        repository.save();

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add("ArrayList element " + i);
            linkedList.add("LinkedList element " + i+5);
        }

        System.out.println("------------------");
        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println("------------------");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
