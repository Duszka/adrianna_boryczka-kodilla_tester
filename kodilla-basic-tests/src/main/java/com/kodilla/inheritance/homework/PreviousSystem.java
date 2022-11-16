package com.kodilla.inheritance.homework;

public class PreviousSystem extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Turning on the previous system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the previous system");
    }

    public PreviousSystem(int year) {
        super(year);
        System.out.println("Release of the previous system: ");
    }
}
