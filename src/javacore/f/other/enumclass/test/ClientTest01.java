package javacore.f.other.enumclass.test;

import javacore.f.other.enumclass.domain.Client;
import javacore.f.other.enumclass.domain.ClientType;
import javacore.f.other.enumclass.domain.PaymentMethod;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client = new Client("John Doe", ClientType.INDIVIDUAL, PaymentMethod.CASH);
        System.out.println(client);

        Client client2 = new Client("John Doe", ClientType.LEGAL_ENTITY, PaymentMethod.DEBIT_CARD);
        System.out.println(client2);

        Client client3 = new Client("John Doe", ClientType.NEW_TEST, PaymentMethod.CREDIT_CARD);
        System.out.println(client3);
    }
}
