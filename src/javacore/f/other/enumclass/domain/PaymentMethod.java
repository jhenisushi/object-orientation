package javacore.f.other.enumclass.domain;

public enum PaymentMethod {
    // method overriding

    CASH {
        @Override
        public String toString() {
            return "Cash";
        }

        @Override
        public double discount(double value) {
            return value * 0.2;
        }
    },

    DEBIT_CARD {
        @Override
        public String toString() {
            return "Debit Card";
        }

        @Override
        public double discount(double value) {
            return value * 0.1;
        }
    },

    CREDIT_CARD {
        @Override
        public String toString() {
            return "Credit Card";
        }

        @Override
        public double discount(double value) {
            return value * 0.05;
        }
    };

    public abstract double discount(double value);
}
