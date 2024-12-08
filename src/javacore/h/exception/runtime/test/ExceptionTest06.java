package javacore.h.exception.runtime.test;

import javacore.h.exception.domain.Reader1;
import javacore.h.exception.domain.Reader2;

import java.io.*;

public class ExceptionTest06 {
    public static void main(String[] args) {
        readFile();
        // readFile2();
    }

    private static void readFile() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {

        }
    }

    /* private static void readFile() {
        try (Reader reader = new BufferedReader(new FileReader("file/test.txt"))) {
        } catch (FileNotFoundException e) {
            System.out.println("Inside FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Inside IOException");
        }
    } */

    // horrible code
    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file/other-test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Inside FileNotFoundException");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Inside IOException");
                }
            }
        }
    }
}
