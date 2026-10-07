package org.example;

public class VoiceMessage extends MessageType {
    public VoiceMessage(DeliveryChannel deliveryChannel) {
        super(deliveryChannel);
    }
    @Override
    public void send(String message) {
        deliveryChannel.deliver("Voice message: " + message);
    }
}
