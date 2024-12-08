package javacore.h.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest05 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");

        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");

        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");

        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Inside Exception");
        }
    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {
        throw new RuntimeException();
    }

}
