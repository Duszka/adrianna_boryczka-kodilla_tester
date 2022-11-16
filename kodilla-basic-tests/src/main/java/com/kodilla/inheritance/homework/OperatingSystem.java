package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning on");
    }

    public void turnOff() {
        System.out.println("Turning off");
    }

    public void displayReleaseYear() {System.out.println("Year: " + year);}

    public int getYear() {
        return year;
    }
}
