package javacore.h.exception.runtime.test;

import javacore.h.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class LoginExcpTest {

    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("User");
        String usernameTyped = keyboard.nextLine();
        System.out.println("Password");
        String passwordTyped = keyboard.nextLine();

        if (!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
            throw new InvalidLoginException("Invalid username or password");
        }
        System.out.println("User logged in successfully");
    }
}
