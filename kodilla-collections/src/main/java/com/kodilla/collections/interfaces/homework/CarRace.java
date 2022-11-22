package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(0, 80, 30);
        doRace(mercedes);

        Renault renault = new Renault(0, 55, 25);
        doRace(renault);

        Nissan nissan = new Nissan(0, 70, 45);
        doRace(nissan);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("The speed is: " + car.getSpeed() + "km/h.");
    }
}
