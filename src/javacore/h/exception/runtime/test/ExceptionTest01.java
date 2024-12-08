package javacore.h.exception.runtime.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

//
public class ExceptionTest01 {
    public static void main(String[] args) {
        File file = new File("file/test.txt");
        try {
            System.out.println("File created? " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
            // throw new RuntimeException(e);
        }
    }
}
