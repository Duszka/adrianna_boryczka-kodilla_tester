package com.kodilla.inheritance.homework;

public class SystemApplication {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOn();

        NewSystem newSystem = new NewSystem(2020);
        newSystem.displayReleaseYear();

        PreviousSystem previousSystem = new PreviousSystem(2015);
        previousSystem.displayReleaseYear();
        previousSystem.turnOff();
    }
}
