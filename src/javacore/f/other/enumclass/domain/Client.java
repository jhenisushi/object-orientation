package javacore.f.other.enumclass.domain;

public class Client {
    private String name;
    private ClientType type;
    private final PaymentMethod paymentMethod;

    public Client(String name, ClientType clientType, PaymentMethod paymentMethod) {
        this.name = name;
        this.type = clientType;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type + // Name of the enum (upper case)
                ", type=" + type.getName() + // Name of the enum (name attribute)
                ", typeInt=" + type.getType() + // Value of the enum
                ", paymentMethod=" + paymentMethod +
                '}';
    }

    public String getName() {
        return name;
    }

    public ClientType getType() {
        return type;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ClientType type) {
        this.type = type;
    }
}
