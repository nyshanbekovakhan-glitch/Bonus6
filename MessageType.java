package org.example;

public abstract class MessageType {
    protected DeliveryChannel deliveryChannel;
    public MessageType(DeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }
    public abstract void send(String message);
}