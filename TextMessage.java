package org.example;

public class TextMessage extends MessageType {
    public TextMessage(DeliveryChannel deliveryChannel) {
        super(deliveryChannel);
    }
    @Override
    public void send(String message) {
        deliveryChannel.deliver("Text message: " + message);
    }
}
