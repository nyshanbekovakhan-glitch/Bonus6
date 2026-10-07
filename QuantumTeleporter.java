package org.example;

public class QuantumTeleporter implements DeliveryChannel {

    @Override
    public void deliver(String message) {
        System.out.println("Quantum teleporter delivers: " + message);
    }
}
