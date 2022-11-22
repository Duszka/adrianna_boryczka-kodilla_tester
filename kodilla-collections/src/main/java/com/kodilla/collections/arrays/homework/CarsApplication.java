package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;
import java.util.Scanner;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)+1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
        }

    public static Car drawCar() {
        int drawnCarBrand = random.nextInt(3);
        int accelerate = random.nextInt(81);
        int decelerate = random.nextInt(46);
        if (drawnCarBrand == 0)
            return new Mercedes(0, accelerate,decelerate);
        else if (drawnCarBrand == 1)
            return new Renault(0, accelerate,decelerate);
        else {
            return new Nissan(0, accelerate,decelerate);
        }
    }
}
