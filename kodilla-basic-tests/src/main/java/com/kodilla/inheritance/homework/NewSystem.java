package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Turning on the new system");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the new system");
    }

    public NewSystem(int year) {
        super(year);
        System.out.println("Release of the new system: ");
    }
}
