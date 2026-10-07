package org.example;

public class CarrierPigeon implements DeliveryChannel {

    @Override
    public void deliver(String message) {
        System.out.println("Carrier pigeon delivers: " + message);
    }
}
