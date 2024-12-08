package javacore.h.exception.runtime.test;

public class ExceptionTest04 {
    public static void main(String[] args) {
        System.out.println(openFile());
    }

    private static String openFile() {
        try {
            System.out.println("Opening file");
            System.out.println("Reading file");
            return "file content";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // finally block is always executed
            System.out.println("Closing recurses opened by the OS");
        }
        return null;
    }
}
