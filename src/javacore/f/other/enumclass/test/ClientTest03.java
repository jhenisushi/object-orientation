package javacore.f.other.enumclass.test;

import javacore.f.other.enumclass.domain.Client;
import javacore.f.other.enumclass.domain.ClientType;
import javacore.f.other.enumclass.domain.PaymentMethod;

// Test the searchByType
public class ClientTest03 {
    public static void main(String[] args) {
        // Return the enum constant of the specified enum type with the specified name.
        ClientType clientType = ClientType.valueOf("INDIVIDUAL");

        // Returns an array containing the constants of this enum type, in the order they are declared.
        ClientType[] allClientTypes = ClientType.values();

        // With this we can iterate over the enum constants,
        // and we can access the attributes and methods of the enum.

        // Test the searchByType and searchByName
        Client client = new Client("John Doe", ClientType.INDIVIDUAL, PaymentMethod.DEBIT_CARD);
        System.out.println(client);
        System.out.println(ClientType.searchByType(1));
        System.out.println(ClientType.searchByType(2));
        System.out.println(ClientType.searchByType(3));
        System.out.println(ClientType.searchByName("Individual"));
        System.out.println(ClientType.searchByName("Legal Entity"));
        System.out.println(ClientType.searchByName("New Test"));


    }
}
