package org.example;

public class DroneDelivery implements DeliveryChannel {
    @Override
    public void deliver(String message) {
        System.out.println("Drone delivers: " + message);
    }
}
