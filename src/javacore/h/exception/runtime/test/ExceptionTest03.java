package javacore.h.exception.runtime.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // you force the caller to handle the exception
    private static void createFile() throws IOException{
        File file = new File("file/new-test.txt");
        System.out.println("File created? " + file.createNewFile());
    }
}
