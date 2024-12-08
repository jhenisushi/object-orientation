package javacore.f.other.enumclass.test;

import javacore.f.other.enumclass.domain.Client;
import javacore.f.other.enumclass.domain.ClientType;
import javacore.f.other.enumclass.domain.PaymentMethod;

public class ClientTest02 {
    public static void main(String[] args) {
        Client client = new Client("John Doe", ClientType.INDIVIDUAL, PaymentMethod.DEBIT_CARD);
        System.out.println(client);
        System.out.println(PaymentMethod.DEBIT_CARD.discount(100));
    }
}
