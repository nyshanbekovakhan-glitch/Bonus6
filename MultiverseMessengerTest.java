package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiverseMessengerTest {
    static class TestDeliveryChannel implements DeliveryChannel {
        private String lastMessage;
        @Override
        public void deliver(String message) {
            lastMessage = message;
        }
        public String getLastMessage() {
            return lastMessage;
        }
    }
    @Test
    void textMessageWithCarrierPigeon() {
        TestDeliveryChannel pigeon = new TestDeliveryChannel();
        MessageType message = new TextMessage(pigeon);
        message.send("Hello");
        assertEquals("Text message: Hello", pigeon.getLastMessage());
    }
    @Test
    void textMessageWithQuantumTeleporter() {
        TestDeliveryChannel teleporter = new TestDeliveryChannel();
        MessageType message = new TextMessage(teleporter);
        message.send("Hello");
        assertEquals("Text message: Hello", teleporter.getLastMessage());
    }
    @Test
    void voiceMessageWithCarrierPigeon() {
        TestDeliveryChannel pigeon = new TestDeliveryChannel();
        MessageType message = new VoiceMessage(pigeon);
        message.send("Hello");
        assertEquals("Voice message: Hello", pigeon.getLastMessage());
    }
    @Test
    void voiceMessageWithQuantumTeleporter() {
        TestDeliveryChannel teleporter = new TestDeliveryChannel();
        MessageType message = new VoiceMessage(teleporter);
        message.send("Hello");
        assertEquals("Voice message: Hello", teleporter.getLastMessage());
    }
}
