package javacore.f.other.enumclass.domain;

// Enums in Java work by creating constant instances, and the constructor is
// called automatically when the enum constants are defined.
public enum ClientType {
    // Attributes, Methods and Constructors

    INDIVIDUAL(1), // This constant is initialized by calling the constructor with the value 1.
    LEGAL_ENTITY(2),
    NEW_TEST(3, "New test");

    private final int TYPE; // it needs to be initialized
    private String NAME;

    private ClientType(int type) {
        TYPE = type; // initialize the final variable
    }

    private ClientType(int type, String name) {
        TYPE = type;
        NAME = name;
    }

    public int getType() {
        return TYPE;
    }

    public String getName() {
        return NAME;
    }

    // How can I search for an enum by attribute?

    public static ClientType searchByName(String name) {
        for (ClientType clientType : values()) {
            if (clientType.NAME.equals(name)) {
            // or if (clientType.getName().equals(name)) {
                return clientType;
            }
        }
        return null;
    }

    public static ClientType searchByType(int type) {
        for (ClientType clientType : values()) {
            if (clientType.TYPE == type) {
                return clientType;
            }
        }
        return null;
    }
}
