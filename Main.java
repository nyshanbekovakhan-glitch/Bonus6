package org.example;

public class Main {

    public static void main(String[] args) {

        DeliveryChannel pigeon = new CarrierPigeon();
        DeliveryChannel teleporter = new QuantumTeleporter();

        MessageType textWithPigeon = new TextMessage(pigeon);
        MessageType textWithTeleporter = new TextMessage(teleporter);

        MessageType voiceWithPigeon = new VoiceMessage(pigeon);
        MessageType voiceWithTeleporter = new VoiceMessage(teleporter);

        textWithPigeon.send("Hello from the multiverse!");
        textWithTeleporter.send("Hello from the future!");

        voiceWithPigeon.send("Meet me at the portal.");
        voiceWithTeleporter.send("The mission has started.");
        DeliveryChannel drone = new DroneDelivery();

        MessageType textWithDrone = new TextMessage(drone);
        MessageType voiceWithDrone = new VoiceMessage(drone);

        textWithDrone.send("Message from another universe.");
        voiceWithDrone.send("Emergency voice message.");
    }
}
