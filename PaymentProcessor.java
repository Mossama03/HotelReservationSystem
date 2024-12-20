
package com.hotel;

public class PaymentProcessor {
    private static PaymentProcessor instance;

    private PaymentProcessor() {}

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of: $" + amount);
    }
}
