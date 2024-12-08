package javacore.h.exception.runtime.test;

import java.io.IOException;

// exceptions unchecked are the ones that extend from RuntimeException
public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 1));

        // other code
        try {
            System.out.println(division(1, 0));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // this block is never executed if in line 5 we throw an exception
        System.out.println("Program continues to run.");
    }

    // just to show that we can throw a checked exception
    // more used in checked exceptions
    private static int division(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' cannot be 0.");
        }
        return a / b;
    }
}
