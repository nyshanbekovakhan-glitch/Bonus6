# The Multiverse Messenger

Name: Khanzada Nyshanbek Adilqyzy
Group: SE-2539
Pattern: Bridge
Task: Bonus Task 20
## Description
This project demonstrates the Bridge Design Pattern.
The system has two message types:

* TextMessage
* VoiceMessage

And two delivery channels:

* CarrierPigeon
* QuantumTeleporter

The Bridge pattern separates the message type from the delivery channel.

## Structure

`MessageType` is the abstraction.

`TextMessage` and `VoiceMessage` are refined abstractions.

`DeliveryChannel` is the implementor.

`CarrierPigeon`, `QuantumTeleporter` and `DroneDelivery` are concrete implementors.

## Four combinations

The project has all four required combinations:

1. TextMessage + CarrierPigeon
2. TextMessage + QuantumTeleporter
3. VoiceMessage + CarrierPigeon
4. VoiceMessage + QuantumTeleporter

## Third delivery channel

I also added `DroneDelivery`.

It was added without changing `TextMessage` or `VoiceMessage`.

This shows that the message types and delivery channels can change independently.

## Why Bridge?

Bridge is useful because it separates two different parts of the system.

Without Bridge, we could need many classes such as:

* TextViaPigeon
* TextViaTeleporter
* VoiceViaPigeon
* VoiceViaTeleporter

With Bridge, we can combine message types and delivery channels easily.

## SOLID

This design supports the Open/Closed Principle.

We can add a new delivery channel without changing the existing message classes.

## Tests

There are 4 JUnit tests.

They test all four message and delivery combinations.

All tests pass.

## Technologies

* Java 25
* Maven
* JUnit 5
* IntelliJ IDEA
* Bridge Design Pattern
